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
    private JTable checksTable;

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

        getCheckButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

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
                payments.addIncome(catagoryHelper.getCatagory(costChoose.getSelectedIndex()) ,
                        Integer.parseInt(amountBoxIncome.getText())
                        ,transferToBalanceCheckBoxIncome.isSelected(),taxesCheckBoxIncome.isSelected());
            }
        });

        addButtonCosts.addActionListener(e -> {
            if ( amountTextFieldCost.getText() != null && !amountTextFieldCost.getText().equals("Amount")){
                payments.addCosts(catagoryHelper.getCatagory(costChoose.getSelectedIndex()),
                        Integer.parseInt(amountTextFieldCost.getText()),hiddenCheckBox.isSelected());
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

}
