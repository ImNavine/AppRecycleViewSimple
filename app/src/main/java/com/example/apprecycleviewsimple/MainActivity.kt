package com.example.apprecycleviewsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apprecycleviewsimple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvlista.layoutManager=LinearLayoutManager(applicationContext)
        binding.rvlista.adapter=AdapterLista(listado())
    }

    private fun listado():List<String>{

        val lista = ArrayList<String>()
        var i=0
        while (i < 10){
            lista.add("Valor $i")
            i++
        }
        return lista
    }
}