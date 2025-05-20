package com.example.accountlisttask.data

data class AccountStatement(
    val id: Int,
    val date: String,
    val description: String,
    val amount: Double,
    val type: TransactionType
)

enum class TransactionType {
    Deposit, Withdraw
}
