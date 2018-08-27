package guru.springframework.didemo.config;

import guru.springframework.didemo.examplebeans.FakeDataSource;
import guru.springframework.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasources.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasources.properties"),
        @PropertySource("classpath:jms.properties")}
)
public class PropertyConfig {

    @Value("${guru.username}")
    private String username;

    @Value("${guru.password}")
    private String password;

    @Value("${guru.dburl}")
    private String url;

    @Value("${guru.jms.username}")
    private String jmsUsername;

    @Value("${guru.jms.password}")
    private String jmsPassword;

    @Value("${guru.jms.url}")
    private String jmsUrl;

    @Autowired
    private Environment environment;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource= new FakeDataSource();
        fakeDataSource.setUsername(environment.getProperty("username"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker= new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
