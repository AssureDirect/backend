package com.example.assu.controleur;

import com.example.assu.model.CartographieDesRisques;
import com.example.assu.response.MessageResponse;
import com.example.assu.service.CartographieDesRisquesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CartographieDesRisques")
public class CartographieDesRisquesServiceController {

    @Autowired
    private CartographieDesRisquesService cartographieDesRisquesService;

    @GetMapping("/")
    public List<CartographieDesRisques> getAllCartographieDesRisques() {
        List<CartographieDesRisques> cartographieDesRisques = cartographieDesRisquesService.getAllCartographieDesRisques();
        return cartographieDesRisques;
    }

    @GetMapping("/{id}")
    public CartographieDesRisques getCartographieDesRisquesByID(@PathVariable("id") Integer id) {
        CartographieDesRisques cartographieDesRisques = cartographieDesRisquesService.getcartographieDesRisquesbyId(id);
        return cartographieDesRisques;
    }

    @PostMapping("/addCartographieDesRisques")
    public CartographieDesRisques addNewCartographieDesRisques(@RequestBody CartographieDesRisques cartographieDesRisques) {
        CartographieDesRisques cartographieDesRisques1 = cartographieDesRisquesService.addCartographieDesRisques(cartographieDesRisques);
        return cartographieDesRisques1;
    }

    @PutMapping("/editCartographieDesRisques/{id}")
    public ResponseEntity<MessageResponse> updateCartographieDesRisquesByID(@PathVariable("id") Integer id, @RequestBody CartographieDesRisques cartographieDesRisques) {
        ResponseEntity<MessageResponse> response = cartographieDesRisquesService.editCartographieDesRisques(id, cartographieDesRisques);
        return response;
    }

    @DeleteMapping("/deleteCartographieDesRisques/{id}")
    public ResponseEntity<MessageResponse> deleteCartographieDesRisquesById(@PathVariable("id") Integer id) {
        ResponseEntity<MessageResponse> response = cartographieDesRisquesService.deleteCartographieDesRisques(id);
        return response;
    }
}
