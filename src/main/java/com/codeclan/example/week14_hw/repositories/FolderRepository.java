package com.codeclan.example.week14_hw.repositories;
import com.codeclan.example.week14_hw.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
