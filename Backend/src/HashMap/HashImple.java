package HashMap;

import java.util.*;

public class HashImple {
    public static void main(String[] args) {
        Map<String, Student> s = new HashMap<>();
        s.put("Arya", new Student("Arya", "Vishnu", 4));
        s.put("Pavan", new Student("pavan", "Verma", 4));
        s.put("Varshit", new Student("Varshith", "Jajaula", 3));


        //Question 3
            int [] nums= new int[]{1,2,3,4,5};
            int target=4;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    int sse=map.get(complement);

                    System.out.println("Ind 1 "+sse+" Ind 2 "+i);
                }
                map.put(nums[i], i);
            }


    }
}


