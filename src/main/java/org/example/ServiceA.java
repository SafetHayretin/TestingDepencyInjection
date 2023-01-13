package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("serviceA")
@Primary
public class ServiceA implements Service{
}
