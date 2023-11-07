package com.example.penguintraininggame.ui.feed

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ImageView
import androidx.annotation.Nullable
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.example.android.penguingame.ui.shop.FeedListViewModel
import com.example.penguintraininggame.R
import com.example.penguintraininggame.databinding.FragmentFeedListBinding


class FeedListDialogFragment : DialogFragment() {
    private var _binding: FragmentFeedListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    var cancelButton : ImageView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val feedListViewModel =
            ViewModelProvider(this).get(FeedListViewModel::class.java)

        _binding = FragmentFeedListBinding.inflate(inflater, container, false)
        val root: View = binding.root
//        initView()
//        val navController = findNavController(R.id.feed_item4)
//
//        view.findViewById<ImageView>(R.id.home_menu).setOnClickListener {
//            navController.navigate(R.id.navigation_home)
//        }
          return root
//        return inflater.inflate(R.layout.fragment_feed_list, container, false)
    }
//    private fun initView() {
//        val feed1 = binding.feedItem1
//        val transaction = parentFragmentManager.beginTransaction()
//        val feedItemFragment = FeedItemFragment()
//        transaction.add(feed1, feedItemFragment)
//        transaction.commit()
//    }
    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
//            val transaction = parentFragmentManager.beginTransaction()
//            val feedFragment = FeedItemFragment()
//            transaction.add(R.id.feed_item1, feedFragment)
//            transaction.commit()

        cancelButton = (view.findViewById<View>(R.id.feed_cancel) as ImageView )
        cancelButton?.setOnClickListener{
            closeDialog(dialog)
        }
        super.onViewCreated(view, savedInstanceState)
    }
    override fun onStart() {
        val params = dialog!!.window!!.attributes
        params.width = ViewGroup.LayoutParams.MATCH_PARENT
        params.height = ViewGroup.LayoutParams.MATCH_PARENT
        dialog!!.window!!.attributes = params as WindowManager.LayoutParams
        super.onStart()
    }

    /**
     * dialogを閉じる
     *
     * @param mDialogUtils
     */
    private fun closeDialog(mDialogUtils: Dialog?) {
        if (mDialogUtils != null && mDialogUtils.isShowing) {
            mDialogUtils.dismiss()
        }
    }
    companion object {
    }
}