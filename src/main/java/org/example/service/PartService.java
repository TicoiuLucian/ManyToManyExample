package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.Part;
import org.example.entity.Robot;
import org.example.repository.PartRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartService {

  private final PartRepo partRepo;

  public Part savePart(final Part part){
    for (Robot r : part.getRobots())
      r.addPart(part);
    return partRepo.save(part);
  }

  public List<Part> getAllParts(){
    return partRepo.findAll();
  }
}
