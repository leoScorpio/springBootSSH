package com.beyong.mapper;

import com.beyong.entity.Person;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/8/30.
 */
public interface PersonMapper {
    @Select("SELECT * FROM PERSONS")
    public List<Person> getPersons();
}
