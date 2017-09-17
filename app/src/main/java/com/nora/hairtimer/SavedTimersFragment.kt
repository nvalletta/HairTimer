package com.nora.hairtimer

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SavedTimersFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (inflater != null) {
            return inflater.inflate(R.layout.fragment_saved_timers, container, false)
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }

}