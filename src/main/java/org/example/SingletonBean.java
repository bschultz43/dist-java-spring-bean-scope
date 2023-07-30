package org.example;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.printf("I am the singleton");
    }
}
