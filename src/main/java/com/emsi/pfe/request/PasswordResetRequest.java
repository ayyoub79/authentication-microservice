package com.emsi.pfe.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data @AllArgsConstructor @NoArgsConstructor
public class PasswordResetRequest {
    @NotBlank(message ="Old password must be not empty bro !!!!!")
    @NotNull(message ="This field is required !!!")
    @Size(min = 2)
    private String oldPassword;
    @NotBlank(message ="new password must be not empty bro !!!!!")
    @NotNull(message ="This field is required !!!")
    @Size(min = 2)
    private String newPassword;
}
