package dev.tfowler.kutils

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KutilsApplication

fun main(args: Array<String>) {
	runApplication<KutilsApplication>(*args)
}
