package com.example.penguintraininggame.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.penguintraininggame.R
import com.example.penguintraininggame.ui.feed.FeedListDialogFragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    private fun dialogShow(){
        var customDialog = FeedListDialogFragment()
        customDialog.show(parentFragmentManager,null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = view.findNavController()
        view.findViewById<ImageView>(R.id.background).setImageResource(R.drawable.bg_day)
        view.findViewById<ImageView>(R.id.penguin).setImageResource(R.drawable.body_blue)
        view.findViewById<ImageView>(R.id.feed_behind)
            .setOnClickListener { context?.let { dialogShow() } }
    }
    override fun onDestroyView() {
        super.onDestroyView()
    }
}