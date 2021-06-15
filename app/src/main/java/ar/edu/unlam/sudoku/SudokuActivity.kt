package ar.edu.unlam.sudoku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ar.edu.unlam.sudoku.databinding.ActivityMainBinding
import ar.edu.unlam.sudoku.databinding.ActivitySudokuBinding

class SudokuActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySudokuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySudokuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}