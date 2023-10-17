package com.raka.muplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var menu: Menu? = null
    private lateinit var rvPlayer: RecyclerView
    private var list: ArrayList<Player> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(androidx.appcompat.R.style.Theme_AppCompat)
        setContentView(R.layout.activity_main)

        rvPlayer = findViewById(R.id.rv_player)
        rvPlayer.setHasFixedSize(true)

        list.addAll(PlayerData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvPlayer.layoutManager = LinearLayoutManager(this)
        val listPlayerAdapter = ListPlayerAdapter(list)
        rvPlayer.adapter = listPlayerAdapter

        listPlayerAdapter.setOnItemClickCallback(object :
            ListPlayerAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Player) {
                showDetailPlayer(data)
            }
        })
    }


    private fun showDetailPlayer(data: Player) {
        Toast.makeText(this, "Kamu memilih detail " + data.name, Toast.LENGTH_SHORT).show()
        val detail = Intent(this@MainActivity, DetailActivity::class.java)
        detail.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
        detail.putExtra("name", data.name)
        detail.putExtra("description", data.description)
        detail.putExtra("overall", data.overall)
        detail.putExtra("detail", data.detail)
        detail.putExtra("photo", data.photo)
        startActivity(detail)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile_menu, menu)
        this.menu = menu
        return true
    }

    override  fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.profile -> {
                val profile = Intent(this@MainActivity, ProfileActivity::class.java)
                profile.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
                startActivity(profile)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}