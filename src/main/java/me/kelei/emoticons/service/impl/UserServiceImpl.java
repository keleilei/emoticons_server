package me.kelei.emoticons.service.impl;

import me.kelei.emoticons.entity.User;
import me.kelei.emoticons.repository.UserRepository;
import me.kelei.emoticons.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String save(User user) {

        userRepository.save(user);

        return user.getId();
    }
}
