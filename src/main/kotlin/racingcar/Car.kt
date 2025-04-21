package racingcar

import camp.nextstep.edu.missionutils.Randoms

class Car(
    val name: String,
    var position: Int = 0
) {
    fun move() {
        val randomValue = Randoms.pickNumberInRange(0, 9)
        if (randomValue >= 4) {
            position++
        }
    }
}
