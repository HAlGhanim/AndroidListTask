package com.example.accountlisttask.data

fun getDummyStatements(): List<AccountStatement> {
    return listOf(
        AccountStatement(1, "2025-05-01", "Salary Deposit", 2000.00, TransactionType.Deposit),
        AccountStatement(2, "2025-05-03", "ATM Withdrawal", 100.00, TransactionType.Withdraw),
        AccountStatement(3, "2025-05-10", "Electricity Bill", 75.50, TransactionType.Withdraw),
        AccountStatement(4, "2025-05-15", "Freelance Payment", 450.00, TransactionType.Deposit),
        AccountStatement(5, "2025-05-18", "Grocery Store", 120.00, TransactionType.Withdraw)
    )
}
