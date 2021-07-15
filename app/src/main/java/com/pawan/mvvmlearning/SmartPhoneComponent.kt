package com.pawan.mvvmlearning

import dagger.Component

@Component(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {

    fun getSmartPhone():SmartPhone
}