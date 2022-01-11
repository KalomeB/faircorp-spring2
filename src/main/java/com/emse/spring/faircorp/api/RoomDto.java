package com.emse.spring.faircorp.api;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Room;
import com.emse.spring.faircorp.model.Window;

import java.util.Set;
import java.util.stream.Collectors;

public class RoomDto {
    private Long id;
    private String name;
    private int floor;
    private Double currentTemperature;
    private Double targetTemperature;

    private Set<Long> heaterIdList;
    private Set<Long> windowIdList;


    public RoomDto() {
    }

    public RoomDto(Room room) {
        this.id = room.getId();
        this.name = room.getName();
        this.floor = room.getFloor();
        this.currentTemperature = room.getCurrentTemperature();
        this.targetTemperature = room.getTargetTemperature();
        this.heaterIdList = room.getHeaters().stream().map(heater -> heater.getId()).collect(Collectors.toSet());
        this.windowIdList = room.getWindows().stream().map(window -> window.getId()).collect(Collectors.toSet());
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

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(Double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public Double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(Double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public Set<Long> getHeaterIdList() {
        return heaterIdList;
    }

    public void setHeaterIdList(Set<Long> heaterIdList) {
        this.heaterIdList = heaterIdList;
    }

    public Set<Long> getWindowIdList() {
        return windowIdList;
    }

    public void setWindowIdList(Set<Long> windowIdList) {
        this.windowIdList = windowIdList;
    }
}