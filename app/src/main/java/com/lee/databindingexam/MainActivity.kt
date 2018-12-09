package com.lee.databindingexam

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.lee.databindingexam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainInterface{


    var mBinding: ActivityMainBinding? = null

    var mInputData: InputData? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mInputData = InputData("DataBinding Exam", null, "")

        mBinding?.inputData = mInputData

        /**
         * 레이아웃 파일에 있는 인터페이스와 연결한다.
         * 이걸 안하면 레이아웃에서 이쪽으로 함수호출이 안된다.
         */
        mBinding?.mainInterface = this



    }

    override fun onInputText() {
        Log.d("Lee", "onInputText 호출됨")
        mInputData?.inputText = mBinding?.etInput?.text.toString()
        mBinding?.inputData = mInputData
    }

    override fun setImageUrl() {
        Log.d("Lee", "setImageUrl 호출됨")
        mInputData?.imageUrl = "https://i.redd.it/g5acbfi5hkm01.jpg"
        GlideAdapter.setImage(mBinding!!.ivImage, mInputData?.imageUrl!!)
        mInputData?.imageVisible = if (mInputData?.imageVisible == true) false else true
        mBinding?.inputData = mInputData
    }
}
