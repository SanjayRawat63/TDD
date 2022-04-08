class Ride {
    var time: Double
    var distance: Double
    val FARE_PER_KM = 10
    val FARE_PER_MINUTE = 1
    constructor(givenTime: Double, givenDistance: Double) {
        time = givenTime
        distance = givenDistance
    }
    fun Fare():Double{
            return time * FARE_PER_MINUTE + distance * FARE_PER_KM
        }


}
