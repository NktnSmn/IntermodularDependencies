package com.nktnsmn.common.di

abstract class DIComponentBuilder<C> {

    fun buildComponent(): C {
        val component: C = buildComponentImmediately()
        onComponentBuilt(component)
        return component
    }

    protected abstract fun buildComponentImmediately(): C

    protected fun onComponentBuilt(component: C) {
    }
}