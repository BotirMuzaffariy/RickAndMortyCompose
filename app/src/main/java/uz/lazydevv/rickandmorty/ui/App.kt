package uz.lazydevv.rickandmorty.ui

import android.app.Application
import com.apollographql.apollo3.ApolloClient

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        apolloClient = ApolloClient.Builder()
            .serverUrl(BASE_URL)
            .build()
    }

    companion object {

        lateinit var apolloClient: ApolloClient

        private const val BASE_URL = "https://rickandmortyapi.com/graphql"
    }
}