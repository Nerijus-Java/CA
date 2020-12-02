package com.JavaCode.lessons.week2.other;

public class Save {

    private String info;

    public String getInfo(){
        return this.info;
    }

    public String setInfo(String info){
        if (!info.contains("bananas")){
            this.info = info;
        }else {
            return "Fount a banana can not save";
        }
        return "Error: can not confirm if String contains Banana";
    }


}
