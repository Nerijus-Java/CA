//package com.JavaCode.project.Payments;
//
//import com.JavaCode.project.model.Payments;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//
//public class PaymentsFileWriter {
//
//    public static final String PAYMENTS_PATH = "scr/com/JavaCode/project/Payments.txt";
//    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//
//    public void resetFile(Payments[] paymentArray){
//        for (Payments payments : paymentArray) {
//            try (BufferedWriter bw = new BufferedWriter(new FileWriter(PAYMENTS_PATH, false))) {
//                bw.write(payments.getCatagory().getName() + "," + payments.getCatagory().getAmount() + "," + payments.getAmount() + ","
//                        + DATE_FORMAT.format(payments.getDate()) + "," + payments.getTransferToBalance() + ","
//                        + payments.getHasTaxes() + "," + payments.getIncomeOrCost() + "," + payments.getHiddenCost());
//                bw.newLine();
//            } catch (IOException e) {
//                System.out.println("File not found");
//            }
//        }
//    }
//
//    public void export(Payments[] paymentArray, String path) {
//        createFile(path);
//        for (Payments payments : paymentArray) {
//            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
//                bw.write(payments.getCatagory().getName() + "," + payments.getCatagory().getAmount() + "," + payments.getAmount() + ","
//                        + DATE_FORMAT.format(payments.getDate()) + "," + payments.getTransferToBalance() + ","
//                        + payments.getHasTaxes() + "," + payments.getIncomeOrCost() + "," + payments.getHiddenCost());
//                bw.newLine();
//            } catch (IOException e) {
//                System.out.println("File not found");
//            }
//        }
//    }
//
//    public void writeOnePaymentToFileWriter(Payments payments) {
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PAYMENTS_PATH, true))) {
//            bw.write(payments.getCatagory().getName() + "," + payments.getCatagory().getAmount() + "," + payments.getAmount() + ","
//                    + DATE_FORMAT.format(payments.getDate()) + "," + payments.getTransferToBalance() + ","
//                    + payments.getHasTaxes() + "," + payments.getIncomeOrCost() + "," + payments.getHiddenCost());
//            bw.newLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void createFile(String path) {
//        File file = new File(path);
//        boolean result;
//        try {
//            result = file.createNewFile();
//            if (result){
//                System.out.println("Created");
//            } else {
//                System.out.println("Not Created");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}
