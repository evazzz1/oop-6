package org.example;

import org.example.Calculator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Integer [] arr = new Integer[] {1,2,3,4,5};
        Double [] arr2 = new Double[] {1.0,2.0,0.0,4.0,3.0};
        Calculator calc = new Calculator(new Multiply());
        calc.useOperation(List.of(arr));

        calc = new Calculator(new Summary());
        calc.useOperation(List.of(arr));

        BinaryConverterr converter = new BinaryConverterr(new IntegerBinaryConverter());
        System.out.println(converter.toBinary("42"));

        converter = new BinaryConverterr(new DoubleBinaryConverter());
        System.out.println(converter.toBinary("40.1"));

    }
}