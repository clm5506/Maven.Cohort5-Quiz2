package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if(array.length % 2 == 0){
            return true;
        }
        return false;
    }

    public Integer[] range(int start, int stop) {
        Integer[] ans = new Integer[stop+1];

        for(int i = start; i <= stop; i++){
            ans[i] = i;
        }
        return ans;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return null;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        return null;
    }
}
