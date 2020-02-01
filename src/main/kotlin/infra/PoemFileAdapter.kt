package infra

import domain.IObtainPoems
import java.io.FileReader

class PoemFileAdapter(path: String) : IObtainPoems {
    private val poem: String = FileReader(path).readText()

    override fun getAPoem(): String {
        return this.poem
    }

}
