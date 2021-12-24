package com.bouncy.floatingmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import com.bouncy.floatingmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        registerForContextMenu(binding.btn1)
        setContentView(binding.root)
    }

       override fun onCreateContextMenu(
           menu: ContextMenu?,
           v: View?,
           menuInfo: ContextMenu.ContextMenuInfo?
       ) {
           super.onCreateContextMenu(menu,v,menuInfo)
           menuInflater.inflate(R.menu.floating_context_menu, menu)
       }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item1 -> Toast.makeText(this,"item 1",Toast.LENGTH_SHORT).show()
            R.id.item2 -> Toast.makeText(this,"item 2",Toast.LENGTH_SHORT).show()
            R.id.item3 -> Toast.makeText(this,"item 3",Toast.LENGTH_SHORT).show()
        }
        return super.onContextItemSelected(item)
    }

}