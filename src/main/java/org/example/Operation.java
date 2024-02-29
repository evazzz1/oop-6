package org.example;

import java.util.List;

public interface Operation {
    void operation(List<? extends Number> array);
}
