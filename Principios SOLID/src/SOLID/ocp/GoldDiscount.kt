package SOLID.ocp

class GoldDiscount: Discount {
    override fun apply(price:Double):Double{
        return price * 0.6
    }
}