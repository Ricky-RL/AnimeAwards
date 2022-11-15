package com.mycompany.test3;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.HashMap;

public class AwardCeremony {

    public static void main(String[] args) throws Exception {

        FileInputStream z = new FileInputStream("test1.txt");
        HashMap<String, HashMap<String, Integer>> d = new HashMap<String, HashMap<String, Integer>>();

        Scanner input = new Scanner(z);
        while (input.hasNext()) {
            String i = input.nextLine();
            if (i.equalsIgnoreCase("")) {
                continue;
            }

            String[] organize = i.split(":");
            if (organize == null || organize.length < 2) {
                continue;
            }
            if (!d.keySet().contains(organize[0])) {

                HashMap<String, Integer> e = new HashMap<String, Integer>();
                e.put(organize[1], 1);
                d.put(organize[0], e);
            } else {
                HashMap<String, Integer> e = d.get(organize[0]);
                Integer v = e.get(organize[1]);
                if (v == null) {
                    e.put(organize[1], 1);
                } else {
                    e.replace(organize[1], v + 1);
                }
            }

        }
        for (String s : d.keySet()) {
            HashMap<String, Integer> e = d.get(s);

            for (String t : e.keySet()) {
                if (e.get(t) == 1)
                System.out.println(s + ": " + t + " " + e.get(t) + " time");
                
                if (e.get(t)> 1)
                System.out.println(s + ": " + t + " " + e.get(t) + " times");
                
                else 
                    continue;
            }
        }
    }
    

        /*while (true) {
           System.out.println("input a category: \nbest:" );
           
           Scanner y = new Scanner(System.in);
           String category = y.next();
           
          
          System.out.println(input.findAll("Best Standalone episode: fumetsu ep 1"));
           System.out.println(input.findAll(category));
         }
         */
  //  }
//}
