package com.example.demo.tables;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "Task")
public class Task {
    public Task(String naming, String description, String finished){
        this.name=name;
        this.description=description;
        this.success=success;
    }
    @Id
    @GeneratedValue(generator = "TaskId")
    private Long id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Description", nullable = false)
    private String description;

    @Column(name = "Deadline", nullable = false)
    private LocalDate deadline;

    @Column(name = "Success", nullable = false)
    private String success;


    @CreatedDate
    @Column(name = "created")
    private LocalDate created;

    @LastModifiedDate
    @Column(name = "updated")
    private LocalDate updated;

    public Task(){}

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Client_Id", nullable = false)
    private User user;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "Category_Id", nullable = false)
    private Set<Category> category;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public String getSuccess() {
        return success;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getUpdated() {
        return updated;
    }

    public User getUser() {
        return user;
    }

    public Set<Category> getCategory() {
        return category;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public void setUpdated(LocalDate updated) {
        this.updated = updated;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCategory(Set<Category> category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", success='" + success + '\'' +
                ", user=" + user +
                ", category=" + category +
                '}';
    }
}
