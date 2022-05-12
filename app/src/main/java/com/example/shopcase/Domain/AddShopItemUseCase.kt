package com.example.shopcase.Domain

class AddShopItemUseCase (private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem){
       ShopListRepository.addShopItem(shopItem)
    }
}