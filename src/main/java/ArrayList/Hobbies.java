package ArrayList;

import java.util.ArrayList; // import the ArrayList class

public class Hobbies {

    public static void main(String[] args) {
        ArrayList<String> hobbies = new ArrayList<String>(); // Create an ArrayList object
        hobbies.add("reading"); //0
        hobbies.add("cooking"); //1
        hobbies.add("going to movies"); //2

        hobbies.set(1,"going outside");

        System.out.println(hobbies);
    }
}