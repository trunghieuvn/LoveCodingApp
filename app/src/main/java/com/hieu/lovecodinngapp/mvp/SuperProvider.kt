package com.hieu.lovecodinngapp.mvp

import com.hieu.domain.dao.NewsRepo
import com.hieu.domain.dao.NewsRepoImpl
import com.hieu.domain.usecases.RetrieveNewsItemUseCase
import com.hieu.domain.usecases.RetrieveNewsItemUseCaseImpl
import com.hieu.lovecodinngapp.common.provider.ScheduleProvider
import com.hieu.lovecodinngapp.common.provider.ScheduleProviderImpl

/// Service locateter

object SuperProvider {
    fun providePresenter () : Presenter {
        return MainPresenter(
            provideGetAllNewsUserCase(),
            schedulerProvider()
        )
    }

    private fun schedulerProvider() : ScheduleProvider {
        return ScheduleProviderImpl()
    }

    private fun provideGetAllNewsUserCase() : RetrieveNewsItemUseCase {
        return RetrieveNewsItemUseCaseImpl(provideNewsRepo())
    }

    private fun provideNewsRepo() : NewsRepo {
        return NewsRepoImpl()
    }


}