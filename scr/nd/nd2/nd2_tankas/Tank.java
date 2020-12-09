package nd.nd2.nd2_tankas;

public class Tank {
    private int positionA;
    private int positionB;
    private int shotsFired;
    private String face;

    public Tank(int positionA, int positionB, int shotsFired, String face) {
        this.positionA = positionA;
        this.positionB = positionB;
        this.shotsFired = shotsFired;
        this.face = face;
    }

    public void moveForward(){
        this.positionA++;
        this.face = "North";
    }

    public void moveBackwards(){
        this.positionA--;
        this.face = "South";
    }

    public void moveLeft(){
        this.positionB--;
        this.face = "West";
    }

    public void moveRight(){
        this.positionB++;
        this.face = "East";
    }

    public void restart(){
        this.positionA = 0;
        this.positionB = 0;
    }

    public String fire(){
        this.shotsFired++;
        switch (this.face){
            case "North":
                return "Shot to North";

            case "South":
                return "Shot to South";

            case"West":
                return "Shot to West";

            case "East":
                return "Shot to East";

            default:
                return "You have not moved yet";
        }
    }

    public int getPositionA() {
        return positionA;
    }

    public int getPositionB() {
        return positionB;
    }

    public int getShotsFired() {
        return shotsFired;
    }

    public String getFace() {
        return face;
    }
}

