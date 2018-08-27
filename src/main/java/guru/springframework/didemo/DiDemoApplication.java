package guru.springframework.didemo;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.controllers.SetterInjectedController;
import guru.springframework.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

		MyController myController = (MyController) context.getBean("myController");
		System.out.println(myController.hello());

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");

		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");

		System.out.println(propertyInjectedController.sayHello());
		System.out.println(setterInjectedController.sayHello());
		System.out.println(constructorInjectedController.sayHello());

		FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource);

	}
}
