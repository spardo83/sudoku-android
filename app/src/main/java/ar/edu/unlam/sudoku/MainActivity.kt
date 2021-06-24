package ar.edu.unlam.sudoku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ar.edu.unlam.sudoku.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        clickBotonNuevoJuego()
    }

    private fun clickBotonNuevoJuego() {
        binding.buttonNewGame.setOnClickListener {
            val intent = Intent(this, SudokuActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
