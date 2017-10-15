package org.lucas.de.redisclient.controllers;

import org.lucas.de.redisclient.service.CalculatorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorController {

    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    public int sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b){

        return CalculatorService.sum(a,b);
    }


}
