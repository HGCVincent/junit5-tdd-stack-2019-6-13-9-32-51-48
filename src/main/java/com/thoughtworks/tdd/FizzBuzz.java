package com.thoughtworks.tdd;

public class FizzBuzz {

    public String convert(int number) {
        if (number % 15 == 0) {
            return "Fizz Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return "" + number;
    }

    public String printNumber(int left, int right) {
        String str = "";
        for (int i = left; i <= right; i++) {
            str += convert(i) + " ";
        }
        return str.substring(0,str.length()-1);

    }
}
