package com.example.recyclerviewonclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val hobbies = ArrayList<Model>()
        hobbies.add(Model("swimming"))
        hobbies.add(Model("playing"))
        hobbies.add(Model("riding"))
        hobbies.add(Model("grooming"))
        hobbies.add(Model("skipping"))
        hobbies.add(Model("fighting"))
        hobbies.add(Model("dying"))
        hobbies.add(Model("bathing"))
        hobbies.add(Model("dieting"))
        hobbies.add(Model("buying"))
        hobbies.add(Model("walking"))
        hobbies.add(Model("running"))
        hobbies.add(Model("sprinting"))
        hobbies.add(Model("dribbling"))
        hobbies.add(Model("dunking"))

        recyclerView.adapter = HobbiesAdapter(this,hobbies)

    }
}
