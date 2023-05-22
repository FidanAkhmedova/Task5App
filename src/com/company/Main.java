package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int k = 0;
        char[] arrOfLetters = str.toCharArray();
        List<Character> listOfVowels = Arrays.asList('A','a', 'E','e','I','i','O','o','U','u');
        for (int i = 0; i < arrOfLetters.length; i++) {
            if (listOfVowels.contains(arrOfLetters[i])){
                k++;
                System.out.println(k);
            }
        }












    }
}
