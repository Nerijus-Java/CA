package com.JavaCode.project.jframes;

import com.JavaCode.project.Payments.PaymentCollection;
import com.JavaCode.project.Payments.PaymentsFileReader;
import com.JavaCode.project.catagory.CatagoryHelper;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program {

    private JButton buttonIncome;
    private JPanel mainPanel;
    private JButton buttonCosts;
    private JButton buttonBalance;
    private JButton getCheckButton;
    private JPanel incomesPanel;
    private JCheckBox taxesCheckBoxIncome;
    private JCheckBox transferToBalanceCheckBoxIncome;
    private JComboBox incomeChoose;
    private JTextField amountBoxIncome;
    private JButton addButtonIncome;
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

    private PaymentCollection payments;
    private CatagoryHelper catagoryHelper;
    private PaymentsFileReader paymentsFileReader;


    public Program(PaymentCollection payments, CatagoryHelper catagoryHelper, PaymentsFileReader paymentsFileReader) {
        startingVisibility();
        makeListenersForToolBar();


    }

    private void addButtonIncomeListerners(){
        addButtonIncome.addActionListener(new ActionListener() {
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
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setIncomesPanel(JPanel incomesPanel) {
        this.incomesPanel = incomesPanel;
    }
}
