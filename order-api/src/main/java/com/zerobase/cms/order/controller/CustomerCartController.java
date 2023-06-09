package com.zerobase.cms.order.controller;

import com.zerobase.cms.order.domain.product.AddProductCartForm;
import com.zerobase.cms.order.domain.redis.Cart;
import com.zerobase.cms.order.service.CartService;
import com.zerobase.domain.config.JwtAuthenticationProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer/cart")
public class CustomerCartController {
    private final CartService cartService;
    private final JwtAuthenticationProvider provider;

    @PostMapping
    public ResponseEntity<Cart> addCart(@RequestHeader(name = "X_AUTH_TOKEN") String token,
                                        @RequestBody AddProductCartForm form){
        return ResponseEntity.ok(cartService.addCart(provider.getUserVo(token).getId(), form));
    }
}
