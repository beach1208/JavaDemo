package MapDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Angel");
        mySet.add("Luke");
        mySet.add("Katty G");
        mySet.add("Alex");
        mySet.add("Amanda");
        mySet.add("Stacey");
        mySet.add("Summer");
        mySet.add("Jay");
        mySet.add("Jacob");
        mySet.add("Jacob");
        mySet.add("Jacob");
        mySet.add("Jacob");
        mySet.add("Jacob");


        for (String name: mySet){
            System.out.println(name);
        }

        String word = "ABCDEA";
        Set<String> unique = new HashSet<>();
        for (int i = 0; i < word.length(); i++){
            unique.add(word.substring(i,i+1));
            if(unique.size() != word.length()){
                System.out.println(word);
            }
        }

        System.out.println(mySet.size());

    }

}
