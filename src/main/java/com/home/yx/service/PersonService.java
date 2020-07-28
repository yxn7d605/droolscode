package com.home.yx.service;

import com.home.yx.dao.PersonDao;
import com.home.yx.model.Person;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonService {
    @Resource
    private PersonDao personDao;

    public List<Person> listPerson() {
        List<Person> list = personDao.listAll();

        return list;
    }
}
