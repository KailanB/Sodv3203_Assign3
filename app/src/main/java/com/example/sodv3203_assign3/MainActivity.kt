package com.example.sodv3203_assign3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sodv3203_assign3.data.DailyTip
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
            text = "Daily Tips",
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.height(16.dp))
        TipList(dailyTipList = Datasource().loadDailyTipData())
    }
}

@Composable
fun TipList(
    dailyTipList: List<DailyTip>
) {
    LazyColumn(){

        items(items = dailyTipList){
            dailyTip -> TipCard(
                dailyTip = dailyTip,
                modifier = Modifier.padding(12.dp)
            )
        }

    }

}

@Composable
fun TipCard(dailyTip: DailyTip, modifier: Modifier = Modifier){

    Card(
        modifier = modifier
    ){
        Image(
            painter = painterResource(dailyTip.imageResTipId),
            contentDescription = stringResource(dailyTip.dailyTipImageDescription),
            modifier = Modifier.fillMaxWidth()
                .height(180.dp),
            contentScale = ContentScale.Crop

        )
        Text(
            text = stringResource(dailyTip.stringResTipId),
            style = MaterialTheme.typography.labelLarge,
            modifier = Modifier.padding(12.dp)
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