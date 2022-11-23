package uz.lazydevv.rickandmorty.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LinearLayoutSample2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Spacer(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.Yellow)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            Spacer(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(top = 32.dp, bottom = 16.dp)
                    .background(Color.Blue)
            )
            Spacer(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(top = 16.dp, bottom = 32.dp)
                    .background(Color.Blue)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .padding(bottom = 40.dp)
        ) {
            Spacer(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(end = 6.dp)
                    .background(Color.Green)
            )
            Spacer(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(start = 6.dp)
                    .background(Color.LightGray)
            )
        }
    }
}

@Composable
fun LinearLayoutSample2Another() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Spacer(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.Yellow)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .padding(start = 12.dp)
        ) {
            Spacer(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.4f)
                    .padding(bottom = 18.dp)
                    .background(Color.Blue)
            )
            Spacer(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.4f)
                    .padding(bottom = 18.dp)
                    .background(Color.Blue)
            )
            Spacer(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.4f)
                    .padding(bottom = 18.dp)
                    .background(Color.Blue)
            )
            Spacer(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(bottom = 18.dp)
                    .background(Color.LightGray)
            )
            Spacer(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(bottom = 32.dp)
                    .background(Color.Green)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Preview2() {
    LinearLayoutSample2()
//    LinearLayoutSample2Another()
}