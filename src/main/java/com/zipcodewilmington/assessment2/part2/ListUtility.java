package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.*;


public class ListUtility {
    ArrayList<Integer> answer = new ArrayList<>();

    public Boolean add(Integer i) {

        return answer.add(i);
    }

    public Integer size() {

        return answer.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> newAns = new HashSet<Integer>(answer);
        List<Integer> finalAnswer = new ArrayList<>();
        finalAnswer.addAll(newAns);
        return finalAnswer;
    }

    public String join() {

        return answer.toString().replace("[","").replace("]","");
    }

    public Integer mostCommon() {

        ArrayUtility ar = new ArrayUtility();

        Integer[] newIntArr = new Integer[answer.size()];
        return ar.mostCommon(answer.toArray(newIntArr));


    }

    public Boolean contains(Integer valueToAdd) {
        return answer.contains(valueToAdd);
    }
}
