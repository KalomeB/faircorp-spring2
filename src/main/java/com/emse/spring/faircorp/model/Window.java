package com.emse.spring.faircorp.model;

import javax.persistence.*;

/** Represents a window
*/

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

    /** Creates a window with the specified name, status and room
    * @param name       The window's name
    * @param status     The window's status
    * @param room       The window's room
    */
    public Window(String name, WindowStatus status, Room room) {
        this.windowStatus = status;
        this.name = name;
        this.room = room;
    }

    /** Gets the window's ID
    * @return       a Long representing the window's ID
    */
    public Long getId() {
        return this.id;
    }

    /** Sets the window's ID
    * @param id     a Long containing the window's ID
    */
    public void setId(Long id) {
        this.id = id;
    }

    /** Gets the window's room
    * @return       a Room representing the window's room
    */
    public Room getRoom() {
        return room;
    }

    /** Sets the window's room
    * @param room       a Room containing the window's room
    */
    public void setRoom(Room room) {
        this.room = room;
    }

    /** Gets the window's name
    * @return       a String representing the window's name
    */
    public String getName() {
        return name;
    }

    /** Sets the window's name
    * @param name       a String containing the window's name
    */
    public void setName(String name) {
        this.name = name;
    }

    /** Gets the window's status
    * @return       a WindowStatus representing the window's status
    */
    public WindowStatus getWindowStatus() {
        return windowStatus;
    }

    /** Sets the window's status
    * @param windowStatus       a WindowStatus containing the window's status
    */
    public void setWindowStatus(WindowStatus windowStatus) {
        this.windowStatus = windowStatus;
    }
}
