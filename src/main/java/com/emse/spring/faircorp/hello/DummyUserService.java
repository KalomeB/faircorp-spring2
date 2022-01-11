package com.emse.spring.faircorp.hello;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DummyUserService implements UserService {

    public GreetingService greetingService;

    @Override
    public void greetAll(){
        String[] names = {"Elodie", "Charles"};
        /*for (int i=0; i<2; i++){
            greetingService.greet(names[i]);

        greetingService.greet("Elodie");
        greetingService.greet("Charles");
         }*/

        System.out.println("Hello, " + names[0] +"!");
        System.out.println("Hello, " + names[1] +"!");
    }
}
