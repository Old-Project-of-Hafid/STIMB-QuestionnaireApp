package com.stimb.quisioneradmin.repository;

import com.stimb.quisioneradmin.entity.stimb2.MahasiswaDetaill;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Yusfia Hafid A on 12/26/2015.
 */
@Repository
public interface MahasiswaDetailRepository extends PagingAndSortingRepository<MahasiswaDetaill,Long> {
    //@Query("SELECT p FROM MahasiswaDetaill p WHERE p.id = LOWER(:studentId)")
    //public MahasiswaDetaill findByNPM(@Param("studentId") String studentId);
}
