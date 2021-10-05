package com.example.aggregator.screens


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.aggregator.R
import com.example.aggregator.databinding.FragmentAuthorizationBinding


class Authorization : Fragment(), AdapterView.OnItemSelectedListener {

    lateinit var binding: FragmentAuthorizationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAuthorizationBinding.inflate(inflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        spinner()
        openScreenForgotPassword()
        openScreenRegistration()
    }

    private fun openScreenRegistration() {
        binding.btnRegistration.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.container, Registration.newInstance())
                .commit()
        }
    }

    private fun openScreenForgotPassword() {
        binding.tvForgotPassword.setOnClickListener{
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.container, PasswordRecovery.newInstance() )
                .commit()
        }
    }

    private fun spinner() {
        val spinner = binding.spinner
        ArrayAdapter.createFromResource(
            this.requireContext(),
            R.array.User_Type,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
    }


    companion object{
        @JvmStatic
        fun newInstance() = Authorization()
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        TODO("Not yet implemented")
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }


}