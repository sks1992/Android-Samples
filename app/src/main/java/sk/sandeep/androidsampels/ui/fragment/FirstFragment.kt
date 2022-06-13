package sk.sandeep.androidsampels.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import sk.sandeep.androidsampels.R
import sk.sandeep.androidsampels.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TAG", "FirstFragment: onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("TAG", "FirstFragment: onCreateView")

        val binding = DataBindingUtil.inflate<FragmentFirstBinding>(
            inflater,
            R.layout.fragment_first,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAG", "FirstFragment: onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("TAG", "FirstFragment: onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "FirstFragment: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "FirstFragment: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "FirstFragment: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "FirstFragment: onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("TAG", "FirstFragment: onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TAG", "FirstFragment: onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "FirstFragment: onDestroy")
    }
}
/** Todo :When Main Activity That contain fragment container view launched lifecycle called?
 * 1.FirstFragment: onCreate
 * 2.MainActivity: onCreate
 * 3.FirstFragment: onCreateView
 * 4.FirstFragment: onViewCreated
 * 5.FirstFragment: onViewStateRestored
 * 6.FirstFragment: onStart
 * 7.MainActivity: onStart
 * 8.MainActivity: onResume
 * 9.FirstFragment: onResume
 * */