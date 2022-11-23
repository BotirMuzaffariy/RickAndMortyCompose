package uz.lazydevv.rickandmorty.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LinearLayoutSample1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            )
            {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    Spacer(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(Color.Blue)
                    )
                    Spacer(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(Color.Black)
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    Spacer(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(Color.Yellow)
                    )
                    Spacer(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(Color.Red)
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            )
            {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    Spacer(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(Color.White)
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
                                .background(Color.Red)
                        )
                        Spacer(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)
                                .background(Color.Yellow)
                        )
                    }
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.332f)
                        .background(Color.Green)
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            )
            {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    Spacer(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(Color.Black)
                    )
                    Spacer(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(Color.White)
                    )
                    Spacer(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(Color.Black)
                    )
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .background(Color.DarkGray)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            )
            {
                Spacer(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .background(Color.White)
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
                            .background(Color.Red)
                    )
                    Spacer(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .background(Color.Yellow)
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Preview1() {
    LinearLayoutSample1()
}