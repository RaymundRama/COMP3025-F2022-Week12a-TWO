package com.example.comp3025_f2022_week12a

import androidx.fragment.app.Fragment

class FragmentTwo: Fragment(R.layout.fragment_two) {

    override fun onViewCreate(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        var FragmentTwoToOneButton = getView()?.findViewById<Button>(R.id.fragment_two_to_one_button)

        FragmentTwoToOneButton?.setOnClickListener{
            (activity as MainActivity).supportFragmentManager.commit{
                replace<FragmentOne>(R.id.fragment_container)
            }
        }
    }
}