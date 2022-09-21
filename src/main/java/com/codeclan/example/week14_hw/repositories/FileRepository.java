package com.codeclan.example.week14_hw.repositories;
import com.codeclan.example.week14_hw.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
