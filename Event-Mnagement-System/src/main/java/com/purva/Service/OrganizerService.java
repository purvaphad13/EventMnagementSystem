package com.purva.Service;

import com.purva.Repository.OrganizerRepository;
import com.purva.model.Organizer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizerService {
    private final OrganizerRepository organizerRepository;

    public OrganizerService(OrganizerRepository organizerRepository) {
        this.organizerRepository = organizerRepository;
    }

    public Organizer createOrganizer(Organizer organizer) {
        return organizerRepository.save(organizer);
    }

    public List<Organizer> getAllOrganizers() {
        return organizerRepository.findAll();
    }

    public Organizer getOrganizerById(Long id) {
        return organizerRepository.findById(id);   //orElseThrow(() -> new RuntimeException("Organizer not found"));
    }

    public Organizer updateOrganizer(Long id, Organizer organizerDetails) {
        Organizer organizer = getOrganizerById(id);
        organizer.setName(organizerDetails.getName());
        organizer.setContactInfo(organizerDetails.getContactInfo());
        return organizerRepository.save(organizer);
    }

    public void deleteOrganizer(Long id) {
        organizerRepository.deleteById(id);
    }
}
