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

        int length = (stop - start) + 1;
        ans[0] = start;
        for(int i = 1; i < length; i++){
           ans[i] = start+i;
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
