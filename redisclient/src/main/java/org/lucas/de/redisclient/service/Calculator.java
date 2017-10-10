package org.lucas.de.redisclient.service;

import org.springframework.stereotype.Service;
import springfox.documentation.annotations.Cacheable;

@Service
public class Calculator {

    @Cacheable("sum")
    public int sum(int a, int b){
        return a + b;
    }
}
