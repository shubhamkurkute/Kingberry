package com.cloudit.kingberry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import com.cloudit.kingberry.Classes.NextScreen
import com.cloudit.kingberry.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var userName:String
    private lateinit var passWord:String
    private lateinit var binding:ActivityMainBinding
    private lateinit var nextScreen: NextScreen
    private var loginInfo = LoginInfo()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        binding.button.setOnClickListener {
            userName = binding.username.text.toString()
            passWord = binding.pasword.text.toString()
//            checkCredentials()
            nextActivity()

        }

    }
    private fun checkCredentials(){
        val userNameO = loginInfo?.userName.toString()
        val passwordO = loginInfo?.passWord.toString()
        if (userName==userNameO&&passWord==passwordO){
            Toast.makeText(this,"Login Successfull",Toast.LENGTH_SHORT).show()
            nextActivity()
        }else{
            Toast.makeText(this,"Login unSuccessfull",Toast.LENGTH_SHORT).show()

        }

    }
    private fun nextActivity(){
        val intent = Intent(applicationContext,employee_names::class.java)
        startActivity(intent)
    }

}