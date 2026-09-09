

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// =============================================
// Font Family — Gabarito (من الـ Figma)
// حمّل الـ font من Google Fonts وضعه في res/font/
// =============================================
val GabaritoFontFamily = FontFamily.Default

// =============================================
// Text Styles — مستخرجة مباشرة من الـ Figma
// =============================================
object AppTextStyle {

    // ── H1 · 32sp ───────────────────────────────
    val H1Regular = TextStyle(
        fontFamily = GabaritoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize   = 32.sp,
    )
    val H1Medium = TextStyle(
        fontFamily = GabaritoFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize   = 32.sp,
    )
    val H1Bold = TextStyle(
        fontFamily = GabaritoFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize   = 32.sp,
    )

    // ── H2 · 24sp ───────────────────────────────
    val H2Regular = TextStyle(
        fontFamily = GabaritoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize   = 24.sp,
    )
    val H2Medium = TextStyle(
        fontFamily = GabaritoFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize   = 24.sp,
    )
    val H2Bold = TextStyle(
        fontFamily = GabaritoFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize   = 24.sp,
    )

    // ── H3 · 16sp ───────────────────────────────
    val H3Regular = TextStyle(
        fontFamily = GabaritoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize   = 16.sp,
    )
    val H3Medium = TextStyle(
        fontFamily = GabaritoFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize   = 16.sp,
    )
    val H3Bold = TextStyle(
        fontFamily = GabaritoFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize   = 16.sp,
    )

    // ── H4 · 12sp ───────────────────────────────
    // H4/Regular عنده lineHeight = 160% ≈ 19.2sp
    val H4Regular = TextStyle(
        fontFamily = GabaritoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize   = 12.sp,
        lineHeight = 19.2.sp,   // 160% of 12sp
    )
    val H4Medium = TextStyle(
        fontFamily = GabaritoFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize   = 12.sp,
    )
    val H4Bold = TextStyle(
        fontFamily = GabaritoFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize   = 12.sp,
    )
}

// =============================================
// Material3 Typography — ربطها بـ MaterialTheme
// =============================================
val AppTypography = Typography(
    displayLarge   = AppTextStyle.H1Bold,
    displayMedium  = AppTextStyle.H1Medium,
    displaySmall   = AppTextStyle.H1Regular,

    headlineLarge  = AppTextStyle.H2Bold,
    headlineMedium = AppTextStyle.H2Medium,
    headlineSmall  = AppTextStyle.H2Regular,

    titleLarge     = AppTextStyle.H3Bold,
    titleMedium    = AppTextStyle.H3Medium,
    titleSmall     = AppTextStyle.H3Regular,

    bodyLarge      = AppTextStyle.H4Bold,
    bodyMedium     = AppTextStyle.H4Medium,
    bodySmall      = AppTextStyle.H4Regular,
)
