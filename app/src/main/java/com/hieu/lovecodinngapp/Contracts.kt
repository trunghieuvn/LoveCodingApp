package com.hieu.lovecodinngapp

import com.hieu.domain.entity.NewsItem

interface View {
    fun bindNewsList(newsItems: List<NewsItem>)
}

interface Presenter {
    fun presentNewsList()

    fun destroy()

    fun attachView(view: View)
}

