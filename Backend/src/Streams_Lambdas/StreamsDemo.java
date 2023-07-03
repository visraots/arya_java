package Streams_Lambdas;

import java.util.*;
import java.util.stream.*;

public class StreamsDemo {

    public static void main(String[] args) {
        String ss="aeiou";
        List<String> l=new ArrayList<>();
        l.add("Aryaa");
        l.add("vishnu");
        l.add("hari");
        l.add("sriram");
        l.add("ghyt");
        l.add("ljcsd");
        List<Integer> i=new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        int[] iarr = {0};
        //Question 1
        List<String> ll=l.stream().map(p->{
            return Character.toUpperCase(p.charAt(0))+p.substring(1);
        }).sorted().collect(Collectors.toList());
        System.out.println("First Letter Captalized: "+ll);
        System.out.println();
        //Question 2
        l.stream().filter(s->s.toLowerCase().matches(".*[aeiou].*")).collect(Collectors.toList()).stream().forEach(s->{int cc=(int) s.toLowerCase().chars()
                    .filter(c ->
                         ((char) c=='a'||(char) c=='e'||(char) c=='i'||(char) c=='o'||(char) c=='u')
                    ).count();
        System.out.println("There are "+cc+" vowels in string "+s);});
        System.out.println();


        //Question 3
        double a=i.stream().map(si->{return (si%2==0)?si*si:0;}).mapToInt(aa -> aa).average().orElse(0);
        System.out.println(a);
        System.out.println();
        //Question 4
        Collections.sort(l,(String s1, String s2)->(s1.length()>s2.length())?1:(s1.length()==s2.length())?(s1.charAt(s1.length()-1))<(s2.charAt(s2.length()-1))?1:-1:-1);
        System.out.println(l);
        System.out.println();
    }
}
