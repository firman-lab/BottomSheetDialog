package com.elpath.bottomsheetdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btm = findViewById<ConstraintLayout>(R.id.bottomSheet)
        val bg = findViewById<View>(R.id.bgTsp)

        bottomSheetBehavior = BottomSheetBehavior.from(btm)
        bottomSheetBehavior.peekHeight = 100
        bottomSheetBehavior.isHideable = false

        bottomSheetBehavior.addBottomSheetCallback(object :
        BottomSheetBehavior.BottomSheetCallback(){
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                bg.visibility = when (newState) {
                    BottomSheetBehavior.STATE_EXPANDED -> View.VISIBLE
                    BottomSheetBehavior.STATE_COLLAPSED -> View.GONE
                    else -> View.VISIBLE
                }


            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {

            }

        })

//        open.setOnClickListener{
//            val state =
//                if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_EXPANDED){
//                    BottomSheetBehavior.STATE_COLLAPSED
//                } else{
//                    BottomSheetBehavior.STATE_EXPANDED
//                }
//            bottomSheetBehavior.state = state
//        }

    }



}