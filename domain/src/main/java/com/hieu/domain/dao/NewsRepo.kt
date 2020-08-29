package com.hieu.domain.dao

import com.hieu.domain.entity.NewsItem
import io.reactivex.Completable
import io.reactivex.Observable

// DAO = data access object

interface NewsRepo {
    fun getAllNewsItems () : Observable<List<NewsItem>>
    fun bookmarkLocally(newsItem: NewsItem) : Completable
    fun addBookmarkRemote(newsItem: NewsItem) : Completable
}

class NewsRepoImpl : NewsRepo {
    override fun getAllNewsItems(): Observable<List<NewsItem>> {
       return Observable.just(listOf(
           NewsItem(
               "id1",
               "Github is free",
               "Finally, MS makes github is free with private repo",
               1598723049
           )
       ));
    }

    override fun bookmarkLocally(newsItem: NewsItem): Completable {
        return Completable.complete()
    }

    override fun addBookmarkRemote(newsItem: NewsItem): Completable {
        return Completable.complete()
    }

}