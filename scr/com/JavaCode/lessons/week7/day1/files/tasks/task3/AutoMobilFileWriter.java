package com.JavaCode.lessons.week7.day1.files.tasks.task3;


import java.io.*;

public class AutoMobilFileWriter {

    public static final String PATH = "scr/com/JavaCode/lessons/week7/day1/files/tasks/task3/AutoMobil";

    public void WriteCar(AutoMobil autoMobil) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH, true))) {
            bw.write(autoMobil.getName() + "," + autoMobil.getMake()
                    + "," + autoMobil.getNumber() + "," + autoMobil.getKm());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String PrintCar() {
        String returnString = "";

        try {
            FileInputStream fis = new FileInputStream(PATH);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String line;
            System.out.println();

            while ((line = br.readLine()) != null) {
                returnString += line + '\n';
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnString;
    }

}