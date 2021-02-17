package com.JavaCode.lessons.week10.day3.task1;

import java.util.Optional;

public class StringToInt {

    public int makeStringToInt(String s){
        Optional<Integer> integerOptional = stringToInt(s);

        return integerOptional.orElse(0);
    }

    private Optional<Integer> stringToInt(String string){
        switch (string){
            case "1": return Optional.of(1);
            case "2": return Optional.of(2);
            case "3": return Optional.of(3);
            case "4": return Optional.of(4);
        }
        return Optional.empty();
    }

}
