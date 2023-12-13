package in_myfiles.behavioral_pattern.state

sealed class UiState {
    object Loading: UiState()
    data class Success(val successMessage: String): UiState()
    data class Error(val errorMessage: String): UiState()
}