package com.example.curriculumvitae2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [skills.newInstance] factory method to
 * create an instance of this fragment.
 */
class skills : Fragment() {
//    private  var and : Float = 0.0f
//    private  var ios : Float = 0.0f
//    private  var fltr : Float = 0.0f

    private var seekBarAndroid: SeekBar? = null
    private var seekBarIos: SeekBar? = null
    private var seekBarFlutter: SeekBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        seekBarAndroid= view?.findViewById(R.id.SeekBarAndr2)
        seekBarIos= view?.findViewById(R.id.SeekBarIos2)
        seekBarFlutter= view?.findViewById(R.id.SeekBarFlutter2)

        seekBarAndroid?.progress=requireArguments().
//        val skillIos = intent.getStringExtra(IOS).toString()
//        al skillFlutter = intent.getStringExtra(FLUTTER).toString()v

       // arguments?.let {
//            and = it.getFloat(ARG_PARAM1)
//            ios = it.getFloat(ARG_PARAM2)
//            fltr = it.getFloat(fltr)
      //  }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_skills, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment skills.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            skills().apply {
                arguments = Bundle().apply {

                }
            }



    }


}