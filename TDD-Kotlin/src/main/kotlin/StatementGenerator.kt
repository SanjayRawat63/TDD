class StatementGenerator {
    var rides:List<Ride>
    constructor(Rides: List<Ride>)
    {
        rides=Rides
    }
    fun totalFare(): Double {
        var totalfare: Double = 0.0
        for (ride in rides)
            totalfare += ride.Fare()
        return totalfare
    }
    fun getNoOfRides():Int{
        return rides.size
    }
    fun getAvgFarePerRide():Double{
        return totalFare()/getNoOfRides()
    }
}