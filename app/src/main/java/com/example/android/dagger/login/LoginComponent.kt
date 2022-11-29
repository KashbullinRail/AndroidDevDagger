package com.example.android.dagger.login

import com.example.android.dagger.di.ActiveScope
import dagger.Subcomponent


@ActiveScope
@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory{
        fun create(): LoginComponent
    }

    fun inject(activity: LoginActivity)

}