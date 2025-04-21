package racingcar

class ResultView {
    fun printStartMessage() {
        println("\n실행 결과")
    }

    fun printRoundResult(cars: List<Car>) {
        cars.forEach { car ->
            println("${car.name} : ${"-".repeat(car.position)}")
        }
        println()
    }

    fun printWinners(winners: List<Car>) {
        val winnerNames = winners.joinToString(", ") { it.name }
        println("최종 우승자 : $winnerNames")
    }
}

