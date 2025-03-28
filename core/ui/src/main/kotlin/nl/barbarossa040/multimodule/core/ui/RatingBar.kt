package nl.barbarossa040.multimodule.core.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import nl.barbarossa040.multimodule.core.design.theme.CustomGreen

@Composable
fun RatingBar(
    modifier: Modifier = Modifier,
    rating: String,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = "",
            tint = CustomGreen,
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = rating,
            color = CustomGreen,
            fontWeight = FontWeight.Bold,
        )
    }
}