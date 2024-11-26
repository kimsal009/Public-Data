package co.istad.reporting.features.auth;

import co.istad.reporting.features.auth.dto.AuthResponse;
import co.istad.reporting.features.auth.dto.LoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    AuthResponse login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest.username(),
                loginRequest.password());
    }

}
