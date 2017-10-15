package org.lucas.de.redisclient.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import springfox.documentation.annotations.Cacheable;



@Service
public class CalculatorService {

    private final Logger logger = LoggerFactory.getLogger(CalculatorService.class);

    @Cacheable("sum")
    public static int sum(int a, int b){
        return a + b;
    }
}
