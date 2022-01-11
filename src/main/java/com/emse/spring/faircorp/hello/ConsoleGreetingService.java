package com.emse.spring.faircorp.hello;

import static java.lang.System.out;
import org.springframework.stereotype.Service;

@Service
public class ConsoleGreetingService implements GreetingService {
    public void greet (String args){
        System.out.println("Hello, " + args + "!");
    }
}
