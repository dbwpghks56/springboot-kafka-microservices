package net.javaguides.stockservice.domain.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.javaguides.basedomains.presentation.dto.event.OrderEvent;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class StockService implements StockCommandUseCase {
    @Override
    public void consume(OrderEvent orderEvent) {
        log.info(String.format("Receive Order Event in Stock => %s", orderEvent));

        // save the order event into the database

    }
}
