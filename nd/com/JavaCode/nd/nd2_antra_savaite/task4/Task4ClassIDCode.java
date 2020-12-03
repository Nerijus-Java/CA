package com.JavaCode.nd.nd2_antra_savaite.task4;

public class Task4ClassIDCode {
    protected String idCode;

    protected Task4ClassIDCode(String idCode) {
        this.idCode = idCode;
    }

    protected String getCodeBDate(){
        String holder = "";
        holder = this.idCode.substring(1,7);
        return holder.substring(0,2) + "/" + holder.substring(2,4) + "/" + holder.substring(4,6);
    }

    protected String getGender(){
        int firstNumber = Integer.valueOf(this.idCode.substring(0,1));
        if (firstNumber % 2 == 0){
            return "Woman";
        }else {
            return "Male";
        }
    }

    protected boolean isCodRightSize(){
        if (this.idCode.length() == 11){
            return true;
        }else {
            return false;
        }
    }





}
