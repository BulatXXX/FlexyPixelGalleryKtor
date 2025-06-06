package auth.models.register_request

import kotlinx.serialization.Serializable

@Serializable
data class RegisterRequest(
    val email: String,
    val login: String,
    val displayName: String,
    val password: String,
    val phone: String? = null
)
