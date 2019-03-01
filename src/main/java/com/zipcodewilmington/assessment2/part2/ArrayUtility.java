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


//        Integer numToRemove = ans.get(index);
//        ans.remove(index);
//        ans.add(0,numToRemove);
//        int length = answer.size();
//        answer = answer.subList(index,array.length-1);
        ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList());

        for(int i = 0; i < index; i++ ){
            temp.add(array[i]);
            answer.remove(0);
        }

        answer.addAll(temp);
        return answer.toArray(new Integer[answer.size()]);

    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer num1 = countOccurHelper(array1, valueToEvaluate);
        Integer num2 = countOccurHelper(array2,valueToEvaluate);

        return num1+num2;
    }

    //converts Integer[] to ArrayList and calls other countOccurHelper
    public Integer countOccurHelper(Integer[] array1,Integer valueToEvaluate){

        ArrayList<Integer> newArray = new ArrayList<Integer>(Arrays.asList(array1));
        return countOccurHelper(newArray,valueToEvaluate);
    }

    public Integer countOccurHelper(ArrayList<Integer> array1,Integer valueToEvaluate){
        int counter= 0;

        for(int i = 0; i < array1.size(); i++) {
            if(valueToEvaluate == array1.get(i)) {
                counter++;
            }
        }
        return counter;
    }

    //converts Integer[] to ArrayList and calls other mostCommon
    public Integer mostCommon(Integer[] array) {
        ArrayList<Integer> newArray = new ArrayList<Integer>(Arrays.asList(array));
        return mostCommon(newArray);
    }

    public Integer mostCommon(ArrayList<Integer> array) {

        Integer num = 0;
        Integer mostCommon = 0;

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
