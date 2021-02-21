package com.JavaCode.project;

import com.JavaCode.project.gui.SetUp;

import java.sql.SQLException;

public class Project {

    public static void main(String[] args) {

        try {
            SetUp setUp = new SetUp();
            setUp.run();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}