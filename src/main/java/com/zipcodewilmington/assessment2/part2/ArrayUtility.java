package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        List<Integer> ans = new ArrayList<>(Arrays.asList(array1));

        Collections.addAll(ans,array2);

        return ans.toArray(new Integer[ans.size()]);

    }

    public Integer[] rotate(Integer[] array, Integer index) {
       List<Integer> ans = new ArrayList<>(Arrays.asList(array));

        Integer numToRemove = ans.get(index);
        ans.remove(index);

        ans.add(0,numToRemove);

        return ans.toArray(new Integer[ans.size()]);



    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer num1 = countOccurHelper(array1, valueToEvaluate);
        Integer num2 = countOccurHelper(array2,valueToEvaluate);

        return num1+num2;
    }

    public Integer countOccurHelper(Integer[] array1,Integer valueToEvaluate){
        int counter= 0;

        for(int i = 0; i < array1.length; i++) {
            if(array1[i].equals(valueToEvaluate)) {
                counter++;
            }
        }
        return counter;
    }


    public Integer mostCommon(Integer[] array) {
        Integer num = 0;
        Integer mostCommon = null;

        for (Integer o : array) {
            int temp = countOccurHelper(array, o);
            if (temp > num) {
                mostCommon = o;
                num = temp;
            }
        }
        return mostCommon;

    }
}
