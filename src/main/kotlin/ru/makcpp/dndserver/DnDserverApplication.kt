package ru.makcpp.dndserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DnDserverApplication

fun main(args: Array<String>) {
    runApplication<DnDserverApplication>(*args)
}
