package com.JavaCode.lessons.week4.day2.polmorfizmas.taskSkaiciai;

interface Number {

    int[] generate();

    default int sum() {
        int holder = 0;
        for (int i : generate()){
            holder += i;
        }
        return holder;
    }
}
