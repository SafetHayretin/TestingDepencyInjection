package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Project {
    @Autowired
    Service service;

    @Autowired
    AbstractService service2;
}
