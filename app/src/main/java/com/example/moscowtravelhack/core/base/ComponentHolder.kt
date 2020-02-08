package com.example.moscowtravelhack.core.base

import com.example.moscowtravelhack.core.screen.ComponentCompanion
import java.util.concurrent.ConcurrentHashMap

object ComponentHolder {

    private val linkCounter = ConcurrentHashMap<Int, Int>()
    private val components = ConcurrentHashMap<Int, Any>()

    fun <C> getOrCreate(companion: ComponentCompanion<C>): C where C : Any {
        val hash = companion::class.hashCode()

        val currentLinkCount = linkCounter[hash] ?: 0
        val newLinkCount = currentLinkCount + 1
        linkCounter[hash] = newLinkCount

        return components.getOrPut(hash) { companion.createComponent() } as C
    }

    fun <C> destroyIfNeeded(companion: ComponentCompanion<C>) where C : Any {
        val hash = companion::class.hashCode()

        val currentLinkCount = linkCounter[hash] ?: 0
        val newLinkCount = Math.max(currentLinkCount - 1, 0)
        linkCounter[hash] = newLinkCount

        if (newLinkCount == 0) {
            components.remove(hash)
        }
    }
}