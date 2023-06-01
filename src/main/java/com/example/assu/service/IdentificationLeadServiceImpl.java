package com.example.assu.service;

import com.example.assu.model.CartographieDesRisques;
import com.example.assu.model.IdentificationLead;
import com.example.assu.repository.IdentificationLeadRepository;
import com.example.assu.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public class IdentificationLeadServiceImpl implements IdentificationLeadService{
    @Autowired
    private IdentificationLeadRepository identificationLeadRepository;
    @Override
    public List<IdentificationLead> getAllIdentificationLead() {
        return identificationLeadRepository.findAll();
    }

    @Override
    public IdentificationLead getIdentificationLeadbyId(Integer id) {
        return identificationLeadRepository.findById(id).get();
    }

    @Override
    public IdentificationLead addIdentificationLead(IdentificationLead identificationLead) {
        return identificationLeadRepository.save(identificationLead);
    }

    @Override
    public ResponseEntity<MessageResponse> editIdentificationLead(Integer id, IdentificationLead identificationLead) {
        Optional<IdentificationLead> optionalIdentificationLead = identificationLeadRepository.findById(id);
        if (optionalIdentificationLead.isPresent()) {
            IdentificationLead editedIdentificationLead = optionalIdentificationLead.get();

            editedIdentificationLead.setConseiller(identificationLead.getConseiller());
            editedIdentificationLead.setAgence(identificationLead.getAgence());
            editedIdentificationLead.setAutre(identificationLead.getAutre());
            editedIdentificationLead.setStatus(identificationLead.getStatus());
            editedIdentificationLead.setPortfeilleOrigine(identificationLead.getPortfeilleOrigine());
            editedIdentificationLead.setCommentConnu(identificationLead.getCommentConnu());
            editedIdentificationLead.setNomParrain(identificationLead.getNomParrain());
            editedIdentificationLead.setAutre(identificationLead.getAutre());
            editedIdentificationLead.setTypeContact(identificationLead.getTypeContact());
            editedIdentificationLead.setEligibiliteBlocTel(identificationLead.getEligibiliteBlocTel());

            cartographieDesRisquesRepo.save(editedCartographie);
            MessageResponse messageResponse = new MessageResponse("Cartographie Des Risques modifier avec succes");
            return ResponseEntity.ok(messageResponse);
        } else {
            return ResponseEntity.notFound().build();
        }    }

    @Override
    public ResponseEntity<MessageResponse> deleteIdentificationLead(Integer id) {
        return null;
    }
}
