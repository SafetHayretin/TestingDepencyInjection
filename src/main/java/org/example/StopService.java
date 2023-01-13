package org.example;

import org.springframework.stereotype.Component;

@Component
public class StopService extends AbstractService {
    @Override
    public String run() {
        return "Stop";
    }
}
