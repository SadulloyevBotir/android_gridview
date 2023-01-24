package com.example.android_gridview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import androidx.core.widget.NestedScrollView
import com.example.android_gridview.R
import com.example.android_gridview.adapter.GridViewAdapter
import com.example.android_gridview.model.Post

class MainActivity : AppCompatActivity() {
    lateinit var gridView: GridView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        gridView = findViewById(R.id.gridView)
        refreshAdapter(loadPosts())
    }

    private fun refreshAdapter(items: ArrayList<Post>) {
        var adapter = GridViewAdapter(this, items)
        gridView.adapter = adapter
    }

    private fun loadPosts(): ArrayList<Post> {
        var items = ArrayList<Post>()
        items.add(
            Post(
                1,
                "https://images.unsplash.com/photo-1649353935169-fe9911bf240f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1332&q=80",
                "#FF9E05"
            )
        )
        items.add(
            Post(
                2,
                "https://images.unsplash.com/photo-1649191809435-f10340ba00a4?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80",
                "#060B0F"
            )
        )
        items.add(
            Post(
                3,
                "https://images.unsplash.com/photo-1647485684426-4e4a53cb87a9?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1332&q=80",
                "#5B6872"
            )
        )
        items.add(
            Post(
                1,
                "https://images.unsplash.com/photo-1649109599972-a2415dc30534?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80",
                "#00241D"
            )
        )

        items.add(
            Post(
                1,
                "https://images.unsplash.com/photo-1649353935169-fe9911bf240f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1332&q=80",
                "#FF9E05"
            )
        )
        items.add(
            Post(
                2,
                "https://images.unsplash.com/photo-1649191809435-f10340ba00a4?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80",
                "#060B0F"
            )
        )
        items.add(
            Post(
                3,
                "https://images.unsplash.com/photo-1647485684426-4e4a53cb87a9?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1332&q=80",
                "#5B6872"
            )
        )
        items.add(
            Post(
                1,
                "https://images.unsplash.com/photo-1649109599972-a2415dc30534?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80",
                "#00241D"
            )
        )
        items.add(
            Post(
                1,
                "https://images.unsplash.com/photo-1649353935169-fe9911bf240f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1332&q=80",
                "#FF9E05"
            )
        )
        items.add(
            Post(
                2,
                "https://images.unsplash.com/photo-1649191809435-f10340ba00a4?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80",
                "#060B0F"
            )
        )
        items.add(
            Post(
                3,
                "https://images.unsplash.com/photo-1647485684426-4e4a53cb87a9?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1332&q=80",
                "#5B6872"
            )
        )
        items.add(
            Post(
                1,
                "https://images.unsplash.com/photo-1649109599972-a2415dc30534?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80",
                "#00241D"
            )
        )
        return items
    }
}