package com.example.penguintraininggame.ui.feed

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import com.example.penguintraininggame.R

class FeedFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_feed_list,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner){
        parentFragmentManager.beginTransaction().remove(this@FeedFragment).commit()
        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        val fragments=parentFragmentManager.fragments
        val feed_behind=fragments[0].view?.findViewById<ImageView>(R.id.feed_behind)
        feed_behind?.isClickable=false
        feed_behind?.isFocusable=false
    }

    override fun onDetach() {
        super.onDetach()
        val fragments=parentFragmentManager.fragments
        val feed_behind=fragments[0].view?.findViewById<ImageView>(R.id.feed_behind)
        feed_behind?.isClickable=true
        feed_behind?.isFocusable=true
    }
    override fun onDestroyView() {
        super.onDestroyView()
    }
}