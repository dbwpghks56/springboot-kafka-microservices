package net.javaguides.emailservice.domain.service;

import net.javaguides.basedomains.presentation.dto.event.OrderEvent;

public interface EmailCommandUseCase {
    void consume(OrderEvent orderEvent);
}
