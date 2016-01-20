package com.mt.dubbo.demo.service;

import com.mt.dubbo.demo.dto.Person;

public interface DemoService {
    String sayHello(String name);

    String getPersonInfo(Person person);
}
