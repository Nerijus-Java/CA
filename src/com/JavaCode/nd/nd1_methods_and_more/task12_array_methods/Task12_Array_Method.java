package com.JavaCode.nd.nd1_methods_and_more.task12_array_methods;

public class Task12_Array_Method {

    public static void main(String[] args) {
        String[] array = {"A","B","C","D","E","F"};
        arrayToString(array);
        String[] array2 = {"A","B","C","D","E","F","G","H","I"};
        arrayToString(array2);

        int[] intArray = {1,2,3,4,5,6};
        ArrayToString(intArray);
        int[] intArray2 = {1,2,3,4,5,6,7,8,9};
        ArrayToString(intArray2);
    }

    public static void arrayToString(String[] array){
        int count = 0;
        System.out.print("{");
        for (String i : array){
            if (array.length -1 == count){
                System.out.print(i + "}");
            }else {
                System.out.print(i + " ,");
                ++count;
            }
        }
        System.out.println();
    }

    public static void ArrayToString(int[] array){
        int count = 0;
        System.out.print("{");
        for (int i : array){
            if (array.length -1 == count){
                System.out.print("a" + i + "}");
            }else {
                System.out.print("a" + i + " ,");
                ++count;
            }
        }
        System.out.println();
    }
}
