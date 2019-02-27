package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    Integer actInput;
    public WuTangConcatenator(Integer input) {

        this.actInput = input;
    }

    public Boolean isWu() {

        if(actInput % 3 == 0){
        return true;}
        else {
            return false;
        }
    }

    public Boolean isTang() {
        if(actInput % 5 == 0){
            return true;
        }
        return false;
    }

    public Boolean isWuTang() {
        if(isTang() && isWu()){
            return true;
        }

        return false;
    }
}
