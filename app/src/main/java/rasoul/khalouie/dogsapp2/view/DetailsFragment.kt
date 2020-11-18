package rasoul.khalouie.dogsapp2.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import rasoul.khalouie.dogsapp2.R
import rasoul.khalouie.dogsapp2.databinding.FragmentDetailsBinding
import rasoul.khalouie.dogsapp2.databinding.FragmentListBinding
import java.util.*

class DetailsFragment : Fragment() {

    private lateinit var binding: FragmentDetailsBinding

    private  var dogUuid = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_details,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            dogUuid = DetailsFragmentArgs.fromBundle(it).dogUuId

        }

    }

}