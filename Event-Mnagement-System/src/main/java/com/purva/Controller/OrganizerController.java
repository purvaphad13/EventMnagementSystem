package com.purva.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.purva.Service.OrganizerService;
import com.purva.model.Organizer;

import java.util.List;

@RestController
@RequestMapping("/organizers")
public class OrganizerController {
    private final OrganizerService organizerService;

    public OrganizerController(OrganizerService organizerService) {
        this.organizerService = organizerService;
    }

    @PostMapping
    public ResponseEntity<Organizer> createOrganizer(@RequestBody Organizer organizer) {
        Organizer createdOrganizer = organizerService.createOrganizer(organizer);
        return ResponseEntity.ok(createdOrganizer);
    }

    @GetMapping
    public ResponseEntity<List<Organizer>> getAllOrganizers() {
        List<Organizer> organizers = organizerService.getAllOrganizers();
        return ResponseEntity.ok(organizers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Organizer> getOrganizerById(@PathVariable Long id) {
        Organizer organizer = organizerService.getOrganizerById(id);
        return ResponseEntity.ok(organizer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Organizer> updateOrganizer(@PathVariable Long id, @RequestBody Organizer organizerDetails) {
        Organizer updatedOrganizer = organizerService.updateOrganizer(id, organizerDetails);
        return ResponseEntity.ok(updatedOrganizer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrganizer(@PathVariable Long id) {
        organizerService.deleteOrganizer(id);
        return ResponseEntity.noContent().build();
    }
}
