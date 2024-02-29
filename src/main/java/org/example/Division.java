package org.example;

import java.util.List;

public class Division implements Operation {
    @Override
    public void operation(List<? extends Number> array) {
        double result = 1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).doubleValue() == 0.0) {
                System.out.println("Ошибка нельзя делить на ноль");
            }
            result /= array.get(i).doubleValue();
        }
        System.out.println("result = " + result);
    }
}
