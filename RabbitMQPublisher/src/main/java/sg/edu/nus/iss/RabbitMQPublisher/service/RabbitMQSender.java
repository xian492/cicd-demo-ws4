package sg.edu.nus.iss.RabbitMQPublisher.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.RabbitMQPublisher.model.Employee;

@Service
public class RabbitMQSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${app.rabbitmq.exchange}")
    private String exchange;

    @Value("${app.rabbitmq.routingkey}")
    private String routingkey;

    public void send(Employee company) {
        rabbitTemplate.convertAndSend(exchange, routingkey, company);
        System.out.println("Send msg = " + company);

    }
}
