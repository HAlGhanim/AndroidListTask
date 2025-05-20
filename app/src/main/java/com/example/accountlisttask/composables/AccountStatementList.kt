package com.example.accountlisttask.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.accountlisttask.data.AccountStatement

@Composable
fun AccountStatementList(statements: List<AccountStatement>, modifier: Modifier = Modifier) {
    LazyColumn(modifier) {
        itemsIndexed(statements) { index, statement ->
            AccountStatementCard(statement)
            HorizontalDivider(thickness = 3.dp, color = Color.Black)
        }
    }
}
