package racingcar

class RacingGame(
    private val cars: List<Car>,
    private val tryCount: Int,
    private val resultView: ResultView
) {
    fun play() {
        repeat(tryCount) {
            cars.forEach { it.move() }
            resultView.printRoundResult(cars)
        }
    }

    fun findWinners(): List<Car> {
        val maxPosition = cars.maxOf { it.position }
        return cars.filter { it.position == maxPosition }
    }
}