package sg.edu.nus.iss.RabbitMQPublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sg.edu.nus.iss.RabbitMQPublisher.model.Employee;
import sg.edu.nus.iss.RabbitMQPublisher.service.RabbitMQSender;

@SpringBootApplication
public class RabbitMqPublisherApplication {

	// @Autowired
	// static RabbitMQSender rbSvc;

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqPublisherApplication.class, args);

		// rbSvc.send(new Employee("1", "John Doe"));
	}

}
