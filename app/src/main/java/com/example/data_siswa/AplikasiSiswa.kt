package com.example.data_siswa

import android.app.Application
import com.example.data_siswa.repository.ContainerApp
import com.example.data_siswa.repository.ContainerDataApp


class AplikasiSiswa : Application(){
    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan depedensi
     */
    lateinit var container : ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}