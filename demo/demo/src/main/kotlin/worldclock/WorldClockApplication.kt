package com.example.worldclock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WorldClockApplication

fun main(args: Array<String>) {
	runApplication<WorldClockApplication>(*args)
}
