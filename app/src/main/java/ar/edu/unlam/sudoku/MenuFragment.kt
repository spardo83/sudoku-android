package ar.edu.unlam.sudoku

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import ar.edu.unlam.sudoku.databinding.FragmentMenuBinding
import java.lang.Exception


class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.fragment_menu, container, false)
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
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