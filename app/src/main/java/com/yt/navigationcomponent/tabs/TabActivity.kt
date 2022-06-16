package com.yt.navigationcomponent.tabs

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.bottomSheet.BottomSheetNavigator
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import cafe.adriel.voyager.navigator.tab.TabNavigatorContent
import com.yt.navigationcomponent.BaseActivity
import com.yt.navigationcomponent.tabs.screens.HomeScreen

class TabActivity : BaseActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    override fun Content() {
        TabNavigator(tab = HomeScreen ){
            Scaffold(
                content = { CurrentTab()},
                topBar = { Text(text = it.current.options.title)},
                bottomBar = {
                }
            )
        }
    }
}