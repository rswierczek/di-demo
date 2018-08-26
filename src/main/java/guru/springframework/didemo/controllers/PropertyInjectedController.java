package guru.springframework.didemo.controllers;


import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    private GreetingService greetingService;
    //private GreetingService greetingServiceImpl; //Qualifier by field name - don't do that

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
