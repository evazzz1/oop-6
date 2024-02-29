package org.example;

import static java.lang.Integer.parseInt;

public class IntegerBinaryConverter implements BinaryConverter {
    @Override
    public String toBinary(String input) {
        int num = Integer.parseInt(input.contains(".") ? input.split("\\.")[0] : input);
        return Integer.toBinaryString(num);
    }
}