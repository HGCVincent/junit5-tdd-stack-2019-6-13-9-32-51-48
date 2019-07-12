package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzz_test {
    @Test
    public void should_be_1_when_convert_given_1(){
        //given
        int number = 1;
        //when
        String result = new FizzBuzz().convert(number);
//        then
        assertEquals(result,"1");
    }
    @Test
    public void should_be_2_when_convert_given_2(){
        //given
        int number = 2;
        //when
        String result = new FizzBuzz().convert(number);
//        then
        assertEquals(result,"2");
    }
    @Test
    public void should_be_Fizz_when_convert_given_3(){
        //given
        int number = 3;
        //when
        String result = new FizzBuzz().convert(number);
//        then
        assertEquals(result,"Fizz");
    }
    @Test
    public void should_be_Fizz_when_convert_given_6(){
        //given
        int number = 6;
        //when
        String result = new FizzBuzz().convert(number);
//        then
        assertEquals(result,"Fizz");
    }
    @Test
    public void should_be_Buzz_when_convert_given_5(){
        //given
        int number = 5;
        //when
        String result = new FizzBuzz().convert(number);
//        then
        assertEquals(result,"Buzz");
    }
    @Test
    public void should_be_Fizz_Buzz_when_convert_given_15(){
        //given
        int number = 15;
        //when
        String result = new FizzBuzz().convert(number);
//        then
        assertEquals(result,"Fizz Buzz");
    }





}
