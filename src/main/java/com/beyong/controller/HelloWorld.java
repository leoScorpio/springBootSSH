package com.beyong.controller;

import com.beyong.entity.Person;
import com.beyong.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/30.
 */
@RestController
@EnableAutoConfiguration
public class HelloWorld {
    @Autowired
    private PersonService personService;


    @RequestMapping("/")
    String home(){
        return "index";
    }

    @RequestMapping("/get")
    public List<Person> getPerson(){
        List<Person> list = personService.getPersons();
        return list;
    }

    @RequestMapping("/getPersonByJDBC")
    public List<Map<String,Object>> getPersonByJDBC(){
        return personService.getPersonByJDBC();
    }
}
