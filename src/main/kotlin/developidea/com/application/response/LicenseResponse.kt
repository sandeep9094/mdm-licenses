package developidea.com.application.response

import developidea.com.domain.model.Device
import kotlinx.serialization.Serializable

@Serializable
data class LicenseResponse(
    val id: String,
    val key: String,
    val expiryTimestamp: String?,
    val device: Device?,
)