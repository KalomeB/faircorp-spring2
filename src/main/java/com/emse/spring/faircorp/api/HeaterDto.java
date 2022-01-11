package com.emse.spring.faircorp.api;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.HeaterStatus;
import com.emse.spring.faircorp.model.Room;

public class HeaterDto {
    private Long id;
    private String name;
    private Long power;
    private HeaterStatus heaterStatus;
    private Long roomId;

    public HeaterDto() {
    }

    public HeaterDto(Heater Heater) {
        this.id = Heater.getId();
        this.name = Heater.getName();
        this.power = Heater.getPower();
        this.heaterStatus = Heater.getHeaterStatus();
        this.roomId = Heater.getRoom().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public HeaterStatus getHeaterStatus() {
        return heaterStatus;
    }

    public void setHeaterStatus(HeaterStatus heaterStatus) {
        this.heaterStatus = heaterStatus;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }
}
