package com.alfansyah.android.kotlin_recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvFootballs: RecyclerView
    private var list:ArrayList<Football> = arrayListOf()
    private var title: String = "Mode List"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvFootballs = findViewById(R.id.rv_footballs)
        rvFootballs.setHasFixedSize(true)

        list.addAll(FootballsData.listData)
        showRecyclerList()


    }

    private fun showRecyclerList() {
        rvFootballs.layoutManager = LinearLayoutManager(this)
        val listFootballAdapter = ListFootballAdapter(list)
        rvFootballs.adapter = listFootballAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }
            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
                title = "Mode Card"
                showRecyclerCardView()
            }
        }
        setActionBarTitle(title)
    }

    private fun showRecyclerGrid() {
        rvFootballs.layoutManager = GridLayoutManager(this, 2)
        val gridFootballAdapter = GridFootballAdapter(list)
        rvFootballs.adapter = gridFootballAdapter
    }

    private fun showRecyclerCardView() {
        rvFootballs.layoutManager = LinearLayoutManager(this)
        val cardViewFootballAdapter = CardViewFootballAdapter(list)
        rvFootballs.adapter = cardViewFootballAdapter
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}
