package br.unipar.gestaodefazenda


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.unipar.gestaodefazenda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Botão para iniciar a CadastroActivity
        binding.buttonCadastro.setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }
    }
}
