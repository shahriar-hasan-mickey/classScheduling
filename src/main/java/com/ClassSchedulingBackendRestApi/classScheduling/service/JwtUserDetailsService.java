package com.ClassSchedulingBackendRestApi.classScheduling.service;

//import com.ClassSchedulingBackendRestApi.classScheduling.dao.UserDao;
//import com.ClassSchedulingBackendRestApi.classScheduling.model.DAOUser;
//import com.ClassSchedulingBackendRestApi.classScheduling.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

//    @Autowired
//    private UserDao userDao;

//    @Autowired
//    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        DAOUser user = (DAOUser) userDao.findByUsername(username);
        if("jwtProjectSecret".equals(username)){
            //$2a$10$QlJK2Vu7IsNZwJ37wy4mPOGFnVCzbcQdfQ755IiwAO6OS7J7N.urK
//            return new User("{$jwt.secret}", "{$jwt.secret}",  new ArrayList<>());
            return new User("jwtProjectSecret", "$2a$10$QlJK2Vu7IsNZwJ37wy4mPOGFnVCzbcQdfQ755IiwAO6OS7J7N.urK", new ArrayList<>());
        }else{
            throw new UsernameNotFoundException("User not found with the username: " + username);
        }
    }

//    public UserDao save(UserDTO user){
//        DAOUser daoUser = new DAOUser();
//        daoUser.setUsername(user.getUsername());
//        daoUser.setPassword(bcryptEncoder.encode(user.getPassword()));
//        return (UserDao) userDao.save(daoUser);
//    }


}
