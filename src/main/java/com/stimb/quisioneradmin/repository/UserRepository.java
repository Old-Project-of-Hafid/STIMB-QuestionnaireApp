package com.stimb.quisioneradmin.repository;

import com.stimb.quisioneradmin.entity.account.User;
import com.stimb.quisioneradmin.entity.stimb2.ReffTahunAjaran;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Yusfia Hafid A on 1/9/2016.
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<User,Long> {
    @Query("SELECT p FROM User p WHERE p.username = :username AND p.password = :password")
    public User findByUserNameandId(@Param("username") String username, @Param("password") String password);
    @Query("SELECT p FROM User p WHERE p.username = :username")
    public User findByUserName(@Param("username") String username);
}
