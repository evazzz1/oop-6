package org.example;

import java.util.List;

import static java.lang.Integer.parseInt;

public class Calculator {
    Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public void useOperation(List<? extends Number> array) {
        operation.operation(array);
    }
}

