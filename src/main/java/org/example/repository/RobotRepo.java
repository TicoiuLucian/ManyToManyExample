package org.example.repository;

import org.example.entity.Robot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RobotRepo extends JpaRepository<Robot, Integer> {
}
