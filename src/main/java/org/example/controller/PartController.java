package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.Part;
import org.example.service.PartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/part")
@RequiredArgsConstructor
public class PartController {

  private final PartService partService;

  @PostMapping
  public ResponseEntity<Part> savePart(@RequestBody Part part){
    return new ResponseEntity<>(partService.savePart(part), HttpStatus.OK);
  }
}
