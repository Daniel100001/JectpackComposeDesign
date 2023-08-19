package com.example.jectpackcomposedesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jectpackcomposedesign.ui.theme.JectpackComposeDesignTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JectpackComposeDesignTheme {
                Surface(
                    modifier = Modifier.wrapContentSize(),
                    color = Color(R.color.forCharacterMaterialCardViewColor)
                ) {
                    CharacterCard()
                }
            }
        }
    }
}

@Preview
@Composable
fun CharacterCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = MaterialTheme.shapes.medium,
        colors = CardDefaults.cardColors(Color.Gray)
    ) {
        Row(
            modifier = Modifier
                .wrapContentSize()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CharacterImage()
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                CharacterNam()
                CharacterStatus()
                CharacterSpecies()
                CharacterType()
                LastKnownLocation()
                FirstSeen()
            }
        }
    }
}

@Composable
fun CharacterImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = null,
        modifier = Modifier
            .size(150.dp)
            .background(MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f)),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun CharacterNam() {
    Text(
        text = "Centaur",
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        color = MaterialTheme.colorScheme.secondary
    )
}

@Composable
fun CharacterStatus() {
    Text(
        text = "Alive -",
        fontSize = 15.sp,
        color = MaterialTheme.colorScheme.onSurface
    )
}

@Composable
fun CharacterSpecies() {
    Text(
        text = "Mythological Creature",
        fontSize = 15.sp,
        color = MaterialTheme.colorScheme.onSurface
    )
}

@Composable
fun CharacterType() {
    Text(
        text = "Last known location:",
        fontSize = 15.sp,
        color = MaterialTheme.colorScheme.secondary
    )
}

@Composable
fun LastKnownLocation() {
    Text(
        text = "Mr. Goldenfold's dream",
        color = MaterialTheme.colorScheme.onSurface
    )
}

@Composable
fun FirstSeen() {
    Text(
        text = "First seen in:",
        color = MaterialTheme.colorScheme.secondary,
        modifier = Modifier.padding(top = 8.dp)
    )
    Text(
        text = "Lawnmower Dog",
        color = MaterialTheme.colorScheme.onSurface
    )
}

