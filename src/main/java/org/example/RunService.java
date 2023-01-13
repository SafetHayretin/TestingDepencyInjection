package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RunService extends AbstractService{
    @Override
    public String run() {
        return "Running";
    }
}
