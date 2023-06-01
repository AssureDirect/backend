package com.example.assu.service;

import com.example.assu.model.CartographieDesRisques;
import com.example.assu.response.MessageResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CartographieDesRisquesService {
    List<CartographieDesRisques> getAllCartographieDesRisques();

    CartographieDesRisques getcartographieDesRisquesbyId(Integer id);

    CartographieDesRisques addCartographieDesRisques(CartographieDesRisques cartographieDesRisques);

    ResponseEntity<MessageResponse> editCartographieDesRisques(Integer id, CartographieDesRisques cartographieDesRisques);

    ResponseEntity<MessageResponse> deleteCartographieDesRisques(Integer id);
}
