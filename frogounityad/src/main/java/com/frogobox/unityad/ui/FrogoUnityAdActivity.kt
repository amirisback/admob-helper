package com.frogobox.unityad.ui

import android.os.Bundle
import com.frogobox.sdk.ext.showLogD
import com.frogobox.sdk.view.FrogoActivity
import com.frogobox.unityad.delegate.UnityAdDelegates
import com.frogobox.unityad.delegate.UnityAdDelegatesImpl

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * ImplementationAdmob
 * Copyright (C) 31/10/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.admobhelper
 *
 */


abstract class FrogoUnityAdActivity : FrogoActivity(),
    UnityAdDelegates by UnityAdDelegatesImpl() {

    companion object {
        val TAG: String = FrogoUnityAdActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            showLogD<FrogoUnityAdActivity>("Run onCreate() From $TAG")
            setupUnityAdDelegates(this)
        }
    }

}