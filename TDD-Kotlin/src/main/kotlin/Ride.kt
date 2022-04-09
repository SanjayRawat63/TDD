data class Ride(val time: Double, val distance: Double) {

    val FARE_PER_KM = 10
    val FARE_PER_MINUTE = 1

    fun Fare(): Double {
        return time * FARE_PER_MINUTE + distance * FARE_PER_KM
    }


}
