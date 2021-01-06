package com.JavaCode.lessons.week7.day3.generic.tasks.task1;

import java.util.Arrays;

public class GenericClass<T> {

    private T[] elements;

    public GenericClass(T[] elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
