package br.com.cotemig.fluxologin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btnLogin = findViewById<Button>(R.id.buttonLogin)

        var email = findViewById<EditText>(R.id.emailLogin)
        var password = findViewById<EditText>(R.id.passwordLogin)

        var forgotClick = findViewById<TextView>(R.id.esqueciSenha)
        var registerClick = findViewById<Button>(R.id.buttonRegister)

        btnLogin.setOnClickListener(){
            handleLogin(email.text.toString(), password.text.toString())
        }

        forgotClick.setOnClickListener(){
            handleForgot(email.text.toString())
        }

        registerClick.setOnClickListener(){
            handleRegister(email.text.toString())
        }
    }

    private fun handleLogin(email: String, password: String) {
        if(email != "" && password != ""){
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        else{
            print("Campos e-mail e senha são obrigatórios.")
        }
    }

    private fun handleRegister(email: String) {
        var intent = Intent(this, RegisterActivity::class.java)
        intent.putExtra("email", email)
        startActivity(intent)
    }

    private fun handleForgot(email: String) {
        var intent = Intent(this, ForgotActivity::class.java)
        intent.putExtra("email", email)
        startActivity(intent)
    }

}