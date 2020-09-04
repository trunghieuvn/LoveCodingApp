package com.hieu.domain.usecases

import com.hieu.domain.dao.NewsRepo
import com.hieu.domain.entitys.NewsItem
import io.reactivex.Observable

interface  RetrieveNewsItemUseCase {
    fun execute() :  Observable< List<NewsItem>>
}
class RetrieveNewsItemUseCaseImpl(private val repo: NewsRepo) : RetrieveNewsItemUseCase {
    override fun execute(): Observable<List<NewsItem>> {
        return repo.getAllNewsItems();
    }

}