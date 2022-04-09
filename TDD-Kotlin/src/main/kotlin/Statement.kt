data class Statement(val rides:List<Ride>) {

    fun totalFare(): Double {
        return rides.map(Ride::Fare).sum()
    }

    fun getNoOfRides(): Int {
        return rides.size
    }

    fun getAvgFarePerRide():Double{
        return totalFare()/getNoOfRides()
    }

}