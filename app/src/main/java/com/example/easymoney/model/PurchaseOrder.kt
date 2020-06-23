package com.example.easymoney.model

data class PurchaseOrder (
    val orderId:Int = 1,
    val coin: Coin = Coin(),
    val valueDesired:Int = 0,
    val valueBuy:Double = 10.0,
    val valueAmount:Double= 5.0
)

