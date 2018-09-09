package com.beyong.service.serviceImpl;

import com.beyong.entity.Person;
import com.beyong.mapper.PersonMapper;
import com.beyong.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/30.
 */
@Service()
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Person> getPersons() {
        List<Person> list = personMapper.getPersons();
        return list;
    }

    @Override
    public List<Map<String,Object>> getPersonByJDBC() {
        String sql = "SELECT * FROM PERSONS";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

}
