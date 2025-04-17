package br.senai.sp.jandira.lionschool.screens

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
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
                    ){
                        Text(
                            text = stringResource(
                                R.string.app_name
                            ),
                            color = Color(0XFF3347B0),
                            fontSize = 55.sp,
                            fontWeight = FontWeight.Bold,

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
                        ,
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(
                        R.string.find_curse
                    ),
                    color = Color(0XFF3347B0),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                Card (
                    modifier = Modifier
                        .background(
                            color = Color.Yellow
                        )
                        .height(16.dp)
                        .width(18.dp)

                ){  }
                Text(
                    text = stringResource(
                        R.string.slogan
                    ),
                    color = Color(0XFF9E9FA4),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview(){
    HomeScreen()
}
