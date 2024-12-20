package io.loop.test.day27_wrapper_arrayList.hm_day27;
import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> heroes= new ArrayList<>();
        heroes.add("Iron Man");
        heroes.add("Spider Man");
        heroes.add("Thor");
        heroes.add("Captain America");
        heroes.add("Hawkeye");
        System.out.println(heroes);

        System.out.println("**");
        heroes.remove(2);
        System.out.println("heroes = " + heroes);
        System.out.println("**");
        heroes.remove("Iron Man");
        System.out.println("heroes = " + heroes);
        System.out.println("*");
        heroes.remove(0);
        System.out.println("heroes = " + heroes);
    }
}