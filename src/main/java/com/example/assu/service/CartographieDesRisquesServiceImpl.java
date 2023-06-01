package com.example.assu.service;

import com.example.assu.model.CartographieDesRisques;
import com.example.assu.repository.CartographieDesRisquesRepo;
import com.example.assu.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartographieDesRisquesServiceImpl implements CartographieDesRisquesService{

    @Autowired
    private CartographieDesRisquesRepo cartographieDesRisquesRepo;

    @Override
    public List<CartographieDesRisques> getAllCartographieDesRisques() {
        return cartographieDesRisquesRepo.findAll();
    }

    @Override
    public CartographieDesRisques getcartographieDesRisquesbyId(Integer id) {
        return cartographieDesRisquesRepo.findById(id).get();
    }

    @Override
    public CartographieDesRisques addCartographieDesRisques(CartographieDesRisques cartographieDesRisques) {
        return cartographieDesRisquesRepo.save(cartographieDesRisques);
    }

    @Override
    public ResponseEntity<MessageResponse> editCartographieDesRisques(Integer id, CartographieDesRisques cartographieDesRisques) {
        Optional<CartographieDesRisques> optionalCartographie = cartographieDesRisquesRepo.findById(id);
        if (optionalCartographie.isPresent()) {
            CartographieDesRisques editedCartographie = optionalCartographie.get();

            editedCartographie.setContratAssurance(cartographieDesRisques.getContratAssurance());
            editedCartographie.setQuelContrats(cartographieDesRisques.getQuelContrats());
            editedCartographie.setAutre(cartographieDesRisques.getAutre());
            editedCartographie.setCompagnie(cartographieDesRisques.getCompagnie());
            editedCartographie.setBudget(cartographieDesRisques.getBudget());
            editedCartographie.setPeriodiciteBudget(cartographieDesRisques.getPeriodiciteBudget());
            editedCartographie.setDateEcheance(cartographieDesRisques.getDateEcheance());
            cartographieDesRisquesRepo.save(editedCartographie);
            MessageResponse messageResponse = new MessageResponse("Cartographie Des Risques modifier avec succes");
            return ResponseEntity.ok(messageResponse);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<MessageResponse> deleteCartographieDesRisques(Integer id) {
        Optional<CartographieDesRisques> optionalCartographie = cartographieDesRisquesRepo.findById(id);
        if (optionalCartographie.isPresent()) {
            cartographieDesRisquesRepo.deleteById(id);
            MessageResponse messageResponse = new MessageResponse("Cartographie Des Risques supprimer avec succes");
            return ResponseEntity.ok(messageResponse);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
