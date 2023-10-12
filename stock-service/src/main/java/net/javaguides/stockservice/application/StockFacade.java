package net.javaguides.stockservice.application;

import lombok.RequiredArgsConstructor;
import net.javaguides.basedomains.presentation.dto.event.OrderEvent;
import net.javaguides.stockservice.domain.service.StockCommandUseCase;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockFacade {
    private final StockCommandUseCase stockCommandUseCase;

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent orderEvent) {
        stockCommandUseCase.consume(orderEvent);
    }
}
