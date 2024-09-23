package org.example.repository;

import org.example.entity.Part;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartRepo extends JpaRepository<Part, Integer> {
}
