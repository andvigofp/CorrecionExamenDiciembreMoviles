package com.example.correcionexamendiciembre.ui.state

data class ShoppingListUiState(
    val newProduct: String = "",
    val newPrice: String = "",
    val totalQuantity: Int = 0,
    val totalPrice: Float = 0f,
)
