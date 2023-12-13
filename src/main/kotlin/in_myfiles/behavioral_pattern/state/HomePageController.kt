package in_myfiles.behavioral_pattern.state
class HomePageController {
    fun loadData() {
        observeUiState(UiState.Loading)
        observeUiState(UiState.Success("successfully"))
        observeUiState(UiState.Error("error"))
    }

    private fun observeUiState(state: UiState) {
        when (state) {
            UiState.Loading -> println("Task is loading...")
            is UiState.Success -> println("Success task: ${state.successMessage}")
            is UiState.Error -> println("Error task: ${state.errorMessage}")
        }
    }
}