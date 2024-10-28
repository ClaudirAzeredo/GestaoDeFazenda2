package br.unipar.gestaodefazenda

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro_activity)

        // Configurando o ViewPager e TabLayout
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        // Adapter para o ViewPager
        val adapter = object : FragmentPagerAdapter(supportFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
            override fun getCount(): Int = 2 // Quantidade de abas (fragmentos)

            override fun getItem(position: Int): Fragment {
                // Retorna o fragmento com base na posição da aba
                return when (position) {
                    0 -> CadastroAnimal()
                    1 -> CadastroPlanta()
                    else -> throw IllegalStateException("Posição inválida $position")
                }
            }

            override fun getPageTitle(position: Int): CharSequence {
                // Define o título das abas
                return when (position) {
                    0 -> "Animais"
                    1 -> "Plantas"
                    else -> ""
                }
            }
        }

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager) // Liga o TabLayout com o ViewPager
    }
}
