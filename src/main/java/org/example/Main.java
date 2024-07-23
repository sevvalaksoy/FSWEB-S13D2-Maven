package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome (int number) {
        number = Math.abs(number);
        boolean result = false;
        char[] digits = String.valueOf(number).toCharArray();
        for (int i =0; i<digits.length; i++){
           if (String.valueOf(digits[i]).equals(String.valueOf(digits[digits.length-1-i])))  {
               result = true;
           } else {
               result = false;
               break;
           }
        }
        return result;
    }

    public static boolean isPerfectNumber (int number) {
        if (number < 0) {
            return false;
        }
        int total = 0;
        for (int i = 1; i < number; i++) {
            if(number%i==0){
                total += i;
            }
        }
        return total == number;
    }

    public static String numberToWords (int number) {
        if ( number < 0) {
            return "Invalid Value";
        }
        StringBuilder result = new StringBuilder();
        char[] digits = String.valueOf(number).toCharArray();
        String[] digitNames = new String[]{"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        for (char digit : digits) {
            result.append(" ").append(digitNames[Integer.parseInt(String.valueOf(digit))]);
        }
        return String.valueOf(result).substring(1);
    }
}
