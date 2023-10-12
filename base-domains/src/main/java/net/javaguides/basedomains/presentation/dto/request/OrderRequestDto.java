package net.javaguides.basedomains.presentation.dto.request;

import lombok.*;
import net.javaguides.basedomains.presentation.dto.response.OrderResponseDto;

import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderRequestDto {
    private String name;
    private int qty;
    private double price;

    public OrderResponseDto toResponseDto() {
        return OrderResponseDto.builder()
                .orderId(UUID.randomUUID().toString())
                .name(this.name)
                .qty(this.qty)
                .price(this.price)
                .build();
    }
}
