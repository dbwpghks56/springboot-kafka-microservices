package net.javaguides.basedomains.presentation.dto.response;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class OrderResponseDto {
    private String orderId;
    private String name;
    private int qty;
    private double price;
}
