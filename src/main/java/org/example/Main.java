package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter text:");
            String text = scanner.nextLine();
//            String s = "ab-cd!ef";
            ReverseOnlyLetters r = new ReverseOnlyLetters();
            String reversedString = r.reverseOnlyLetters(text);
            System.out.println(reversedString); // Output: "fe-dc!ba"
        }
    }
}