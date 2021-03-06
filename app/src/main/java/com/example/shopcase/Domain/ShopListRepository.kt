package com.example.shopcase.Domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemID:Int):ShopItem

    fun getShopList():List<ShopItem>
}