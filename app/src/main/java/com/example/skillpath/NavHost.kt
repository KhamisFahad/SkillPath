package com.example.skillpath


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.skillpath.Screens.Home
import com.example.skillpath.Screens.Modules
import com.example.skillpath.Screens.Progress
import com.example.skillpath.Screens.Settings


sealed class BottomNavItems(val title:String, val icon:ImageVector, val screen_route:String, val screen: @Composable () -> Unit){

    object Home : BottomNavItems("Home", Icons.Default.Home,"home", { Home()})
    object Modules: BottomNavItems("Modules",Icons.Filled.List,"modules", { Modules() })
    object Progress: BottomNavItems("Progress",Icons.Filled.Check,"progress", { Progress() })
    object Settings: BottomNavItems("settings",Icons.Filled.Settings,"settings", { Settings() })
}

val items = listOf(
    BottomNavItems.Home,
    BottomNavItems.Modules,
    BottomNavItems.Progress,
    BottomNavItems.Settings,
)



