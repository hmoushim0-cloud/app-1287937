package sa.factory.app1287937.model

import kotlinx.serialization.Serializable

@Serializable
data class BrandTemplatePackage(
    val id: String,
    val title: String,
    val description: String,
    val priceMinorUnits: Long,
    val iconVector: String = "verified"
)

@Serializable
data class SocialMediaVisualIdentitySystem(
    val requestId: String,
    val items: List<BrandTemplatePackage>,
    val customerPhone: String,
    val totalAmountMinorUnits: Long,
    val status: SocialMediaVisualIdentitySystemStatus = SocialMediaVisualIdentitySystemStatus.PENDING,
    val createdAtEpochMs: Long = System.currentTimeMillis()
)

enum class SocialMediaVisualIdentitySystemStatus {
    PENDING,
    ACCEPTED,
    IN_PROGRESS,
    COMPLETED,
    CANCELLED
}
