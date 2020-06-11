package SOLID.ocp

class BlackFridayDiscount:Discount {
    override fun apply(price:Double):Double{
        return price * 0.5
    }
}