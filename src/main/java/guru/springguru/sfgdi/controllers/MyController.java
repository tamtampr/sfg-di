package guru.springguru.sfgdi.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){

        System.out.println("Hello World!!! From MyController Class");

        return "Hi Folks";
    }
}
