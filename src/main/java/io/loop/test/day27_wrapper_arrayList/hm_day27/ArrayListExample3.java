package io.loop.test.day27_wrapper_arrayList.hm_day27;
import java.util.ArrayList;
public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<Character> letters=new ArrayList<>();
        for (char i = 'A'; i <'Z'+1 ; i++) {
            letters.add(i);
        }
        System.out.println("letters = " + letters);
    }
}