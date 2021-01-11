package com.JavaCode.lessons.week7.day1.files.tasks.task1;

import java.io.*;

public class PersonFileWriter {

    public static final String PATH = "scr/com/JavaCode/lessons/week7/day1/files/tasks/task1/people";

    public void WritePerson(Person person) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH, true))) {
            bw.write(person.getName() + " " + person.getAge());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String PrintPeople() {
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