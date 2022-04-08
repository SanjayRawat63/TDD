class StatementGenerator {

    fun totalFare(rides: List<Ride>): Double {
        var totalfare: Double = 0.0
        for (ride in rides)
            totalfare += ride.Fare()
        return totalfare
    }
}