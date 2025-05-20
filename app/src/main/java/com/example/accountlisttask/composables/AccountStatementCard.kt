package com.example.accountlisttask.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.accountlisttask.data.AccountStatement
import com.example.accountlisttask.data.TransactionType

@Composable
fun AccountStatementCard(statement: AccountStatement) {
    val amountColor = if (statement.type == TransactionType.Deposit) Color(0xFF388E3C) else Color(0xFFD32F2F)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFC2C2C2)),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(statement.date, style = MaterialTheme.typography.bodySmall)
                Text(statement.description, style = MaterialTheme.typography.bodyMedium)
            }
            Text(
                text = "${if (statement.type == TransactionType.Deposit) "+" else "-"}$${statement.amount}",
                color = amountColor,
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}
