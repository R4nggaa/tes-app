package com.trian.cexup


import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.ExperimentalComposeUiApi
import com.google.accompanist.insets.ExperimentalAnimatedInsets
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.pager.ExperimentalPagerApi
import com.trian.component.ui.theme.TesMultiModuleTheme
import dagger.hilt.android.AndroidEntryPoint


/**
 * Main Activity
 * Author Trian Damai Project
 * Created by Trian Damai
 * 28/08/2021
 **/


@ExperimentalMaterialNavigationApi
@ExperimentalAnimationApi
@ExperimentalPagerApi
@ExperimentalFoundationApi
@ExperimentalComposeUiApi
@ExperimentalAnimatedInsets
@RequiresApi(Build.VERSION_CODES.O)
@ExperimentalMaterialApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LaunchedEffect(Unit) {


            }

            SideEffect {

            }

            TesMultiModuleTheme {
            }
        }
    }
}

