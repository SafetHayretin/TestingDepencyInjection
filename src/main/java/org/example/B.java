package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("B")
public class B {
    @Autowired
    private C element;
}
