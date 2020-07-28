package com.home.yx.controller;

import com.home.yx.model.Person;
import com.home.yx.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Resource
    private PersonService personService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Map<String, Object> listPersons() {
        Map<String, Object> map = new HashMap<>();
        List<Person> personList = personService.listPerson();
        map.put("personList", personList);

        return map;
    }
}
