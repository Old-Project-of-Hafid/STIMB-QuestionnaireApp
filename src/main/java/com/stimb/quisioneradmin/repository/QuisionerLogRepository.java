package com.stimb.quisioneradmin.repository;

import com.stimb.quisioneradmin.entity.stimb2.QuisionerLog;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Yusfia Hafid A on 1/3/2016.
 */
@Repository
public interface QuisionerLogRepository extends PagingAndSortingRepository<QuisionerLog,Long> {
}
