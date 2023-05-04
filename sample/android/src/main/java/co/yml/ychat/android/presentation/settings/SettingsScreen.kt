package co.yml.ychat.android.presentation.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.yml.ychat.android.ui.components.itemmenu.ItemMenu
import co.yml.ychat.android.ui.theme.YChatTheme
import org.koin.androidx.compose.getViewModel

@Composable
internal fun SettingsScreen(viewModel: SettingsScreenViewModel = getViewModel()) {

    val providers = viewModel.providers.value

    Column(
        modifier = Modifier
            .background(YChatTheme.colors.background)
            .fillMaxHeight()
            .padding(4.dp),
        verticalArrangement = Arrangement.Top,
    ) {
        ItemMenu(startText = )
    }
}

@Preview
@Composable
private fun SettingsScreenPreview() {
    YChatTheme {
        SettingsScreen()
    }
}
