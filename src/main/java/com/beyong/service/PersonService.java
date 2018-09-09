package com.beyong.service;

import com.beyong.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/30.
 */

public interface PersonService {
    List<Person> getPersons();
    List<Map<String,Object>> getPersonByJDBC();
}
