package sg.edu.nus.iss.rabbitmqdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

// References
// https://springhow.com/spring-boot-rabbitmq/
// https://www.appsdeveloperblog.com/messaging-using-rabbitmq-in-spring-boot-application/
// https://www.javainuse.com/spring/spring-boot-rabbitmq-hello-world
// https://medium.com/aspnetrun/microservices-event-driven-architecture-with-rabbitmq-and-docker-container-on-net-968d73052cbb

@EnableScheduling
@SpringBootApplication
public class RabbitmqDemoApplication {

	@Autowired
	static
	RabbitService rbSvc;

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqDemoApplication.class, args);

		rbSvc.pushMessage();
	}

}
