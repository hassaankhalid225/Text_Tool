package com.nts.text.app.converter

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.nts.text.app.converter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var clipboardManager: ClipboardManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup toolbar
        setSupportActionBar(binding.toolbar)

        // Initialize clipboard manager
        clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager        
        
        // Setup button click listeners
        setupButtonListeners()
    }
    


    /**
     * Sets up all button click listeners for text manipulation actions
     */
    private fun setupButtonListeners() {
        // TO UPPERCASE
        binding.btnUppercase.setOnClickListener {
            val text = binding.editTextInput.text.toString()
            binding.editTextOutput.setText(text.uppercase())
        }

        // TO LOWERCASE
        binding.btnLowercase.setOnClickListener {
            val text = binding.editTextInput.text.toString()
            binding.editTextOutput.setText(text.lowercase())
        }

        // TITLE CASE
        binding.btnTitleCase.setOnClickListener {
            val text = binding.editTextInput.text.toString()
            binding.editTextOutput.setText(convertToTitleCase(text))
        }

        // REMOVE EXTRA SPACES
        binding.btnRemoveSpaces.setOnClickListener {
            val text = binding.editTextInput.text.toString()
            val cleanedText = text.trim().replace(Regex("\\s+"), " ")
            binding.editTextOutput.setText(cleanedText)
        }

        // REVERSE TEXT
        binding.btnReverse.setOnClickListener {
            val text = binding.editTextInput.text.toString()
            binding.editTextOutput.setText(text.reversed())
        }

        
        // CLEAR TEXT
        binding.btnClear.setOnClickListener {
            binding.editTextInput.setText("")
            binding.editTextOutput.setText("")
        }

        // COPY
        binding.btnCopy.setOnClickListener {
            val text = binding.editTextOutput.text.toString()
            if (text.isNotEmpty()) {
                val clip = ClipData.newPlainText("TextCraft Utility", text)
                clipboardManager.setPrimaryClip(clip)
                Toast.makeText(this, getString(R.string.text_copied), Toast.LENGTH_SHORT).show()
            }
        }

        // SHARE
        binding.btnShare.setOnClickListener {
            val text = binding.editTextOutput.text.toString()
            if (text.isNotEmpty()) {
                val shareIntent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, text)
                    type = "text/plain"
                }
                startActivity(Intent.createChooser(shareIntent, null))
            }
        }
    }


    /**
     * Converts text to title case (first letter of each word capitalized)
     * 
     * @param text The input text to convert
     * @return Text in title case format
     */
    private fun convertToTitleCase(text: String): String {
        if (text.isEmpty()) return text

        return text.split(" ").joinToString(" ") { word ->
            if (word.isEmpty()) {
                word
            } else {
                word.substring(0, 1).uppercase() + word.substring(1).lowercase()
            }
        }
    }
}

