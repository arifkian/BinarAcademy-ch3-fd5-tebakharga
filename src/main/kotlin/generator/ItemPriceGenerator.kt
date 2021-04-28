package generator

import model.ItemPrice

object ItemPriceGenerator {
    fun getItem(): ArrayList<ItemPrice> {
        val items: ArrayList<ItemPrice> = arrayListOf<ItemPrice>()
        items.add(ItemPrice("Xiaomi Mi 11",9999000))
        items.add(ItemPrice("TV Xiaomi Mi 4A",2100000))
        items.add(ItemPrice("Samasung S21",18000000))
        items.add(ItemPrice("Samsung A52",5500000))
        items.add(ItemPrice("Power Bank Robot 10000 mAh",300000))
        return items
    }
}
