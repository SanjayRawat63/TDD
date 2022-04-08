class StatementGenerator {
    val FARE_PER_KM = 10
    val FARE_PER_MINUTE = 1
    fun totalFare(time: Double, distance: Double): Double {
        return time * FARE_PER_MINUTE + distance * FARE_PER_KM
    }

    fun totalFare(rides: List<Ride>): Double {
        var totalfare: Double = 0.0
        for (ride in rides)
            totalfare += totalFare(ride.time,ride.distance)
        return totalfare
    }
}