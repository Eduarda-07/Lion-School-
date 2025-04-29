package br.senai.sp.jandira.lionschool.screens

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.model.CardCourses

@Composable
fun StudentScreen(modifier: Modifier = Modifier){

    var search= remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 60.dp, start = 15.dp, end = 15.dp),

            ) {
            Column (
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Row (
                    modifier = Modifier
                        .height(60.dp),
                ){
                    Image(
                        painter = painterResource(
                            R.drawable.logo
                        ),
                        contentDescription = stringResource(
                            R.string.logo
                        ),
                        modifier = Modifier
                            .size(60.dp)
                    )
                    Column (

                    ){
                        Text(
                            text = stringResource(
                                R.string.name
                            ),
                            color = Color(0XFF3347B0),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .fillMaxSize()
                        )
                    }
                }
            }

            Card(
                modifier = Modifier
                    .height(11.2.dp)
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFC107)
                )
            ) {}
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .padding(top = 20.dp ),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Go
                ),
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = Color(0xFFA6A6A6)
                    )
                },
                shape = RoundedCornerShape(10.dp),
//                border = { BorderStroke (width = 2.dp, color = Color.Yellow)}
                label = {
                    Text(
                        text = stringResource(R.string.find_curse),
                        color = Color(0XFF9E9FA4)
                    )
                }
            )
            Row (
                modifier = Modifier
                    .height(70.dp)
                    .padding(top = 13.dp, bottom = 13.dp)
//                    .background(
//                        color = Color.Yellow
//                    )
                ,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(
                        R.drawable.list
                    ),
                    contentDescription = stringResource(
                        R.string.logo
                    ),
                    modifier = Modifier
                        .size(60.dp)
                )
                Column (

                    verticalArrangement = Arrangement.Center

                ){
                    Text(
                        text = stringResource(
                            R.string.courses
                        ),
                        color = Color(0XFF3347B0),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 13.dp)

                    )
                }


            }
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                CardCourses(
                    img= painterResource(R.drawable.programador),
                    texto1 = stringResource(R.string.ds),
                    texto2 = stringResource(R.string.d_s),
                    texto3 = stringResource(R.string.learn_ds)
                )
                CardCourses(
                    img= painterResource(R.drawable.internet),
                    texto1 = stringResource(R.string.rds),
                    texto2 = stringResource(R.string.r_d_s),
                    texto3 = stringResource(R.string.learn_rds)
                )
                CardCourses(
                    img= painterResource(R.drawable.chip),
                    texto1 = stringResource(R.string.ele),
                    texto2 = stringResource(R.string.e_l_e),
                    texto3 = stringResource(R.string.learn_ele)
                )
            }



        }
    }
}
@Preview(showSystemUi = true)
@Composable
private fun CoursesScreenPreview(){
    StudentScreen()
}