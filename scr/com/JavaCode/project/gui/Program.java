package com.JavaCode.project.gui;

import com.JavaCode.project.Payments.PaymentCollection;
import com.JavaCode.project.Payments.PaymentsFileWriter;
import com.JavaCode.project.Payments.Printer;
import com.JavaCode.project.catagory.CatagoryHelper;
import com.JavaCode.project.user.User;

import javax.swing.*;

public class Program {

    //Main
    private JPanel mainPanel;
    private JButton getCheckButton;

    //Income
    private JPanel incomesPanel;
    private JButton buttonIncome;
    private JCheckBox taxesCheckBoxIncome;
    private JCheckBox transferToBalanceCheckBoxIncome;
    private JComboBox incomeChoose;
    private JTextField amountBoxIncome;
    private JButton addButtonIncome;

    //Costs
    private JPanel costsPanel;
    private JButton buttonCosts;
    private JButton addButtonCosts;
    private JTextField amountTextFieldCost;
    private JCheckBox hiddenCheckBox;

    //Balance
    private JTextField amountTextField;
    private JButton buttonBalance;
    private JPanel balancePanel;

    //checks
    private JPanel getCheckPanel;
    private JComboBox checkPrintChoose;
    private JComboBox costChoose;
    private JButton reloadButton;
    private JTextArea checkTextArea;
    private JButton mostButton;
    private JPanel mostPanel;
    private JTextField pathTextField;
    private JButton exportButton1;
    private JButton exportButtonToolBar;
    private JPanel exportPanel;
    private JLabel mostSpentCostsLabel;
    private JLabel leastSpentCost;
    private JLabel mostGotIncome;
    private JLabel leastGotIncome;
    private JTextField monthTextField;
    private JTextField yearTextField;

    //Helpers and other classes
    private final PaymentCollection payments;
    private final CatagoryHelper catagoryHelper;
    private final User loggedInUser;
    private final Printer printer = new Printer();;

    public Program(PaymentCollection payments, CatagoryHelper catagoryHelper,
                   PaymentsFileWriter paymentsFileWriter, User user) {

        this.payments = payments;
        this.catagoryHelper = catagoryHelper;
        this.loggedInUser = user;

        makeListenersForToolBar();
        startingVisibility();
        buttonListeners(this.payments, paymentsFileWriter);

    }

    private void buttonListeners(PaymentCollection payments, PaymentsFileWriter paymentsFileWriter) {

        getCheckButton.addActionListener(e -> {
            System.out.println(printer.printAllPaymentsMenu(payments.getPayments()));
            checkTextArea.setText(printer.printAllPaymentsMenu(payments.getPayments()));
        });

        reloadButton.addActionListener(e -> {
            int num = checkPrintChoose.getSelectedIndex();
            switch (num){
                case 0:
                    checkTextArea.setText(printer.printAllPaymentsMenu(payments.getPayments()));
                    break;
                case 1:
                    checkTextArea.setText(printer.printPaymentFromThisMonth(payments.getPayments()));
                    break;
                case 2:
                    checkTextArea.setText(printer.printPaymentFromThisYear(payments.getPayments()));
                    break;
                case 3:
                    checkTextArea.setText(printer.printIncomesPayment(payments.getPayments()));
                    break;
                case 4:
                    checkTextArea.setText(printer.printCostPayment(payments.getPayments()));
                    break;
            }
        });


        exportButton1.addActionListener(e -> paymentsFileWriter.export(payments.getPayments(), pathTextField.getText()));
    }

    private void startingVisibility() {
        incomesPanel.setVisible(true);
        costsPanel.setVisible(false);
        balancePanel.setVisible(false);
        getCheckPanel.setVisible(false);
        mostPanel.setVisible(false);
        exportPanel.setVisible(false);
    }

    private void makeListenersForToolBar() {

        exportButtonToolBar.addActionListener(e -> {
            exportPanel.setVisible(true);
            mostPanel.setVisible(false);
            incomesPanel.setVisible(false);
            costsPanel.setVisible(false);
            balancePanel.setVisible(false);
            getCheckPanel.setVisible(false);
        });

        mostButton.addActionListener(e -> {
            mostPanel.setVisible(true);
            incomesPanel.setVisible(false);
            costsPanel.setVisible(false);
            balancePanel.setVisible(false);
            getCheckPanel.setVisible(false);
            exportPanel.setVisible(false);

            leastSpentCost.setText(catagoryHelper.getMostCostCatagory().getName() +
                    "   amount: " + catagoryHelper.getMostCostCatagory().getAmount());

            mostSpentCostsLabel.setText(catagoryHelper.getLowestCostCatagory().getName() +
                    "   amount: " + catagoryHelper.getLowestCostCatagory().getAmount());

            mostGotIncome.setText(catagoryHelper.getHighestIncomeCatagory().getName() +
                    "   amount: " + catagoryHelper.getHighestIncomeCatagory().getAmount());

            leastGotIncome.setText(catagoryHelper.getLowestIncomeCatagory().getName() +
                    "   amount: " + catagoryHelper.getLowestIncomeCatagory().getAmount());
        });

        buttonCosts.addActionListener(e -> {
            incomesPanel.setVisible(false);
            costsPanel.setVisible(true);
            balancePanel.setVisible(false);
            getCheckPanel.setVisible(false);
            mostPanel.setVisible(false);
            exportPanel.setVisible(false);
        });

        buttonIncome.addActionListener(e -> {
            incomesPanel.setVisible(true);
            costsPanel.setVisible(false);
            balancePanel.setVisible(false);
            getCheckPanel.setVisible(false);
            mostPanel.setVisible(false);
            exportPanel.setVisible(false);
        });

        buttonBalance.addActionListener(e -> {
            amountTextField.setText(loggedInUser.getBalance() + "");
            incomesPanel.setVisible(false);
            costsPanel.setVisible(false);
            balancePanel.setVisible(true);
            getCheckPanel.setVisible(false);
            mostPanel.setVisible(false);
            exportPanel.setVisible(false);
        });

        getCheckButton.addActionListener(e -> {
            incomesPanel.setVisible(false);
            costsPanel.setVisible(false);
            balancePanel.setVisible(false);
            getCheckPanel.setVisible(true);
            mostPanel.setVisible(false);
            exportPanel.setVisible(false);
        });

        addButtonIncome.addActionListener(e -> {
            if (amountBoxIncome.getText() != null && !amountBoxIncome.getText().equals("Amount")){
                loggedInUser.setBalance(loggedInUser.getBalance() + Integer.parseInt(amountBoxIncome.getText()));

                catagoryHelper.getCatagory(incomeChoose.getSelectedIndex())
                        .setAmount(catagoryHelper.getCatagory(incomeChoose.getSelectedIndex())
                                .getAmount() + Integer.parseInt(amountBoxIncome.getText()) );

                payments.addIncome(catagoryHelper.getCatagory(incomeChoose.getSelectedIndex()) ,
                        Integer.parseInt(amountBoxIncome.getText())
                        ,transferToBalanceCheckBoxIncome.isSelected(),taxesCheckBoxIncome.isSelected());
            }
        });

        addButtonCosts.addActionListener(e -> {
            if ( amountTextFieldCost.getText() != null && !amountTextFieldCost.getText().equals("Amount")){

                loggedInUser.setBalance(loggedInUser.getBalance() - Integer.parseInt(amountTextFieldCost.getText()));
                catagoryHelper.getCatagory(costChoose.getSelectedIndex() + 7)
                        .setAmount(catagoryHelper.getCatagory(costChoose.getSelectedIndex() + 7)
                                .getAmount() - Integer.parseInt(amountTextFieldCost.getText()) );

                payments.addCosts(catagoryHelper.getCatagory(costChoose.getSelectedIndex() + 7),
                        Integer.parseInt(amountTextFieldCost.getText()),hiddenCheckBox.isSelected());
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
