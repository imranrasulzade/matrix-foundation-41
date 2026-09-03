package lesson13;

import java.util.*;

public class Lesson13 {

    public static void main(String[] args) {

//        int a = 5;
//        Integer b = 5;
//        byte m = b.byteValue();
//        String st = "555";
//
//        Integer g = Integer.parseInt(st);
//
//        Integer n = Integer.max(4, 9);
//        Long k = 54L;
//        Double d = 55.5;
//        Float f = 55.5f;
//        Boolean bo = null;


        List<String> names = new ArrayList<>();
        names.add("Fatima");
        names.add("Esmer");
        names.add("Gulnur");
        names.add("Aydan");

//        System.out.println(names.contains("Gulnur"));

//        for (String n : names) {
//            System.out.println(n);
//        }

        System.out.println(names);

        List<Integer> nums = List.of(8, 6, 2, 3);
//        nums.add(5);  // xeta



        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);


        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "Gulnur");
        hashMap.put("b", "Aydan");
        hashMap.put("c", "Fatima");
        hashMap.put("d", "Esmer");


        Set<String> keys = hashMap.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + hashMap.get(key));
        }













//




    }
}
