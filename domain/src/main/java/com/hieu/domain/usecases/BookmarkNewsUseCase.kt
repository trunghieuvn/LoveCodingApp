package com.hieu.domain.usecases

import com.hieu.domain.dao.NewsRepo
import com.hieu.domain.entity.NewsItem
import io.reactivex.Completable

interface BookmarkNewsUseCase {
    fun execute (newsItem : NewsItem) : Completable
}

class BookmarkNewsUseCaseImpl(private val newsRepo: NewsRepo) : BookmarkNewsUseCase {
    override fun execute(newsItem: NewsItem): Completable {
      return  newsRepo.bookmarkLocally(newsItem)
            .concatWith { newsRepo.addBookmarkRemote(newsItem) }
    }

}