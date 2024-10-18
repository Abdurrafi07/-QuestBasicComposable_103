package com.example.muzaka2project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.muzaka2project.ui.theme.Muzaka2ProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Muzaka2ProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicLayout(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BasicLayout(modifier: Modifier = Modifier){
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = "Login", style = TextStyle(fontSize = 45.sp, fontWeight = FontWeight.Bold))
        Text(text = "Ini adalah halaman login", style = TextStyle(fontSize = 25.sp, fontStyle = FontStyle.Italic))
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = null, modifier = Modifier.padding(top = 10.dp).size(290.dp))
        Text(text = "Nama", style = TextStyle(fontSize = 15.sp))
        Text(text = "Abdurrafi Nur Fakhruddin", style = TextStyle(fontSize = 15.sp, color = Color.Red))
        Text(text = "20220140103", style = TextStyle(fontSize = 25.sp))
        Image(painter = painterResource(id = R.drawable.foto), contentDescription = null, modifier = Modifier.size(290.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Muzaka2ProjectTheme {
        BasicLayout()
    }
}