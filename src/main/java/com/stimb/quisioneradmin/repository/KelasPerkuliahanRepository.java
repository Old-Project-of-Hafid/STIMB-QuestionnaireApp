package com.stimb.quisioneradmin.repository;

import com.stimb.quisioneradmin.entity.stimb2.KartuRencanaStudi;
import com.stimb.quisioneradmin.entity.stimb2.KelasPerkuliahan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Yusfia Hafid A on 1/22/2016.
 */

@Repository
public interface KelasPerkuliahanRepository extends PagingAndSortingRepository<KelasPerkuliahan,Long> {
}
