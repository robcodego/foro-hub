package com.alura.restapiforohubchallenge.domain.login.user;

import jakarta.validation.constraints.NotNull;

public record AuthenticationUserDTO(

        @NotNull
        String username,

        @NotBlank
        String password
) {
}
