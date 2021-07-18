package com.stimb.quisioneradmin.repository;

import com.stimb.quisioneradmin.entity.stimb2.Quisioner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Yusfia Hafid A on 1/3/2016.
 */

@Repository
public interface QuisionerRepository extends PagingAndSortingRepository<Quisioner,Long> {
    @Query("SELECT p FROM Quisioner p WHERE p.aktifasi = :pid")
    public List<Quisioner> findActive(@Param("pid") boolean pid);
    @Query("SELECT p FROM Quisioner p")
    public List<Quisioner> findAll();
}
