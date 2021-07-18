package com.stimb.quisioneradmin.repository;

import com.stimb.quisioneradmin.entity.stimb2.ListJadwalPerkuliahan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Yusfia Hafid A on 1/2/2016.
 */
@Repository
public interface ListJadwalPerkuliahanRepository extends PagingAndSortingRepository<ListJadwalPerkuliahan,Long> {
    @Query("SELECT p FROM ListJadwalPerkuliahan p, KelasPerkuliahan k WHERE p.kelasPerkuliahan = k AND k.id = :mstdid")
    public List<ListJadwalPerkuliahan> findByKelasId(@Param("mstdid") Long mstdid);
}
