package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryGreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Primary: Hello Gurus !";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;

    }
}
