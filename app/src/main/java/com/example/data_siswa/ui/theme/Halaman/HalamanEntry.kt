package com.example.data_siswa.ui.theme.Halaman

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.data_siswa.Navigasi.DestinasiNavigasi
import com.example.data_siswa.R
import com.example.data_siswa.model.EntryViewMode
import com.example.data_siswa.model.PenyediaViewModel

object DestinasiEntry : DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = R.string.entry_siswa
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EntrySiswaScreen(
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: EntryViewMode = viewModel(factory = PenyediaViewModel.Factory)
) {}