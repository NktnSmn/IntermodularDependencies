package com.nktnsmn.common.di

abstract class DIComponentBuilder<C> {

    fun buildComponent(): C {
        val component: C = buildComponentImmediately()
        onComponentBuilt(component)
        return component
    }

    protected abstract fun buildComponentImmediately(): C

    @Suppress("UNUSED_PARAMETER")
    protected fun onComponentBuilt(component: C) {
    }
}