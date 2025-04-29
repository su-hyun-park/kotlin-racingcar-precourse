package racingcar

class InputView {

    fun askCarNames(): List<String> {
        println("Enter the names of the cars (comma-separated):")
        val input = readln()
        val names = input.split(",").map { it.trim() }

        if (names.any { it.length > 5 }) {
            throw IllegalArgumentException("Car name must be 5 characters or less.")
        }

        return names
    }

    fun askTryCount(): Int {
        println("How many rounds will be played?")
        return readln().toInt()
    }
}