package org.example;

import java.util.List;

public class Summary implements Operation {

    @Override
    public void operation(List<? extends Number> array) {
        double result = 0;
        for (int i = 0; i < array.size(); i++) {
            result += array.get(i).doubleValue();
        }
        System.out.println("result = " + result);

    }
}
