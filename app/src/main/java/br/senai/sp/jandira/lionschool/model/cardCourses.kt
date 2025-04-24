package br.senai.sp.jandira.lionschool.model

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.CoursesScreen

@Composable
fun CardCourses(modifier: Modifier = Modifier){
    Card (
        modifier = Modifier
            .padding(bottom = 35.dp)
            .height(200.dp)
            .width(400.dp),
//        colors = CardDefaults.cardColors(
//            containerColor = Color(0xFFFFC107)
//        )

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
            Image(
                painter = painterResource(
                    R.drawable.programador
                ),
                contentDescription = stringResource(
                    R.string.logo
                ),
                modifier = Modifier
                    .size(120.dp)
            )

        }

    }
}


@Preview(showSystemUi = true)
@Composable
private fun CardCoursesPreview(){
    CardCourses()
}