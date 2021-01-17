package com.JavaCode.project.jframes;

import com.JavaCode.project.Payments.PaymentCollection;
import com.JavaCode.project.Payments.PaymentsFileReader;
import com.JavaCode.project.catagory.CatagoryHelper;

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


    private JButton buttonCosts;
    private JButton buttonBalance;
    private JButton addButtonCosts;
    private JComboBox comboBox2;
    private JPanel costsPanel;
    private JCheckBox hiddenCheckBox;
    private JTextField amountTextField;
    private JPanel balancePanel;
    private JTextField amountTextField1;
    private JPanel getCheckPanel;
    private JButton saveButtonCheck;
    private JButton openFileButtoncheck;
    private JComboBox checkPrintChoose;
    private JLabel Checks;

    //Helpers and other classes
    private PaymentCollection payments;
    private CatagoryHelper catagoryHelper;
    private PaymentsFileReader paymentsFileReader;
    private JPanelHelper jPanelHelper;


    public Program(PaymentCollection payments, CatagoryHelper catagoryHelper, PaymentsFileReader paymentsFileReader) {
        startingVisibility();
        makeListenersForToolBar();


    }

    private void makeIncomeChoose(){

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
            if ( amountBoxIncome.getText() != null && amountBoxIncome.getText() != "Amount"){
                payments.addIncome(catagoryHelper.getCatagory(incomeChoose.getSelectedIndex()),
                        Integer.parseInt(amountBoxIncome.getText())
                        ,transferToBalanceCheckBoxIncome.isSelected()
                        ,taxesCheckBoxIncome.isSelected());
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setIncomesPanel(JPanel incomesPanel) {
        this.incomesPanel = incomesPanel;
    }
}
