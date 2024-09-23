package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.Part;
import org.example.repository.PartRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartService {

  private final PartRepo partRepo;

  public Part savePart(final Part part){
    return partRepo.save(part);
  }

  public List<Part> getAllParts(){
    return partRepo.findAll();
  }
}
