package com.JavaCode.project.gui;

import com.JavaCode.project.Payments.PaymentCollection;
import com.JavaCode.project.Payments.Printer;
import com.JavaCode.project.catagory.CatagoryHelper;
import com.JavaCode.project.model.User;

import javax.swing.*;
import java.sql.SQLException;

public class ActionListenerHelper {

    private final CatagoryHelper catagoryHelper;
    private final User loggedInUser;
    private final PaymentCollection paymentCollection;

//    private final PaymentsFileWriter paymentsFileWriter;
//    private final PaymentsFileReader paymentsFileReader;

    public ActionListenerHelper(CatagoryHelper catagoryHelper, User loggedInUser,
                                PaymentCollection paymentCollection) {
        this.catagoryHelper = catagoryHelper;
        this.loggedInUser = loggedInUser;
        this.paymentCollection = paymentCollection;
//        this.paymentsFileWriter = pFW;
//        this.paymentsFileReader = pFR;
    }

    public void exportButtonAL(){
//        FileChooser fileChooser = new FileChooser();
//        paymentsFileWriter.export(paymentCollection.getPayments(), fileChooser.fileChoose().getPath());
    }

    public void newButtonAL(){
//        loggedInUser.setBalance(0);
//        catagoryHelper.resetCategories();
//        paymentCollection.resetArray();
//        paymentsFileWriter.resetFile(paymentCollection.getPayments());
    }

    public void openButtonAL(){
//        FileChooser fileChooser = new FileChooser();
//        loggedInUser.setBalance(0);
//        catagoryHelper.resetCategories();
//        paymentCollection.resetArray();
//        paymentsFileReader.readNewFile(fileChooser.fileChoose().getPath());
    }

    public void reloadButtonAL(JComboBox checkPrintChoose, JTextArea checkTextArea,
                               Printer printer, JTextField monthTextField,
                               JTextField yearTextField) {
        int index = checkPrintChoose.getSelectedIndex();
        switch (index) {
            case 0:
                checkTextArea.setText(printer.printAllPaymentsMenu(paymentCollection.getPayments()));
                break;
            case 1:
                checkTextArea.setText(printer.printPaymentFromThisMonth(paymentCollection.getPayments()));
                break;
            case 2:
                checkTextArea.setText(printer.printPaymentFromThisYear(paymentCollection.getPayments()));
                break;
            case 3:
                checkTextArea.setText(printer.printIncomesPayment(paymentCollection.getPayments()));
                break;
            case 4:
                checkTextArea.setText(printer.printCostPayment(paymentCollection.getPayments()));
                break;
            case 5:
                checkTextArea.setText(printer.printPaymentFromChosenMonth(paymentCollection.getPayments(),
                        Integer.parseInt(monthTextField.getText())));
                break;
            case 6:
                checkTextArea.setText(printer.printPaymentChosenYear(paymentCollection.getPayments(),
                        Integer.parseInt(yearTextField.getText())));
            case 7:
                checkTextArea.setText(printer.printPaymentFromChosenMonthAndYear(paymentCollection.getPayments(),
                        Integer.parseInt(monthTextField.getText()),Integer.parseInt(yearTextField.getText())));
                break;
        }
    }

    public void toolbarVisibilityAL(JPanel exportPanel, JPanel mostPanel, JPanel incomesPanel, JPanel costsPanel,
                                    JPanel balancePanel, JPanel getCheckPanel, JPanel panelChosen) {
        resetPanels(exportPanel, mostPanel, incomesPanel, costsPanel, balancePanel, getCheckPanel);
        panelChosen.setVisible(true);
    }

    public void mostTextAL(JLabel leastSpentCost, JLabel mostSpentCostsLabel, JLabel mostGotIncome,
                           JLabel leastGotIncome) {
        leastSpentCost.setText(catagoryHelper.getMostCostCatagory().getName() +
                "   amount: " + catagoryHelper.getMostCostCatagory().getAmount());

        mostSpentCostsLabel.setText(catagoryHelper.getLowestCostCatagory().getName() +
                "   amount: " + catagoryHelper.getLowestCostCatagory().getAmount());

        mostGotIncome.setText(catagoryHelper.getHighestIncomeCatagory().getName() +
                "   amount: " + catagoryHelper.getHighestIncomeCatagory().getAmount());

        leastGotIncome.setText(catagoryHelper.getLowestIncomeCatagory().getName() +
                "   amount: " + catagoryHelper.getLowestIncomeCatagory().getAmount());
    }




    public void addCostAL(JTextField amountTextFieldCost, JComboBox costChoose, JCheckBox hiddenCheckBox)  {
        if (amountTextFieldCost.getText() != null && !amountTextFieldCost.getText().equals("Amount")) {

            loggedInUser.setBalance(loggedInUser.getBalance() - Integer.parseInt(amountTextFieldCost.getText()));
            catagoryHelper.getCatagory(costChoose.getSelectedIndex() + 7)
                    .setAmount(catagoryHelper.getCatagory(costChoose.getSelectedIndex() + 7)
                            .getAmount() - Integer.parseInt(amountTextFieldCost.getText()));
            try {
                paymentCollection.addCosts(catagoryHelper.getCatagory(costChoose.getSelectedIndex() + 7),
                        Integer.parseInt(amountTextFieldCost.getText()), hiddenCheckBox.isSelected(),loggedInUser);
            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
        }
    }

    public void addInAL(JTextField amountBoxIncome, JCheckBox transferToBalanceCheckBoxIncome,
                        JComboBox incomeChoose, JCheckBox taxesCheckBoxIncome)  {
        if (amountBoxIncome.getText() != null && !amountBoxIncome.getText().equals("Amount")) {
            loggedInUser.setBalance(loggedInUser.getBalance() + Integer.parseInt(amountBoxIncome.getText()));

            catagoryHelper.getCatagory(incomeChoose.getSelectedIndex())
                    .setAmount(catagoryHelper.getCatagory(incomeChoose.getSelectedIndex())
                            .getAmount() + Integer.parseInt(amountBoxIncome.getText()));
            try {
                paymentCollection.addIncome(catagoryHelper.getCatagory(incomeChoose.getSelectedIndex()),
                        Integer.parseInt(amountBoxIncome.getText())
                        , transferToBalanceCheckBoxIncome.isSelected(), taxesCheckBoxIncome.isSelected(), loggedInUser);
            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
        }
    }



    private void resetPanels(JPanel exportPanel, JPanel mostPanel, JPanel incomesPanel, JPanel costsPanel
            , JPanel balancePanel, JPanel getCheckPanel) {
        exportPanel.setVisible(false);
        mostPanel.setVisible(false);
        incomesPanel.setVisible(false);
        costsPanel.setVisible(false);
        balancePanel.setVisible(false);
        getCheckPanel.setVisible(false);
    }
}
