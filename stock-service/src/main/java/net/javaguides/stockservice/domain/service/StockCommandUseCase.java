package net.javaguides.stockservice.domain.service;

import net.javaguides.basedomains.presentation.dto.event.OrderEvent;

public interface StockCommandUseCase {
    void consume(OrderEvent orderEvent);
}
