package racingcar

class InputView {

    fun askCarNames(): List<String> {
        println("Enter the names of the cars (comma-separated):")
        val input = readln()
        return input.split(",").map { it.trim() }
    }

    fun askTryCount(): Int {
        println("How many rounds will be played?")
        return readln().toInt()
    }
}