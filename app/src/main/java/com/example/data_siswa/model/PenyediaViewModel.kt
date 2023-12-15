package com.example.data_siswa.model

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.data_siswa.AplikasiSiswa
import com.example.roomsiswa.ui.model.EntryViewModel
import com.example.roomsiswaa.model.DetailsViewModel
import com.example.roomsiswaa.model.EditViewModel


object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }


        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
        initializer {
            DetailsViewModel(this.createSavedStateHandle(),aplikasiSiswa().container.repositoriSiswa )
        }

        initializer {
            EditViewModel(this.createSavedStateHandle(),aplikasiSiswa().container.repositoriSiswa)
        }

    }
    /**
     * Fungsi ekstensi query untuk objek [Application] dan mengembalikan sebuah instance dari [AplikasiSiswa].
     */
    fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
        (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)
}