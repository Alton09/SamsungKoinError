package example.com.samsungkoinerror

import android.app.Application
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.module

class TestApp: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(module {single { Person("Bob") }}))
    }
}