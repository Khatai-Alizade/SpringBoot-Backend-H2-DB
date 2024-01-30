package com.example.backend.sevice;

import com.example.backend.dto.UserViewDTO;
import com.example.backend.model.User;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserService {

    UserViewDTO getUserById( Long id);
     

}
