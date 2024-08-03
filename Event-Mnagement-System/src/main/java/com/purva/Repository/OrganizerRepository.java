package com.purva.Repository;

import java.util.List;

import com.purva.model.Organizer;

public interface OrganizerRepository {

	Organizer save(Organizer organizer);

	List<Organizer> findAll();

	Organizer findById(Long id);

	void deleteById(Long id);

}
