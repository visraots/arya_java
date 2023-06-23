package Hashset;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str="asaaaaaaa";
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<str.length();i++){
            hs.add(str.substring(i,i+1).toLowerCase());
        }
        hs.forEach(System.out::println);
        HashSet<String> hs1=new HashSet<>();
        hs.add("Arya");
        hs.add("Arya");
        hs.add("Vishnu");

        Iterator it = hs1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        hs.forEach(System.out::println);
        hs.stream().forEach(System.out::println);
    }
    }

