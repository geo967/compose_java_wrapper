package com.example.composewrapperjava

import android.content.Context
import android.util.AttributeSet
import androidx.cardview.widget.CardView
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.AbstractComposeView

class CardScreenView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AbstractComposeView(context, attrs, defStyleAttr) {
//    private lateinit var onCardButtonClicked:()-> Unit
//    fun setOnCardButtonClickedListener(onClick:()->Unit){
//        onCardButtonClicked = onClick
//    }
    // The Content function works as a Composable function so we can now define our Compose UI components to render.
    @Composable
    override fun Content() {
        CardView()//onCardButtonClicked = {onCardButtonClicked()})
    }

}