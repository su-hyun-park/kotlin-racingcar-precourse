package org.example.racingcar

fun main() {
    val inputView = InputView()
    val carNames = inputView.askCarNames()
    val tryCount = inputView.askTryCount()

    val cars = carNames.map { Car(it) }
    val resultView = ResultView()
    val game = RacingGame(cars, tryCount, resultView)

    resultView.printStartMessage()
    game.play()
    val winners = game.findWinners()
    resultView.printWinners(winners)
}