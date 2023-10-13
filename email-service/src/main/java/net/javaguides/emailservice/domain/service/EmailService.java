package net.javaguides.emailservice.domain.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.javaguides.basedomains.presentation.dto.event.OrderEvent;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmailService implements EmailCommandUseCase{
    @Override
    public void consume(OrderEvent orderEvent) {
        log.info(String.format("Receive order event => %s", orderEvent));

        // send Email.
    }
}
