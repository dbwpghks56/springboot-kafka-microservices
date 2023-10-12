package net.javaguides.orderservice.domain.service;

import net.javaguides.basedomains.presentation.dto.event.OrderEvent;
import net.javaguides.basedomains.presentation.dto.request.OrderRequestDto;

public interface OrderCommandUseCase {
    void sendMessage(OrderRequestDto orderRequestDto);
}
