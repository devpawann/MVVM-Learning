package com.pawan.mvvmlearning

import dagger.Module
import dagger.Provides



//Considering Memory card as an 3rd party library class we are using module here
//Since for 3rd party class we cant access constructor we use this method

@Module
class MemoryCardModule {

    @Provides
    fun provideMemoryCard():MemoryCard{
        return MemoryCard()

    }
}