package com.example.curriculumvitae2.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.fragment.app.Fragment
import com.example.curriculumvitae2.R


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [skills.newInstance] factory method to
 * create an instance of this fragment.
 */
class skills : Fragment() {


    private var seekBarAndroid: SeekBar? = null
    private var seekBarIos: SeekBar? = null
    private var seekBarFlutter: SeekBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        seekBarAndroid= view?.findViewById(R.id.SeekBarAndr2)
        seekBarIos= view?.findViewById(R.id.SeekBarIos2)
        seekBarFlutter= view?.findViewById(R.id.SeekBarFlutter2)





//     arguments?.let{
//
//
//     }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_skills, container, false)
    }

//    companion object {
//        fun newInstance() =
//            skills().apply {
//                arguments = Bundle().apply {
//                              Int skillAndroid
//                             skillIos
//                            skillFlutte
//                }
//            }



    }


}