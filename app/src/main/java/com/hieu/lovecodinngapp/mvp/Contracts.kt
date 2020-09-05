package com.hieu.lovecodinngapp.mvp

import com.hieu.domain.entitys.NewsItem

interface View {
    fun bindNewsList(newsItems: List<NewsItem>)
}

interface Presenter {
    fun presentNewsList()

    fun destroy()

    fun attachView(view: View)
}

