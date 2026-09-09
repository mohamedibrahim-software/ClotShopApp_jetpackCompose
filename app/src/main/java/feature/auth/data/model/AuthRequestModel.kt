// ====================== REQUESTS ======================

data class LoginRequest(
    val email: String,
    val password: String
)

data class RefreshTokenRequest(
    val refreshToken: String
)

data class RegisterRequest(
    val fullName: String,
    val email: String,
    val password: String,
    val phone: String? = null
)

data class GoogleMobileRequest(
    val idToken: String
)

data class VerifyEmailRequest(
    val email: String,
    val otp: String
)

data class ChangePasswordRequest(
    val currentPassword: String,
    val newPassword: String
)

data class ForgotPasswordRequest(
    val email: String
)

data class ResendOtpRequest(
    val email: String
)

data class ResetPasswordRequest(
    val email: String,
    val otp: String,
    val newPassword: String
)

data class ValidateOtpRequest(
    val email: String,
    val otp: String
)
