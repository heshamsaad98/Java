package arraylistclass;

import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list = new ArrayList<>();
        list.add("Ahmed");
        list.add("Mohamed");
        list.add("Ali");
        
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(2));
        
        list.add(1, "Saad");
        System.out.println(list);
        list.set(3, "Hesham");
        System.out.println(list);
        
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list);
    }
    
}
