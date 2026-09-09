
// ====================== RESPONSES ======================

data class LoginResponse(
    val accessToken: String,
    val refreshToken: String,
    val user: UserResponse
)

data class UserResponse(
    val id: String,
    val fullName: String,
    val email: String,
    val phone: String? = null,
    val isEmailVerified: Boolean = false,
    val profileImage: String? = null
)