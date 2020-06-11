package SOLID.ocp

class DiscountManager {

    fun apply(price: Double, discount: Discount): Double{
        return discount.apply(price)
    }
}