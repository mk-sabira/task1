package com.example.aggregator.screens

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aggregator.R
import com.example.aggregator.databinding.FragmentAuthorizationBinding
import com.example.aggregator.databinding.FragmentRegistrationBinding


class Registration : Fragment() {

    lateinit var binding: FragmentRegistrationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrationBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        getData()
    }

    private fun getData() {
        binding.btnSave.setOnClickListener {
            val userName = binding.edUserName.text
            val userSurname = binding.edUserSurname.text
            val userEmail = binding.edEmail.text
            Log.d("MyLog", "$userName + $userSurname + $userEmail")
        }
    }

    companion object{
        @JvmStatic
        fun newInstance() = Registration()
    }

}