package com.ygcodding.composeuiapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ScaffoldExample() {
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primaryContainer)
                    .padding(start = 20.dp)
                    .height(55.dp)

            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Welcone again")
                }
            }
        },
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primaryContainer)
                    .padding(start = 20.dp)
                    .height(55.dp)

            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text("Click here")
                    }
                }
            }
        }

    ) { innerPadding ->
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(innerPadding)
        ) {
            Text(
                modifier = Modifier.padding(20.dp),
                text = """
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam eget urna non odio suscipit feugiat. Sed sed velit non arcu gravida convallis sit amet sit amet mauris. Integer vel vehicula orci. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vivamus nec risus ac orci dignissim lobortis nec in leo. Nunc a lorem viverra, posuere magna et, posuere est. Nam scelerisque felis et lacus vulputate tincidunt.

                Phasellus tincidunt ex ut orci convallis, a accumsan purus luctus. Suspendisse ac tellus at urna gravida finibus. Ut auctor elit justo, nec tempor velit ultricies et. Donec facilisis turpis vel felis consectetur, ac placerat lorem hendrerit. Curabitur mollis, lorem in aliquam malesuada, felis justo rhoncus enim, ut consectetur turpis quam nec risus. Aenean vulputate dolor ac augue mollis, et fringilla lectus pharetra. Ut vel dolor accumsan, malesuada est eget, tincidunt velit.

                Donec efficitur ipsum ut mi auctor, in tempor velit aliquam. Etiam imperdiet felis vel libero sollicitudin, ut lacinia lacus consequat. Cras sed purus sed mauris malesuada vehicula. Maecenas non diam et urna bibendum interdum. Proin at orci eget justo luctus feugiat nec sed magna. Ut feugiat interdum eros, in condimentum odio vehicula nec. Nam a viverra justo. Nulla facilisi.

            """.trimIndent()
            )
        }
    }
}

//@Preview(showBackground = true)
//@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun ScaffoldExamplePreview(modifier: Modifier = Modifier) {
    ScaffoldExample()
}