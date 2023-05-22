package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String str = scanner.nextLine();
        countVowels(str);   //1. Count Vowels: Implement a method that counts the number of vowels in a given string. Consider both uppercase and lowercase vowels.
        reverseString(str); //2. Reverse String: Implement a method that reverses a given string. (try not to use ready methods)
        makePalindromeWithParts(str);
        makePalindrome(str);

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

    public static String makePalindromeWithParts(String str){

        String palindrome1 = "";
        String palindrome2 = "";
        String firstPart = "";

        if (str == reverseString(str)){
            System.out.println("String is already palindrome " + str);
            return str;
        }

        if (str.length() % 2 == 0){
            firstPart = str.substring(0,str.length()/2);
        }
        else{
            firstPart = str.substring(0,str.length()/2+1);
        }

        String secondPart1 = reverseString(firstPart);
        String secondPart2 = reverseString(firstPart.substring(0,firstPart.length()-1));
        palindrome1 = firstPart + secondPart1;
        palindrome2 = firstPart + secondPart2;
        System.out.println("Palindrome created with the first part of word " + palindrome1);
        System.out.println("Palindrome created with the first part of word " + palindrome2);

        return palindrome1;
    }
    public static String makePalindrome(String str){
        String palindrome = str + reverseString(str);
        System.out.println("Palindrome with adding reversed word to the end of word: " + palindrome);
        return str;
    }







}
