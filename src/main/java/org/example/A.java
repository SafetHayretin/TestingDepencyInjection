package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Element")
public class A {
    @Autowired
    B element1;

    C element2;

    D element3;

    @Autowired
    public A(D element3) {
        this.element3 = element3;
    }

    public A(C element2) {
        this.element2 = element2;
    }

    @Autowired
    public void setC(C element2) {
        this.element2 = element2;
    }

    public B getElement1() {
        return element1;
    }

    public C getElement2() {
        return element2;
    }

    public D getElement3() {
        return element3;
    }
}
