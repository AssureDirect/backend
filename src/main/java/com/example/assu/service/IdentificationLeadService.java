package com.example.assu.service;

import com.example.assu.model.IdentificationLead;
import com.example.assu.response.MessageResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IdentificationLeadService {
    List<IdentificationLead> getAllIdentificationLead();

    IdentificationLead getIdentificationLeadbyId(Integer id);

    IdentificationLead addIdentificationLead(IdentificationLead identificationLead);

    ResponseEntity<MessageResponse> editIdentificationLead(Integer id, IdentificationLead identificationLead);

    ResponseEntity<MessageResponse> deleteIdentificationLead(Integer id);
}
