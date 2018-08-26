package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetinServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Setter : Hello Gurus !";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;

    }
}
