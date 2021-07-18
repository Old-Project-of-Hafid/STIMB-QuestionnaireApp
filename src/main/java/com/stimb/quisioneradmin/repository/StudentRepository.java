package com.stimb.quisioneradmin.repository;

import com.stimb.quisioneradmin.entity.stimb2.MasterMahasiswa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Yusfia Hafid A on 12/10/2015.
 */
@Repository
public interface StudentRepository extends PagingAndSortingRepository<MasterMahasiswa,Long> {
    @Query("SELECT p FROM MasterMahasiswa p WHERE LOWER(p.npm) = LOWER(:npm)")
    public MasterMahasiswa findByNPM(@Param("npm") String npm);

}
