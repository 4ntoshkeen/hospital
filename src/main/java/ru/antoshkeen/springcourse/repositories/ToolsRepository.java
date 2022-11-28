package ru.antoshkeen.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.antoshkeen.springcourse.models.Tool;

@Repository
public interface ToolsRepository extends JpaRepository<Tool, Integer> {
}
