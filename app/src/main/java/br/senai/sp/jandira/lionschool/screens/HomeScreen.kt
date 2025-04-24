package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 90.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ){
            Column (
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Row (
                    modifier = Modifier
                        .padding(start = 9.dp, end = 15.dp)
                ){
                    Image(
                        painter = painterResource(
                            R.drawable.logo
                        ),
                        contentDescription = stringResource(
                            R.string.logo
                        ),
                        modifier = Modifier

                            .size(190.dp)
                    )
                    Column (
                        modifier = Modifier
                            .padding(top = 18.dp)
                            .height(120.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(
                            text = stringResource(
                                R.string.name
                            ),
                            color = Color(0XFF3347B0),
                            fontSize = 49.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .fillMaxSize()

                        )
                    }
                }
            }
            Column (
                modifier = Modifier
                    .fillMaxSize()
//                    .background(
//                        color = Color.Blue
//                    ),
                    .padding(start = 20.dp, end = 20.dp, top = 50.dp)
                        ,
//                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(
                        R.string.find_curse
                    ),
                    color = Color(0XFF3347B0),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                )
                Card (
                    modifier = Modifier
                        .padding(bottom = 35.dp)
                        .height(10.dp)
                        .width(89.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFC107)
                    )

                ){  }
                Text(
                    text = stringResource(
                        R.string.slogan
                    ),
                    color = Color(0XFF9E9FA4),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W400,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(bottom = 110.dp)
                )
                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(300.dp)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFFC107)
                    ),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(width = 2.dp, color = Color(0XFF3347B0))
                ) {
                    Text(
                        text = stringResource(
                            R.string.get_started
                        ),
                        color = Color(0XFF3347B0),
                        fontSize = 22.sp
                        )
                }
                Row (
                    modifier = Modifier
                        .padding(top = 80.dp)
                        .width(260.dp)
//                        .background(
//                        color = Color.Blue
//                    ),
                            ,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(
                            R.drawable.youtube
                        ),
                        contentDescription = stringResource(
                            R.string.logo
                        ),
                        modifier = Modifier
                            .size(42.dp)
                    )
                    Image(
                        painter = painterResource(
                            R.drawable.twitter
                        ),
                        contentDescription = stringResource(
                            R.string.logo
                        ),
                        modifier = Modifier
                            .size(42.dp)
                    )
                    Image(
                        painter = painterResource(
                            R.drawable.instagram
                        ),
                        contentDescription = stringResource(
                            R.string.logo
                        ),
                        modifier = Modifier
                            .size(42.dp)
                    )
                    Image(
                        painter = painterResource(
                            R.drawable.facebook
                        ),
                        contentDescription = stringResource(
                            R.string.logo
                        ),
                        modifier = Modifier
                            .size(42.dp)
                    )
                }

            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview(){
    HomeScreen()
}
