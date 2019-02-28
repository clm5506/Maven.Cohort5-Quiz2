package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Router {

   SortedMap<String, String> ans = new TreeMap<String, String>();


    public void add(String path, String controller) {

        ans.put(path, controller);
    }

    public Integer size() {

        return ans.size();
    }

    public String getController(String path) {


        return ans.get(path);
    }

    public void update(String path, String studentController) {
        ans.replace(path,studentController);
    }

    public void remove(String path) {
        ans.remove(path);
    }

    @Override
    public String toString() {
        String str = "";

        for(Map.Entry<String, String> entry : ans.entrySet()) {
            str = str + entry.getKey()
                    + " -> " + entry.getValue().toString().replace("[","").replace("]","")
                    + "\n";
        }



        return str;
    }
}
