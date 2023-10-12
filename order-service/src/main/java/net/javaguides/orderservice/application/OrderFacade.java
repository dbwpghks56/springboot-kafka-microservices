package net.javaguides.orderservice.application;

import lombok.RequiredArgsConstructor;
import net.javaguides.basedomains.presentation.dto.event.OrderEvent;
import net.javaguides.orderservice.domain.service.OrderCommandUseCase;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderFacade {
    private final OrderCommandUseCase orderCommandUseCase;

    public void sendMessage(OrderEvent orderEvent) {
        orderCommandUseCase.sendMessage(orderEvent);
    }
}
