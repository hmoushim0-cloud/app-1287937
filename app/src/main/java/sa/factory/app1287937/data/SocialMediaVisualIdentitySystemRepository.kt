package sa.factory.app1287937.data

import sa.factory.app1287937.model.SocialMediaVisualIdentitySystem
import sa.factory.app1287937.model.BrandTemplatePackage
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

interface SocialMediaVisualIdentitySystemRepository {
    fun getAvailableCatalog(): Flow<List<BrandTemplatePackage>>
    fun getActiveRequest(): Flow<SocialMediaVisualIdentitySystem?>
    suspend fun submitRequest(request: SocialMediaVisualIdentitySystem): Result<String>
}

class InMemorySocialMediaVisualIdentitySystemRepository : SocialMediaVisualIdentitySystemRepository {
    private val _catalog = MutableStateFlow<List<BrandTemplatePackage>>(listOf(
        BrandTemplatePackage("1", "باكدج نظام الألوان للمنشورات", "تحديد Palette متكامل يضبط درجات الأساسية والثانوية والسطح والAccent مع قواعد استخدام واضحة للأوزان والتباين داخل تصميمات السوشيال.", 5000L, "verified"),
        BrandTemplatePackage("2", "باكدج القوالب وهوية الملاحق البصرية", "بناء Social Media Visual Identity System يشمل تخطيطات منشورات (مربع وستوري) وقواعد محاذاة وأحجام عناصر وملفات جاهزة للتطبيق على منصات متعددة.", 9500L, "bolt")
    ))
    private val _active = MutableStateFlow<SocialMediaVisualIdentitySystem?>(null)

    override fun getAvailableCatalog(): Flow<List<BrandTemplatePackage>> = _catalog.asStateFlow()
    override fun getActiveRequest(): Flow<SocialMediaVisualIdentitySystem?> = _active.asStateFlow()

    override suspend fun submitRequest(request: SocialMediaVisualIdentitySystem): Result<String> {
        _active.value = request
        return Result.success(request.requestId)
    }
}
