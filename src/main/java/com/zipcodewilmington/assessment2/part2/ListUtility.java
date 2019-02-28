package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.*;


public class ListUtility {
    ArrayList<Integer> answer = new ArrayList<>();
//
//    public ListUtility(){
//        answer = new ArrayList();
//    }


    public Boolean add(Integer i) {
        return answer.add(i);
    }

    public Integer size() {
        return answer.size();
    }

    public List<Integer> getUnique() {

      //  List<Integer> answer = new HashSet<Integer>(answer);

        return null;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {

        ArrayUtility ar = new ArrayUtility();
        //List<Object> list = new ArrayList<>(Arrays.asList(answer));

        Integer[] newIntArr = new Integer[answer.size()];
        return ar.mostCommon( answer.toArray(newIntArr));
        //return null;

    }

    public Boolean contains(Integer valueToAdd) {

        //Boolean a = answer.contains(valueToAdd);
        return answer.contains(valueToAdd);
    }
}
