package net.javaguides.basedomains.presentation.dto.event;

import lombok.*;
import net.javaguides.basedomains.presentation.dto.response.OrderResponseDto;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderEvent {
    private String message;
    private String status;
    private OrderResponseDto order;
}
