package main

import domain.IObtainPoems
import domain.PoetryReader
import infra.ConsoleAdapter

fun main() {
    val getAPoem = object : IObtainPoems {
        override fun getAPoem() = "Ceci n'est pas un poème - rbitard 2020"
    }

    val poetryReader = PoetryReader(getAPoem)

    val consoleAdapter = ConsoleAdapter(poetryReader)

    consoleAdapter.ask()
}
