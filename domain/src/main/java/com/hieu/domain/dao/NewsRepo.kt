package com.hieu.domain.dao

import com.hieu.domain.entity.NewsItem
import io.reactivex.Observable

// data access object


interface NewsRepo {
    fun getAllNewsItems () : Observable<List<NewsItem>>
}

class NewsRepoImpl : NewsRepo{
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

}