package com.vivek.first_codes;
import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What's your Goog name ");
        String name = in.nextLine();

       String message = greet(name);
    }

    public static String greet(String name){
        System.out.println("Hey, "+name+". Good Morning!!");
        return name;
    }
}
