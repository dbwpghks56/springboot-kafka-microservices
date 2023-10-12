package net.javaguides.orderservice.domain.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.javaguides.basedomains.presentation.dto.event.OrderEvent;
import net.javaguides.basedomains.presentation.dto.request.OrderRequestDto;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService implements OrderCommandUseCase {
    private final NewTopic topic;
    private final KafkaTemplate<String, OrderEvent> kafkaTemplate;

    @Override
    public void sendMessage(OrderRequestDto orderRequestDto) {
        log.info(String.format("Order Event : %s", orderRequestDto));

        OrderEvent orderEvent = OrderEvent.builder()
                .status("PENDING")
                .message("order status is in pending state")
                .order(orderRequestDto.toResponseDto())
                .build();

        Message<OrderEvent> message = MessageBuilder
                .withPayload(orderEvent)
                .setHeader(KafkaHeaders.TOPIC, topic.name())
                .build();

        kafkaTemplate.send(message);
    }
}
