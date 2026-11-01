package sa.factory.app1287937.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sa.factory.app1287937.data.SocialMediaVisualIdentitySystemRepository
import sa.factory.app1287937.model.SocialMediaVisualIdentitySystem
import sa.factory.app1287937.model.BrandTemplatePackage
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class SocialMediaVisualIdentitySystemViewModel(
    private val repository: SocialMediaVisualIdentitySystemRepository
) : ViewModel() {
    val catalog: StateFlow<List<BrandTemplatePackage>> = repository.getAvailableCatalog()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val activeRequest: StateFlow<SocialMediaVisualIdentitySystem?> = repository.getActiveRequest()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)

    fun submitNewOrder(request: SocialMediaVisualIdentitySystem) {
        viewModelScope.launch {
            repository.submitRequest(request)
        }
    }
}
