package com.example.gdgjetpackcomposeconsumingapi_msql.gdgComponents

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gdgjetpackcomposeconsumingapi_msql.gdgModele.RequestModel

@ExperimentalAnimationApi
@Preview
@Composable
fun GdgRow(
    requestModel: RequestModel = getrequestModels()[0],
             onItemClick: (String) -> Unit = {}) {

    Card(modifier = Modifier
        .padding(4.dp)
        .fillMaxWidth()
        //.height(130.dp)
        .clickable {
            onItemClick(requestModel.id)
        },
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = 6.dp) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Column(modifier = Modifier.padding(10.dp)) {
                Text(text = "Full name: ${requestModel.name}",
                    style = MaterialTheme.typography.caption)
                Text(text = "Specialization: ${requestModel.description}",
                    style = MaterialTheme.typography.caption)
                MyImage(modifier = Modifier.size(50.dp).clip(CircleShape)                       // clip to the circle shape
                    .border(2.dp, Color.White, CircleShape)
                    .clickable {
                      //  navController.navigate(Gdgscreens.Detailsmember.name + "/${requestModel.id}" + "/${requestModel.name}" + "/${requestModel.description}")
                    } )
            }
        }
    }
}

fun getrequestModels():List<RequestModel> {

    return listOf(RequestModel(id="0",name="gost",description="zila"))
}
