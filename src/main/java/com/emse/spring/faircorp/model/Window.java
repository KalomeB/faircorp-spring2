package com.emse.spring.faircorp.model;

import javax.persistence.*;

@Entity // (1)
@Table(name = "RWINDOW")// (2)
public class Window {

    @Id // (3)
    @GeneratedValue
    private Long id;

    @ManyToOne(optional = false)
    private Room room;

    @Column(nullable=false) // (4)
    private String name;

    @Enumerated(EnumType.STRING) // (5)
    @Column(nullable=false)
    private WindowStatus windowStatus;

    public Window() {
    }

    public Window(String name, WindowStatus status, Room room) {
        this.windowStatus = status;
        this.name = name;
        this.room = room;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WindowStatus getWindowStatus() {
        return windowStatus;
    }

    public void setWindowStatus(WindowStatus windowStatus) {
        this.windowStatus = windowStatus;
    }
}