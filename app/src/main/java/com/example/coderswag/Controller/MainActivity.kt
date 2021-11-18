package com.example.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.coderswag.Adapters.CategoryAdapter
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter
    lateinit var categoryListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        categoryListView = findViewById(R.id.categoryListView)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
    }
}