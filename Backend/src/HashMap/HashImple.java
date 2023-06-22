import java.util.*;

public class HashImple {
    public static void main(String[] args) {
        Map<String, Student> s = new HashMap<>();
        s.put("Arya", new Student("Arya", "Vishnu", 4));
        s.put("Pavan", new Student("pavan", "Verma", 4));
        s.put("Varshit", new Student("Varshith", "Jajaula", 3));

        for (Map.Entry<String, Student> entry : s.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().getGpa());
        }
        //for each
        s.forEach((ss,k)->System.out.println(ss+k.getGpa()));
        //Key Set
        Iterator<String> sse = s.keySet().iterator();
        while (sse.hasNext()) {
            String s1=sse.next();
            System.out.println(sse.next()+s.get(s1).getGpa());
        }
        //Question 2

        String input = "test string";

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            System.out.println(character + ":" + count);
        }
        //Question 3
            int [] nums= new int[]{1,2,3,4,5};
            int target=4;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    System.out.println(map.get(complement)+ " "+i);
                }
                map.put(nums[i], i);
            }


    }
}


