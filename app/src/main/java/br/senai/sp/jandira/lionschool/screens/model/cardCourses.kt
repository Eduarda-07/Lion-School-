package br.senai.sp.jandira.lionschool.screens.model

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.CoursesScreen

@Composable
fun CardCourses(

    img: Painter,
    texto1: String = "",
    texto2: String = "",
    texto3: String = "",
    isFilled:Boolean = true
) {
    Card (
        modifier = Modifier
            .height(190.dp)
            .width(400.dp)
            .padding(bottom = 10.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        )
    ){
        Column (
            modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFF3347B0),
                            Color(0xFFCFD4EA)

                        )
                    )
                )
                .fillMaxSize()


        ){
            Row (
                modifier = Modifier
                    .height(100.dp)
                    .padding(start = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = img,
                    contentDescription = "",
                    modifier = Modifier
                        .size(120.dp)
                        .padding(end = 20.dp)
                )
                Text(
                    text = texto1,
                    color = Color(0XFFFFC23D),
                    fontSize = 60.sp,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier
                        .padding(start = 20.dp)
                )
            }
            Text(
                text = texto2,
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(start = 20.dp, )
            )
            Text(
                text = texto3,
                color = Color.White,
                fontSize = 16.sp,

                modifier = Modifier
                    .padding(start = 20.dp)
            )
            Row (
                modifier = Modifier
                    .padding(start = 20.dp, top = 5.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(
                        R.drawable.tempo
                    ),
                    contentDescription = stringResource(
                        R.string.logo
                    ),
                    modifier = Modifier
                        .size(25.dp)
                )
                Text(
                    text = stringResource(
                        R.string.semesters
                    ),
                    color = Color.White,
                    fontSize = 18.sp,

                    modifier = Modifier
                        .padding(start = 20.dp)
                )

            }


        }

    }
    }


@Preview()
@Composable
private fun CardCoursesPreview(){
    CardCourses(img = painterResource(id = R.drawable.programador))
}

