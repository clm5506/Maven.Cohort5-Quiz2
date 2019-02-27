package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if(array.length % 2 == 0){
            return true;
        }
        return false;
    }

    public Integer[] range(int start, int stop) {
        Integer[] ans = new Integer[(stop-start)+1];
      //  Integer[] ans = new Integer[stop];

        for(int i = start; i <= stop; i++){
           ans[i] = i;
        }
        return ans;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer a = array[0];
        Integer b = array[1];

        return a+b;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer a = array[0];
        Integer b = array[1];

        return a*b;
    }
}
