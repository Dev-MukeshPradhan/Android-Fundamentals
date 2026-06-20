package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) { // We are reading and storing existing data from bundle  in parameters
        super.onCreate(savedInstanceState)               // because whenever screen gets rotation new fragment is being drawn
        arguments?.let {  // we will continue only if arguments are not null(Arguments are provided from main_activity while creating instance)
            param1 = it.getString(ARG_PARAM1)  // retrieving data
            param2 = it.getString(ARG_PARAM2) // the two parameters given at mainActivity are being red here
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, // it is Used to convert an XML layout file into actual View objects.
        container: ViewGroup?,    // The parent layout where this Fragment will be placed.
        savedInstanceState: Bundle?  //Contains previously saved data if the Fragment is recreated.
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)  // false = fragment manager will decide, we will manually not attach the fragment into cointainer
    }

    companion object {  // It is not necessary to create object using companion object, we can create our own simple objects
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)  // Hello cstechtube are stored at both these parameters
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}