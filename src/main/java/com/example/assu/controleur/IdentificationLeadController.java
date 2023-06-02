package com.example.assu.controleur;

import com.example.assu.model.CartographieDesRisques;
import com.example.assu.model.IdentificationLead;
import com.example.assu.response.MessageResponse;
import com.example.assu.service.CartographieDesRisquesService;
import com.example.assu.service.IdentificationLeadService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/IdentificationLead")
public class IdentificationLeadController {
    @Autowired
    private IdentificationLeadService identificationLeadService;

    @GetMapping("/")
    public List<IdentificationLead> getAllIdentificationLead() {
        List<IdentificationLead> allIdentificationLeads = identificationLeadService.getAllIdentificationLead();
        return allIdentificationLeads;
    }

    @GetMapping("/{id}")
    public IdentificationLead getIdentificationLeadByID(@PathVariable("id") Integer id) {
        IdentificationLead identificationLead = identificationLeadService.getIdentificationLeadbyId(id);
        return identificationLead;
    }

    @PostMapping("/addIdentificationLead")
    public IdentificationLead addNewIdentificationLead(@RequestBody IdentificationLead identificationLead) {
        IdentificationLead newIdentificationLead = identificationLeadService.addIdentificationLead(identificationLead);
        return newIdentificationLead;
    }

    @PutMapping("/editIdentificationLead/{id}")
    public ResponseEntity<MessageResponse> updateIdentificationLeadByID(@PathVariable("id") Integer id, @RequestBody IdentificationLead identificationLead) {
        ResponseEntity<MessageResponse> response = identificationLeadService.editIdentificationLead(id, identificationLead);
        return response;
    }

    @DeleteMapping("/deleteCartographieDesRisques/{id}")
    public ResponseEntity<MessageResponse> deleteIdentificationLeadById(@PathVariable("id") Integer id) {
        ResponseEntity<MessageResponse> response = identificationLeadService.deleteIdentificationLead(id);
        return response;
    }
}
