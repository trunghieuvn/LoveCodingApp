package com.hieu.lovecodinngapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hieu.domain.entity.NewsItem

// -------- MVP pattern --------

// View: (correct interaction from user)
//  - Validator input,
//  - Change UI inline
//
class MainActivity : AppCompatActivity(), View {
    private val presenter by lazy { SuperProvider.providePresenter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.attachView(this)
        presenter.presentNewsList()
    }

    override fun bindNewsList(newsItems: List<NewsItem>) {
        Toast.makeText(this, "$newsItems", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        presenter.destroy()
        super.onDestroy()
    }
}