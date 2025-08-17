package sg.edu.nus.iss.rabbitmqdemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class RabbitService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Scheduled(fixedDelay = 5000)
    public void pushMessage() {
        String messageString = "Hello Rabbit @" + LocalDateTime.now().format(DateTimeFormatter.ISO_TIME);
        rabbitTemplate.convertAndSend("hello", messageString);
    }
}
