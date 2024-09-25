package org.example.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.example.entity.Part;
import org.example.entity.Robot;
import org.example.repository.PartRepo;
import org.example.repository.RobotRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RobotService {

  private final PartRepo partRepo;
  private final RobotRepo robotRepo;

  public Robot saveRobot(Robot robot) {
    List<Part> newParts = new ArrayList<>();
    for (Part part : robot.getParts()) {
      if (part.getId() == null) {
        newParts.add(part);
      } else {
        Optional<Part> optionalPart = partRepo.findById(part.getId());
        if (optionalPart.isPresent()) {
          newParts.add(optionalPart.get());
        }else {
          throw new EntityNotFoundException("Part with id "+ part.getId() + " not found");
        }
      }
    }
    robot.setParts(newParts);
    return robotRepo.save(robot);
  }
}
