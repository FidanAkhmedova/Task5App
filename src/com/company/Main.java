package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String str = scanner.nextLine();
        countVowels(str);   //1. Count Vowels: Implement a method that counts the number of vowels in a given string. Consider both uppercase and lowercase vowels.
        //reverseString(str); //2. Reverse String: Implement a method that reverses a given string. (try not to use ready methods)
        makePalindrome(str); //3. Palindrome: Implement a method that convert a given string to a palindrome.
        countLetters(str); //4. Letter Count: Implement a method that counts the number of letter in a given string. Assume that string are separated by spaces. (\\s+) -> spaces
    }
    public static void countVowels(String str){
        int k = 0;
        List<Character> listOfVowels = Arrays.asList('A','a', 'E','e','I','i','O','o','U','u');
        char[] arrOfLetters = str.toCharArray();

        for (char arrOfLetter : arrOfLetters) {
            if (listOfVowels.contains(arrOfLetter)) {
                k++;
            }
        }

        System.out.println("The number of vowels in a given string is " + k);
    }
    public static String reverseString(String str){
        String reversedString = "";
        char[] arrOfLetters = str.toCharArray();
        char w;
        int newLength = (arrOfLetters.length)/2;
        for (int i = 0; i < newLength; i++) {
            w = arrOfLetters[i]; arrOfLetters[i] = arrOfLetters[arrOfLetters.length - i - 1]; arrOfLetters[arrOfLetters.length - i - 1] = w;
        }
        for (int i = 0; i < arrOfLetters.length; i++) {
            reversedString += arrOfLetters[i];

        }
        System.out.println("The original string is " + str);
        System.out.println("The reversed string is " + reversedString);
        return reversedString;
    }


    public static String makePalindrome(String str){
        String palindrome = str + reverseString(str);
        System.out.println("Palindrome with adding reversed word to the end of word: " + palindrome);
        return str;
    }

    public static int countLetters(String str){

        int countOfSpaces = 0, countOfLetters = 0;
        char[] arrOfLetters = str.toCharArray();

        for (char c: arrOfLetters) {
            if (c == '\u0020' || c == '\u0009'){
                countOfSpaces++;
            }
        }

        countOfLetters = str.length() - countOfSpaces;
        System.out.println("The number of letters in a string " + str + " is\u0020" + countOfLetters);
        return countOfLetters;
    }





}
