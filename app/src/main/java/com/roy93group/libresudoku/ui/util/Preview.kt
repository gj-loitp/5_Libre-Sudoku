package com.roy93group.libresudoku.ui.util

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview


@Preview(
    name = "Light",
    showBackground = true
)
@Preview(
    name = "Dark",
    uiMode = UI_MODE_NIGHT_YES,
    showBackground = true
)
annotation class LightDarkPreview