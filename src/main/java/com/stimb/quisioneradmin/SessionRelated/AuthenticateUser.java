package com.stimb.quisioneradmin.SessionRelated;

import com.stimb.quisioneradmin.entity.account.User;
import com.stimb.quisioneradmin.repository.UserRepository;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.io.Serializable;

/**
 * Created by Yusfia Hafid A on 1/9/2016.
 */

@Service("userService")
public class AuthenticateUser implements Serializable{
    @Inject
    private UserRepository userRepository;

    public boolean authenticate(String username, String password) {
        User user = userRepository.findByUserNameandId(username, md5.encrypt(password));
        if (user != null) {
            return true;
        } else {
            return false;
        }
    }
}
