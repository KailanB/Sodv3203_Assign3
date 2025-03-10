package com.example.sodv3203_assign3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sodv3203_assign3.data.DailyRiddle
import com.example.sodv3203_assign3.model.Datasource
import com.example.sodv3203_assign3.ui.theme.Sodv3203_Assign3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Sodv3203_Assign3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier.padding(innerPadding)
                    ){
                        Spacer(modifier = Modifier.height(24.dp))


                        DailyTipsApp(
                            modifier = Modifier.padding(innerPadding)
                        )
                    }

                }
            }
        }
    }
}

@Composable
fun DailyTipsApp(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ){
        Text(
            text = "Daily Riddles",
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.height(16.dp))
        TipList(dailyRiddleList = Datasource().loadDailyRiddleData())
    }
}

@Composable
fun TipList(
    dailyRiddleList: List<DailyRiddle>
) {
    LazyColumn(){

        items(items = dailyRiddleList){
            dailyRiddle -> RiddleCard(
                dailyRiddle = dailyRiddle,
                modifier = Modifier.padding(12.dp)
            )
        }

    }

}

@Composable
fun RiddleCard(dailyRiddle: DailyRiddle, modifier: Modifier = Modifier){

    var expanded by remember { mutableStateOf(false) }

    val varColor by animateColorAsState(
        targetValue = if(expanded)MaterialTheme.colorScheme.primaryContainer
        else MaterialTheme.colorScheme.inversePrimary
    )

    Card(
        modifier = modifier
    ){
        Column(
            modifier = Modifier.animateContentSize(
                animationSpec = spring(
                    stiffness = Spring.StiffnessHigh,
                    dampingRatio = Spring.DampingRatioHighBouncy
                )
            )
                // use color variable
                .background(color = varColor)
        ){
            Image(
                painter = painterResource(dailyRiddle.imageResourceId),
                contentDescription = stringResource(dailyRiddle.imageDescription),
                modifier = Modifier.fillMaxWidth()
                    .height(180.dp),
                contentScale = ContentScale.Crop

            )
            Text(
                text = stringResource(dailyRiddle.stringResourceRiddle),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(12.dp)
            )
            Row(){
                DailyRiddleAnswerDropdownButton(
                    expanded = expanded,
                    onClick = {expanded = !expanded}
                )
                Text(
                    text = "Answer",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(12.dp)
                )
            }


            if(expanded)RiddleAnswer(
                answer = stringResource(dailyRiddle.stringResourceRiddleAnswer),
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium))
            )


        }


    }
}

@Composable
fun DailyRiddleAnswerDropdownButton(
    expanded: Boolean,
    onClick: ()->Unit
){
    IconButton(
        onClick = onClick
    ){
        Icon(
            imageVector = if(expanded) Icons.Filled.KeyboardArrowUp
            else Icons.Filled.KeyboardArrowDown,
            contentDescription = null,
            modifier = Modifier.size(48.dp),
            // tint = MaterialTheme.colorScheme.onBackground
        )
    }

}

@Composable
fun RiddleAnswer(
    answer: String,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier)
    {
        Text(
            text = answer,
            // style = MaterialTheme.typography.displayMedium
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Sodv3203_Assign3Theme {
        DailyTipsApp()
    }
}