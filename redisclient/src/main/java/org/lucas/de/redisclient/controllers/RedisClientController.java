package org.lucas.de.redisclient.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisClientController {

    @RequestMapping(value = "/getFromCache", method = RequestMethod.GET)
    public String getFromCache(){
        return "hello";
    }

    /*@RequestMapping(value = "/putToCache", method = RequestMethod.POST)
    public void putToCache(int key, String value){

    }*/
}
