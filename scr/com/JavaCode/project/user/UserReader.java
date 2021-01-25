package com.JavaCode.project.user;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserReader {

    public static final String USER_FILE_PATH = "scr/com/JavaCode/project/user/Users";
    private final UserCollection userCollection;

    public UserReader(UserCollection userCollection) {
        this.userCollection = userCollection;
    }

    public void readFile() {
        try {
            FileInputStream fis = new FileInputStream(USER_FILE_PATH);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String line;

            while ((line = br.readLine()) != null) {
                lineToUser(line);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void lineToUser(String line){
        int lineCount = 0;
        StringBuilder holder = new StringBuilder();
        String[] userDetails = new String[3];

        for (char c : line.toCharArray()) {
            if (c != ',') {
                holder.append(c);
            } else {
                userDetails[lineCount] = holder.toString();
                lineCount++;
                holder = new StringBuilder();
            }
        }
        userCollection.addNewUser(userDetails[0],userDetails[1]);
    }
}
