package com.JavaCode.ND.nd06.exceptionExer.task7;

public class IntConverter {

    public IntConverter() {

    }

    public int convert(String text) {
        if (text == null) {
            throw new NullPointerException("Null");
        } else {
            return Integer.parseInt(text);
        }

    }
}
