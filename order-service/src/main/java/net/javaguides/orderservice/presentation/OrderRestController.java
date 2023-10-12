package net.javaguides.orderservice.presentation;

import lombok.RequiredArgsConstructor;
import net.javaguides.basedomains.presentation.dto.request.OrderRequestDto;
import net.javaguides.orderservice.application.OrderFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderRestController {
    private final OrderFacade orderFacade;

    @PostMapping
    public ResponseEntity<String> placeOrder(
            @RequestBody OrderRequestDto orderRequestDto
            ) {
        orderFacade.sendMessage(orderRequestDto);

        return ResponseEntity.ok("Order placed successfully...");
    }
}
