package users.models.get_request

import app.entities.MobileRole
import app.entities.UserRole
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.time.LocalDateTime
import java.util.*

@Serializable
data class UserResponse(
    @Contextual val publicId: UUID,
    val email: String?,
    val username: String,
    val displayName: String,

    val phone : String?,
    val avatarUrl: String?,
    val bio : String?,
    val isVerified: Boolean?,
    val role: UserRole?,
    val mobileRole: MobileRole?,
    @Contextual val createdAt: LocalDateTime
)

