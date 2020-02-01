package infra

import domain.PoetryReader

class ConsoleAdapter(private val poetryReader: PoetryReader, private val writeStrategy: IWriteStuffOnTheConsole) {

   constructor(poetryReader: PoetryReader): this(poetryReader, DefaultPublicationStrategy())

    fun ask() {
        val verses = this.poetryReader.giveMeSomePoetry()
        this.writeStrategy.writeLine("A beautiful poem:\n\n$verses")
    }
}

class DefaultPublicationStrategy : IWriteStuffOnTheConsole {
   override fun writeLine(text: String) {
      println(text)
   }
}
