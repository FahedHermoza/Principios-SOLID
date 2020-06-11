package SOLID.isp

interface Payment {
    fun calculatePayment()
}

interface CreditCardPayment: Payment {
    fun creditCardPayment()
}

interface BankPayment: Payment {
    fun creditCardPayment()
}

interface CashPayment: Payment {
    fun cashPayment()
}