package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoomDaoCustom extends JpaRepository<Room, String> {
    @Query("select r from Room r where r.name=:name")
    public Room getByName(@Param("name") String name );
}
