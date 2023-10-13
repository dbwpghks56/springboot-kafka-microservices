package net.javaguides.emailservice.application;

import lombok.RequiredArgsConstructor;
import net.javaguides.basedomains.presentation.dto.event.OrderEvent;
import net.javaguides.emailservice.domain.service.EmailService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailFacade {
    private final EmailService emailService;

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent orderEvent) {
        emailService.consume(orderEvent);
    }
}
