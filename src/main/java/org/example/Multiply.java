package org.example;

import java.util.List;

public class Multiply implements Operation{

    @Override
    public void operation(List<? extends Number> array) {
        double result = 1;
        for (int i = 0; i < array.size(); i++) {
            result *= array.get(i).doubleValue();
        }
        System.out.println("result = " + result);
    }
}
