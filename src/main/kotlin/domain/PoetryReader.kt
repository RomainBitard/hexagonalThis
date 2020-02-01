package domain

class PoetryReader(private val poetryLibrary: IObtainPoems) {
    fun giveMeSomePoetry() : String {
        return this.poetryLibrary.getAPoem()
    }
}

