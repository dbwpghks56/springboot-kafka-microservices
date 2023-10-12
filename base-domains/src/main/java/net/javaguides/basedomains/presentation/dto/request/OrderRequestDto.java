package net.javaguides.basedomains.presentation.dto.request;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class OrderRequestDto {
    private String orderId;
    private String name;
    private int qty;
    private double price;
}
