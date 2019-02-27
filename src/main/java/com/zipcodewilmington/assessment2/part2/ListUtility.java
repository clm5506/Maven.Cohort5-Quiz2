package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.*;


public class ListUtility {
    List answer= new ArrayList();


    public Boolean add(int i) {

        Integer a = i;
        return answer.add(a);
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
        List<Object> list = new ArrayList<>(Arrays.asList(answer));


      //  return ar.mostCommon( answer.toArray(new Integer[answer.size()]));
        return null;

    }

    public Boolean contains(Integer valueToAdd) {

        Boolean a = answer.contains(valueToAdd);
        return a;
    }
}
