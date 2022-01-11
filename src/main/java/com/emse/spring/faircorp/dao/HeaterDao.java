package com.emse.spring.faircorp.dao;


import com.emse.spring.faircorp.model.Heater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HeaterDao extends JpaRepository<Heater, Long> {

    @Query("select h from Heater h where h.name=:name")
    Heater findByName(@Param("name") String name);

    @Query("select h from Heater h inner join h.room r where r.id in :id_list")
    List<Heater> findAllById(@Param("id_list") List<Long> id_list);

    @Query("select h from Heater h where h.id=:id")
    Heater getById(@Param("id") Long id);

    @Modifying
    @Query("delete from Heater h where h.room.id=:id")
    void deleteByRoom(@Param("id")Long id);

}