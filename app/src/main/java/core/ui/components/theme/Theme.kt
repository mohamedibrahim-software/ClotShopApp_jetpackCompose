package e_commerce_app.core.composeble.theme

import AppTypography
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary          = Primary,
    onPrimary        = White100,
    background       = White100,
    onBackground     = Black100,
    surface          = BgLight2,
    onSurface        = Black100,
    onSurfaceVariant = Black50,
    error            = Error,
)

private val DarkColors = darkColorScheme(
    primary          = Primary,
    onPrimary        = White100,
    background       = BgDark1,
    onBackground     = White100,
    surface          = BgDark2,
    onSurface        = White100,
    onSurfaceVariant = White50,
    error            = Error,
)

@Composable
fun ClotShopTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography  = AppTypography,

        content     = content
    )
}
