package org.example.racingcar

class InputView {

    fun askCarNames(): List<String> {
        println("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,) 기준으로 구분)")
        val input = readln()
        return input.split(",").map { it.trim() }
    }

    fun askTryCount(): Int {
        println("시도할 회수는 몇 회인가요?")
        return readln().toInt()
    }
}