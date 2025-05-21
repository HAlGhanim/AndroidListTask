package com.example.accountlisttask.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.accountlisttask.R
import com.example.accountlisttask.data.AccountStatement
import com.example.accountlisttask.data.TransactionType
import com.example.accountlisttask.ui.theme.AccountListTaskTheme

@Composable
fun AccountStatementDetails(account: AccountStatement, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.fillMaxSize()
    ) {
        Text(text = account.description)
        Text(text = "${account.amount} ${account.type}")
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = stringResource(R.string.withdraw))
            }
            Spacer(modifier = Modifier.width(4.dp))
            Button(onClick = { /*TODO*/ }) {
                Text(text = stringResource(R.string.deposit))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AccountDetailsPreview() {
    AccountListTaskTheme {
        AccountStatementDetails(AccountStatement(1,"date", "stealing", amount = 12.4, TransactionType.Deposit))
    }
}