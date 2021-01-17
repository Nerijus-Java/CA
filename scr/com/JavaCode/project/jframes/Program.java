package com.JavaCode.project.jframes;

import com.JavaCode.project.Payments.PaymentCollection;
import com.JavaCode.project.Payments.PaymentsFileReader;
import com.JavaCode.project.Payments.Printer;
import com.JavaCode.project.catagory.CatagoryHelper;
import com.JavaCode.project.user.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton saveButtonCheck;
    private JButton openFileButtonCheck;
    private JComboBox checkPrintChoose;
    private JComboBox costChoose;
    private JButton reloadButton;
    private JTextArea checkTextArea;

    //Helpers and other classes
    private PaymentCollection payments;
    private CatagoryHelper catagoryHelper;
    private PaymentsFileReader paymentsFileReader;
    private User loggedInUser;
    private Printer printer;

    public Program(PaymentCollection payments, CatagoryHelper catagoryHelper, PaymentsFileReader paymentsFileReader, User user) {
        startingVisibility();
        makeListenersForToolBar();

        this.payments = payments;
        this.catagoryHelper = catagoryHelper;
        this.paymentsFileReader = paymentsFileReader;
        this.loggedInUser = user;
        this.printer = new Printer();

        getCheckButton.addActionListener(e -> {
            System.out.println(printer.printAllPaymentsMenu(payments.getPayments()));
            checkTextArea.setText(printer.printAllPaymentsMenu(payments.getPayments()));
        });
        reloadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
            }
        });
    }

    private void startingVisibility() {
        incomesPanel.setVisible(true);
        costsPanel.setVisible(false);
        balancePanel.setVisible(false);
        getCheckPanel.setVisible(false);
    }

    private void makeListenersForToolBar() {
        buttonCosts.addActionListener(e -> {
            incomesPanel.setVisible(false);
            costsPanel.setVisible(true);
            balancePanel.setVisible(false);
            getCheckPanel.setVisible(false);
        });

        buttonIncome.addActionListener(e -> {
            incomesPanel.setVisible(true);
            costsPanel.setVisible(false);
            balancePanel.setVisible(false);
            getCheckPanel.setVisible(false);
        });

        buttonBalance.addActionListener(e -> {
            amountTextField.setText(loggedInUser.getBalance() + "");
            incomesPanel.setVisible(false);
            costsPanel.setVisible(false);
            balancePanel.setVisible(true);
            getCheckPanel.setVisible(false);
        });

        getCheckButton.addActionListener(e -> {
            incomesPanel.setVisible(false);
            costsPanel.setVisible(false);
            balancePanel.setVisible(false);
            getCheckPanel.setVisible(true);
        });

        addButtonIncome.addActionListener(e -> {
            if (amountBoxIncome.getText() != null && !amountBoxIncome.getText().equals("Amount")){
                loggedInUser.setBalance(loggedInUser.getBalance() + Integer.parseInt(amountBoxIncome.getText()));
                payments.addIncome(catagoryHelper.getCatagory(incomeChoose.getSelectedIndex()) ,
                        Integer.parseInt(amountBoxIncome.getText())
                        ,transferToBalanceCheckBoxIncome.isSelected(),taxesCheckBoxIncome.isSelected());
            }
        });

        addButtonCosts.addActionListener(e -> {
            if ( amountTextFieldCost.getText() != null && !amountTextFieldCost.getText().equals("Amount")){
                int number = Integer.parseInt(amountBoxIncome.getText());
                loggedInUser.setBalance(loggedInUser.getBalance() - number);
                payments.addCosts(catagoryHelper.getCatagory(costChoose.getSelectedIndex() + 7),
                        Integer.parseInt(amountTextFieldCost.getText()),hiddenCheckBox.isSelected());
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

}
