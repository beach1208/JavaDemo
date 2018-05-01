package MapDemo;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        //template
//        List<String>

        //key value <String,String>
        Map<String, String> phoneBook = new HashMap<>(); //creating hash map obj  map is storing key and obj
        phoneBook.put("Derrick", "777817363");
        phoneBook.put("Bianca", "778916333");
        phoneBook.put("Javiar", "6047008332");
        phoneBook.put("Yukako", "7738383448");
        phoneBook.put("Alex", "4319987755");

        //how many obj do you have?
        System.out.println(phoneBook.size());

        phoneBook.put("Bianca", "567433929"); //overrides
        System.out.println(phoneBook.size());
        System.out.println(phoneBook.get("Bianca"));
        System.out.println(phoneBook.remove("Bianca"));
        System.out.println(phoneBook.size());

        System.out.println("-----------------------------");

        for (String name : phoneBook.keySet()) { //keyを取ってくれる
            System.out.println("name: " + name);
        }

        System.out.println("------------ Collections -----------------");
        Collection<String> numbers = phoneBook.values(); //keyのペアのvalueを取ってくる
        for (String num: numbers){
            System.out.println(num);
        }

        System.out.println("------- Set method --------");
        Set<String> keys = phoneBook.keySet(); // gives you set of strings これでiterator使えるようになる
        Iterator <String> iters = keys.iterator();
        while(iters.hasNext()) {  //has next gives you next element
            String number = phoneBook.get(iters.next());
            System.out.println(number);
        }


        List<String> arrList = new ArrayList<>(); //interfaceなのでinstance 作成できない
        arrList.add("Minami");
        arrList.add("Bianca");
        arrList.add("Victor");
        arrList.add("Yukako");
        arrList.add("Nagisa");
        arrList.add("Alex");
        arrList.add("Sue");
        arrList.add("Ray");
        arrList.add("Derrick");
        arrList.add("Giada");

        System.out.println("------- Array List loop --------");
        for (int i = 0; i < arrList.size(); i++){
            System.out.println(arrList.get(i));
        }

        System.out.println("------- Array List for each loop--------");
        for (String name: arrList){
            System.out.println(name);
        }

        System.out.println("------- Array List iterator--------");
        Iterator<String> iter = arrList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
}

}
