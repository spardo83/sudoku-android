package ar.edu.unlam.sudoku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import ar.edu.unlam.sudoku.databinding.ActivityMainBinding
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        checkSavedGames()
        checkScores()
        setListener()
    }

    private fun setListener() {
        binding.buttonNewGame.setOnClickListener { newGame() }

        binding.seekBarLevel.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                binding.textViewLevel.text = when(progress) {
                    0 -> getString(R.string.super_easy)
                    1 -> getString(R.string.easy)
                    2 -> getString(R.string.medium)
                    3 -> getString(R.string.hard)
                    else -> throw Exception("Nivel elegido erroneo")
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })
    }

    private fun checkScores() {
        //Aca chequar si existe historial de puntajes
        binding.buttonScores.isEnabled = false
    }

    private fun checkSavedGames() {
        //Aca chequear si existe historial de partidas guardadas
        binding.buttonSavedGames.isEnabled = false
    }

    private fun newGame() {
        val intent = Intent(this, SudokuActivity::class.java)
        startActivity(intent)
        finish()
    }
}