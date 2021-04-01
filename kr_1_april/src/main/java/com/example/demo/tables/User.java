package com.example.demo.tables;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name ='User')
public class User {
    public User(String login, String surname, String name, String father_name, LocalDate birthday){
        this.login = login;
        this.surname=surname;
        this.name=name;
        this.father_name=father_name;
        this.birthday = birthday;
        }

    @Id
    @GeneratedValue(generator = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Login", nullable = false)
    private String login;

    @Column(name = "Surname", nullable = false)
    private String surname;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Father Name", nullable = false)
    private String father_name;

    @Column(name = "Birthday")
    private LocalDate birthday;

    @CreatedDate
    @Column(name = "Created")
    private LocalDate created;

    @LastModifiedDate
    @Column(name = "Updated")
    private LocalDate updated;

    public User(){}

    public Long getId() {
        return id;
        }

    public String getLogin() {
        return login;
        }

    public String getSurname() {
        return surname;
        }

    public String getName() {
        return name;
        }

    public String getFather_name() {
        return father_name;
        }

    public LocalDate getBirthday() {
        return birthday;
        }

    public LocalDate getCreated() {
        return created;
        }

    public LocalDate getUpdated() {
        return updated;
        }

    public Set<Task> getTask() {
        return task;
        }

    public void setId(Long id) {
        this.id = id;
        }

    public void setLogin(String login) {
        this.login = login;
        }

    public void setSurname(String surname) {
        this.surname = surname;
        }

    public void setName(String name) {
        this.name = name;
        }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
        }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        }

    public void setCreated(LocalDate created) {
        this.created = created;
        }

    public void setUpdated(LocalDate updated) {
        this.updated = updated;
        }

    public void setTask(Set<Task> task) {
        this.task = task;
        }

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_Id", nullable = false)
    private Set<Task> task;

    @Override
    public String toString() {
        return "User{" +
        "ID=" + id +
        ", Login='" + login + '\'' +
        ", Surname='" + surname + '\'' +
        ", Name='" + name + '\'' +
        ", Father name='" + father_name + '\'' +
        ", Birthday=" + birthday +
        '}';
        }
}