package com.stimb.quisioneradmin.repository;

import com.stimb.quisioneradmin.entity.stimb2.ReffTahunAjaran;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Yusfia Hafid A on 12/30/2015.
 */
@Repository
public interface ReffTahunAjaranRepository extends PagingAndSortingRepository<ReffTahunAjaran,Long> {
    @Query("SELECT p FROM ReffTahunAjaran p")
    public List<ReffTahunAjaran> findAllList();
    @Query("SELECT p FROM ReffTahunAjaran p, KalenderAkademik k WHERE p.kalenderAkademik = k AND p.namaTahunAjaran LIKE %:thjar% AND p.periode LIKE %:sem% ORDER BY k.tanggal ASC")
    public List<ReffTahunAjaran> findReferedKalenderAkademikList(@Param("thjar") String thjar, @Param("sem") String sem);
}