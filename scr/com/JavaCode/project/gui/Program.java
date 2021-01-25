package com.JavaCode.project.gui;

import com.JavaCode.project.Payments.PaymentCollection;
import com.JavaCode.project.Payments.PaymentsFileWriter;
import com.JavaCode.project.Payments.Printer;
import com.JavaCode.project.catagory.CatagoryCollection;
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
    private final User loggedInUser;
    private final Printer printer = new Printer();
    private final ActionListenerHelper aLHelper;


    public Program(PaymentCollection paymentCollection, PaymentsFileWriter paymentsFileWriter,
                   User user, CatagoryCollection catagoryCollection) {
        this.loggedInUser = user;
        CatagoryHelper catagoryHelper = new CatagoryHelper(catagoryCollection);
        this.aLHelper = new ActionListenerHelper(catagoryHelper, user, paymentCollection);

        makeListenersForToolBar();
        startingVisibility();
        buttonListeners(paymentCollection, paymentsFileWriter);
    }

    private void buttonListeners(PaymentCollection payments, PaymentsFileWriter paymentsFileWriter) {

        getCheckButton.addActionListener(e -> {
            System.out.println(printer.printAllPaymentsMenu(payments.getPayments()));
            checkTextArea.setText(printer.printAllPaymentsMenu(payments.getPayments()));
        });

        reloadButton.addActionListener(e -> aLHelper.reloadButtonAL(checkPrintChoose, checkTextArea, printer,
                monthTextField, yearTextField));

        exportButton1.addActionListener(e -> paymentsFileWriter.export(payments.getPayments(), pathTextField.getText()));
    }

    private void makeListenersForToolBar() {
        mostButton.addActionListener(e -> {
            aLHelper.toolbarVisibilityAL(exportPanel, mostPanel, incomesPanel, costsPanel, balancePanel, getCheckPanel
                    , mostPanel);

            aLHelper.mostTextAL(leastSpentCost, mostSpentCostsLabel, mostGotIncome, leastGotIncome);
        });

        exportButtonToolBar.addActionListener(e -> aLHelper.toolbarVisibilityAL(exportPanel, mostPanel,
                incomesPanel, costsPanel, balancePanel, getCheckPanel, exportPanel));

        buttonCosts.addActionListener(e -> aLHelper.toolbarVisibilityAL(exportPanel, mostPanel, incomesPanel
                , costsPanel, balancePanel, getCheckPanel, costsPanel));

        buttonIncome.addActionListener(e -> aLHelper.toolbarVisibilityAL(exportPanel, mostPanel, incomesPanel
                , costsPanel, balancePanel, getCheckPanel, incomesPanel));

        getCheckButton.addActionListener(e -> aLHelper.toolbarVisibilityAL(exportPanel, mostPanel, incomesPanel
                , costsPanel, balancePanel, getCheckPanel, getCheckPanel));

        addButtonIncome.addActionListener(e -> aLHelper.addInAL(amountBoxIncome, transferToBalanceCheckBoxIncome
                , incomeChoose, taxesCheckBoxIncome));

        addButtonCosts.addActionListener(e -> aLHelper.addCostAL(amountTextFieldCost, costChoose, hiddenCheckBox));

        buttonBalance.addActionListener(e -> {
            amountTextField.setText(loggedInUser.getBalance() + "");
            aLHelper.toolbarVisibilityAL(exportPanel, mostPanel, incomesPanel, costsPanel, balancePanel, getCheckPanel
                    , balancePanel);
        });
    }

    private void startingVisibility() {
        incomesPanel.setVisible(true);
        costsPanel.setVisible(false);
        balancePanel.setVisible(false);
        getCheckPanel.setVisible(false);
        mostPanel.setVisible(false);
        exportPanel.setVisible(false);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
