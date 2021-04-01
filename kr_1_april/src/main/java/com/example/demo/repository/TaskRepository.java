package com.example.demo.repository;
import com.example.demo.tables.Category;
import com.example.demo.tables.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
}