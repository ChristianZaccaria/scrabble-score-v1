/**
 * Christian Zaccaria (20092351) - SSD Year 2
 * */

class ScrabbleScore {

    fun scoreWord(word: String): Int{
        //TODO calculate using the scoreLetter method below, the scrabble value of the word passed as a parameter
        var result: Int = 0

        for (item in word)
            result += scoreLetter(item)

        return result
        //This webpage gave me the idea of how to solve this:
        //https://www.codecademy.com/forum_questions/522f576fabf82117ec000f21
    }

    //TODO the program if the user enters in any chars other than capital letters...try fix this.
    //Reference: https://exercism.org/tracks/kotlin/exercises/scrabble-score/solutions?page=1
    private fun scoreLetter(char: Char): Int {
        return when (char.uppercase()) {
            in "AEIOULNRST" -> 1
            in "DG" -> 2
            in "BCMP" -> 3
            in "FHVWY" -> 4
            in "K" -> 5
            in "JX" -> 8
            in "QZ" -> 10
            else -> error("Unknown character")
        }
    }

    fun letterValues() = """Letter                           Value
           A, E, I, O, U, L, N, R, S, T       1
           D, G                               2
           B, C, M, P                         3
           F, H, V, W, Y                      4
           K                                  5
           J, X                               8
           Q, Z                               10"""
}