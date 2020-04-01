package com.mustafayigit.kotlin_milliyetapp.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mustafayigit.kotlin_milliyetapp.R
import com.mustafayigit.kotlin_milliyetapp.adapter.WriterModelAdapter
import com.mustafayigit.kotlin_milliyetapp.mock.MockData
import com.mustafayigit.kotlin_milliyetapp.util.extToast
import kotlinx.android.synthetic.main.fragment_writer.*

/**
 * A simple [Fragment] subclass.
 */
class WriterFragment : Fragment(R.layout.fragment_writer) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recyclerWriterList.adapter = WriterModelAdapter(MockData.getWriterList())

        swipeLayout.setOnRefreshListener {
            "Refresh Writer" extToast (requireContext())
            swipeLayout.isRefreshing = false
        }
    }


}
