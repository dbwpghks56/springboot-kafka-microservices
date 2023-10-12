package net.javaguides.orderservice.domain.service;

import net.javaguides.basedomains.presentation.dto.event.OrderEvent;

public interface OrderCommandUseCase {
    void sendMessage(OrderEvent orderEvent);
}
