package com.back.domain.api.request

import jakarta.validation.constraints.NotBlank

data class TokenRefreshRequest(
    @field:NotBlank(message = "리프레시 토큰은 필수 입력값입니다.")
    val refreshToken: String
)
