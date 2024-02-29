package org.example;

import static java.lang.Integer.parseInt;

public class DoubleBinaryConverter implements BinaryConverter {
    @Override
    public String toBinary(String input) {
        double num = Double.parseDouble(input);
        int left = (int) num;
        String bin = new IntegerBinaryConverter().toBinary(String.valueOf(left)) + ".";
        float right = (float) num - left;
        for (int i = 0; i < 20; i++) {
            right = right * 2 - (int) right * 2;
            bin += (int) right;
            if (right == 1.0) {
                break;
            }
        }
        return bin;
    }
}