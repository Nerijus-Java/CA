/**
 * Application form shows how two timer works parallelly
 */
package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.util.Duration;

public class Controller {
    private final String STARTED = "Started";
    private String tmpText;

    public Button btnStart;

    private enum BtnClickStatus {BtnClicked, BtnUnclicked}

    ;
    private BtnClickStatus btnStartThreadClickStatus = BtnClickStatus.BtnUnclicked;

    public ProgressBar progressBar1;
    public ProgressBar progressBar2;

    private Timeline timeline1;
    private Timeline timeline2;

    private void setProgress(ProgressBar progress, boolean calcCount) {
        double lastProgressValue = progress.getProgress();
        progress.setProgress(((lastProgressValue > 1.00) ? 0.00 : lastProgressValue + 0.01));
        if (calcCount) {
            // make a load
            double k = 0;
            for (int i = 0; i < 80000; i++)
                for (int j = 0; j < 80000; j++) {
                    for (int z = 0; z < 80000; z++) {
                        k = Math.sqrt(z) * 100;
                        k = ((Math.sqrt(k) * 100) + 20) * 10;
                    }
                }
        }

    }

    public void btnStartClick(ActionEvent actionEvent) {
        if (btnStartThreadClickStatus.equals(BtnClickStatus.BtnUnclicked)) {
            timeline1 = new Timeline(new KeyFrame(
                    Duration.millis(10),
                    ae -> setProgress(this.progressBar1, false)));
            timeline1.setCycleCount(Animation.INDEFINITE);

            timeline2 = new Timeline(new KeyFrame(
                    Duration.millis(1),
                    ae -> setProgress(this.progressBar2, true)));
            timeline2.setCycleCount(Animation.INDEFINITE);
        }

        if (btnStartThreadClickStatus.equals(BtnClickStatus.BtnClicked)) {
            btnStart.setText(this.tmpText);
            timeline1.stop();
            timeline2.stop();
            btnStartThreadClickStatus = BtnClickStatus.BtnUnclicked;
        } else {
            this.tmpText = btnStart.getText();
            timeline1.play();
            timeline2.play();
            btnStart.setText(this.tmpText + " " + this.STARTED);
            btnStartThreadClickStatus = BtnClickStatus.BtnClicked;
        }
    }
}
