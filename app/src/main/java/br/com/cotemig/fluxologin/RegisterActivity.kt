package br.com.cotemig.fluxologin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var email = intent.getStringExtra("email")

        var emailRegister = findViewById<EditText>(R.id.emailRegister)
        var passwordRegister = findViewById<EditText>(R.id.passwordRegister)
        emailRegister.setText(email)

        var btnRegister = findViewById<Button>(R.id.buttonRegisterConcluir)

        btnRegister.setOnClickListener(){
            handleRegister(emailRegister.text.toString(), passwordRegister.text.toString())
        }


    }

    private fun handleRegister(emailRegister: String, passwordRegister: String) {
        if(emailRegister != "" && passwordRegister != ""){
            intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        else{
            print("Campos e-mail e senha são obrigatórios.")
        }
    }
}