package com.example.accountlisttask.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.accountlisttask.data.getDummyStatements

@Composable
fun AccountStatementNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "accountStatementList"
) {
    val statements = getDummyStatements()

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable("accountStatementList") {
            AccountStatementList(
                statements = statements,
                onItemClick = { statementId ->
                    navController.navigate("accountStatementDetails/$statementId")
                }
            )
        }
        composable("accountStatementDetails/{statementId}") { backStackEntry ->
            val id = backStackEntry.arguments?.getString("statementId")?.toIntOrNull()
            val account = statements.find { it.id == id }
            if (account != null) {
                AccountStatementDetails(account = account)
            }
        }
    }
}
