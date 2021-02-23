package com.JavaCode.project.gui;

import com.JavaCode.project.collection.PaymentCollection;
import com.JavaCode.project.Payments.Printer;
import com.JavaCode.project.collection.CatagoryCollection;
import com.JavaCode.project.catagory.CatagoryHelper;
import com.JavaCode.project.database.DatabaseMethods;
import com.JavaCode.project.model.User;

import javax.swing.*;
import java.sql.SQLException;

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
    private JPanel checkPanel;
    private JComboBox checkPrintChoose;
    private JComboBox costChoose;
    private JButton reloadButton;
    private JTextArea checkTextArea;
    private JButton mostButton;
    private JPanel mostPanel;
    private JTextField monthTextField;
    private JTextField yearTextField;

    //Most
    private JLabel mostSpentCostsLabel;
    private JLabel leastSpentCost;
    private JLabel mostGotIncome;
    private JLabel leastGotIncome;

    //Options
    private JButton openButton;
    private JButton exportButton1;
    private JButton optionsButtonToolBar;
    private JPanel exportPanel;
    private JButton newButton;

    //Helpers and other classes
    private final User loggedInUser;
    private final Printer printer = new Printer();
    private final ActionListenerHelper aLHelper;
    private final DatabaseMethods databaseMethods;

    public Program(PaymentCollection paymentCollection,
                   User user, CatagoryCollection catagoryCollection,DatabaseMethods databaseMethods) {
        this.loggedInUser = user;
        this.databaseMethods = databaseMethods;
        CatagoryHelper catagoryHelper = new CatagoryHelper(catagoryCollection);
        this.aLHelper = new ActionListenerHelper(catagoryHelper, user, paymentCollection, databaseMethods);

        makeListenersForToolBar();
        startingVariables();
        buttonListeners(paymentCollection);
    }

    private void buttonListeners(PaymentCollection payments) {
        getCheckButton.addActionListener(e -> {
            System.out.println(printer.printAllPaymentsMenu(payments.getPayments()));
            checkTextArea.setText(printer.printAllPaymentsMenu(payments.getPayments()));
        });

        reloadButton.addActionListener(e -> aLHelper.reloadButtonAL(checkPrintChoose, checkTextArea, printer,
                monthTextField, yearTextField));

        exportButton1.addActionListener(e -> aLHelper.exportButtonAL());
        openButton.addActionListener(e -> aLHelper.openButtonAL());
        newButton.addActionListener(e -> aLHelper.newButtonAL());
    }

    private void makeListenersForToolBar() {
        mostButton.addActionListener(e -> {
            aLHelper.toolbarVisibilityAL(exportPanel, mostPanel, incomesPanel, costsPanel, balancePanel, checkPanel
                    , mostPanel);

            aLHelper.mostTextAL(leastSpentCost, mostSpentCostsLabel, mostGotIncome, leastGotIncome);
        });

        optionsButtonToolBar.addActionListener(e -> aLHelper.toolbarVisibilityAL(exportPanel, mostPanel,
                incomesPanel, costsPanel, balancePanel, checkPanel, exportPanel));

        buttonCosts.addActionListener(e -> aLHelper.toolbarVisibilityAL(exportPanel, mostPanel, incomesPanel
                , costsPanel, balancePanel, checkPanel, costsPanel));

        buttonIncome.addActionListener(e -> aLHelper.toolbarVisibilityAL(exportPanel, mostPanel, incomesPanel
                , costsPanel, balancePanel, checkPanel, incomesPanel));

        getCheckButton.addActionListener(e -> aLHelper.toolbarVisibilityAL(exportPanel, mostPanel, incomesPanel
                , costsPanel, balancePanel, checkPanel, checkPanel));

        addButtonIncome.addActionListener(e -> aLHelper.addInAL(amountBoxIncome, transferToBalanceCheckBoxIncome
                , incomeChoose, taxesCheckBoxIncome));

        addButtonCosts.addActionListener(e -> aLHelper.addCostAL(amountTextFieldCost, costChoose, hiddenCheckBox));

        buttonBalance.addActionListener(e -> {
            try {
                amountTextField.setText(aLHelper.getBalance(loggedInUser) + " ");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            aLHelper.toolbarVisibilityAL(exportPanel, mostPanel, incomesPanel, costsPanel, balancePanel, checkPanel
                    , balancePanel);
        });
    }

    private void startingVariables() {
        incomesPanel.setVisible(true);
        costsPanel.setVisible(false);
        balancePanel.setVisible(false);
        checkPanel.setVisible(false);
        mostPanel.setVisible(false);
        exportPanel.setVisible(false);
        aLHelper.newButtonAL();
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }


}
