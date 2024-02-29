package org.example;

public class BinaryConverterr {
    private final BinaryConverter converter;

    public BinaryConverterr(BinaryConverter converter) {
        this.converter = converter;
    }

    public String toBinary(String input) {
        return converter.toBinary(input);
    }
}
