
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lol_jbm.data.Champion
import com.example.lol_jbm.data.ChampionsStorage
import com.example.lol_jbm.data.SelectedChampion
import com.example.lol_jbm.ui.theme.components.ChampionItemDesign

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListScreen(
    modifier: Modifier = Modifier,
    onNavigateToDetail: () -> Unit
){

    val champions: List<Champion> = ChampionsStorage.getChampion()
    Scaffold(

    ){

            paddingValues ->
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
            contentPadding = PaddingValues(8.dp)) {
            items(
                items = champions,
                key = {
                    it.id
                }
            ){
                    champion ->
                ChampionItemDesign(
                    champion = champion,
                    function = {
                        SelectedChampion.champion = champion
                        onNavigateToDetail()
                    }

                )
            }
        }
    }
}
