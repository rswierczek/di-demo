package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetinServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Constructor : Hello Gurus !";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;

    }
}
