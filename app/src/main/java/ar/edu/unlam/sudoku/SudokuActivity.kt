package ar.edu.unlam.sudoku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ar.edu.unlam.sudoku.databinding.ActivityMainBinding

class SudokuActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}