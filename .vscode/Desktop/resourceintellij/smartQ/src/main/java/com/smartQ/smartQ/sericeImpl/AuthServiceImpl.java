package com.smartQ.smartQ.sericeImpl;
import com.smartQ.smartQ.dto.*;
import com.smartQ.smartQ.entity.User;
import com.smartQ.smartQ.repository.UserRepository;
import com.smartQ.smartQ.security.JwtUtil;
import com.smartQ.smartQ.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public String register(RegisterRequestDto request) {

        User user = new User();

        user.setName(request.getName());

        user.setEmail(request.getEmail());

        user.setPassword(

                passwordEncoder.encode(request.getPassword()));

        user.setRole(request.getRole());

        userRepository.save(user);

        return "User Registered Successfully";
    }

    @Override
    public AuthResponseDto login(LoginRequestDto request) {

        User user = userRepository.findByEmail(request.getEmail())

                .orElseThrow(() ->

                        new RuntimeException("User Not Found"));

        if (!passwordEncoder.matches(

                request.getPassword(),

                user.getPassword())) {

            throw new RuntimeException("Invalid Password");
        }

        String token =

                jwtUtil.generateToken(user.getEmail());

        return new AuthResponseDto(token);
    }
}

