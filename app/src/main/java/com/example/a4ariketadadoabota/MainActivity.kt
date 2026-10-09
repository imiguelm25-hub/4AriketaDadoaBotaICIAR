package com.example.a4ariketadadoabota

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import com.example.a4ariketadadoabota.ui.theme._4AriketaDadoaBotaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _4AriketaDadoaBotaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DadoaBota(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun DadoaBota (modifier: Modifier = Modifier){
    Box(modifier.fillMaxSize()){
        DadoaBotaFondoa ()
        DadoaBotaTestua()
    }

}


@Composable
fun DadoaBotaFondoa(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.fondoa4)

    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier.fillMaxSize()
    )
}

@Composable
fun DadoaBotaTestua(modifier: Modifier = Modifier){

}

@Preview (showBackground = true)
@Composable
fun DadoaBotaPreview (){
    _4AriketaDadoaBotaTheme {
        DadoaBota()
    }
}


