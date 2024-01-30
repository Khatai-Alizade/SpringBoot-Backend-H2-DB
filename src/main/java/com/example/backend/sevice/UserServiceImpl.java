package com.example.backend.sevice;

import com.example.backend.dto.UserViewDTO;
import com.example.backend.exceptions.NotFoundException;
import com.example.backend.repository.UserRepository;
import com.example.backend.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserViewDTO getUserById(Long id) {
        final User user=userRepository.findById(id).orElseThrow(()->new NotFoundException("Id Not found..."));
        return UserViewDTO.of(user);
    }
}
