package br.com.cotemig.fluxologin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ForgotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)

        var email = intent.getStringExtra("email")

        var emailForgot = findViewById<EditText>(R.id.emailForgot)
        emailForgot.setText(email)

        var btnProceed = findViewById<Button>(R.id.buttonRegisterConcluir)

        btnProceed.setOnClickListener(){
            handleProceed()
        }

    }

    private fun handleProceed() {
        var intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}