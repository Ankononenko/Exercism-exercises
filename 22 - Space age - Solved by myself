class SpaceAge (val seconds: Int) {

    val secondsInAYear: Double = (365.25 * 24 * 60 * 60)
    val mapOfOrbitalPeriodPerPlanet = mapOf<String, Double>("Mercury" to 0.2408467, "Venus" to 0.61519726, "Mars" to 1.8808158,
    "Jupiter" to 11.862615, "Saturn" to 29.447498, "Uranus" to 84.016846, "Neptune" to 164.79132)

    fun onEarth(): Double = ("%.2f".format(seconds / secondsInAYear)).toDouble()

    fun getRoundedDouble(number: Double?): Double = "%.2f".format(number).toDouble()

    fun onMercury(): Double = getRoundedDouble((onEarth() * mapOfOrbitalPeriodPerPlanet.get("Mercury")!!))
    fun onVenus(): Double = getRoundedDouble((onEarth() * mapOfOrbitalPeriodPerPlanet.get("Venus")!!))
    fun onMars(): Double = getRoundedDouble((onEarth() * mapOfOrbitalPeriodPerPlanet.get("Mars")!!))
    fun onJupiter(): Double = getRoundedDouble((onEarth() * mapOfOrbitalPeriodPerPlanet.get("Jupiter")!!))
    fun onSaturn(): Double = getRoundedDouble((onEarth() * mapOfOrbitalPeriodPerPlanet.get("Saturn")!!))
    fun onUranus(): Double = getRoundedDouble((onEarth() * mapOfOrbitalPeriodPerPlanet.get("Uranus")!!))
    fun onNeptune(): Double = getRoundedDouble((onEarth() * mapOfOrbitalPeriodPerPlanet.get("Neptune")!!))

    }
fun main () {
    val callSpaceAge = SpaceAge(31557600)
    println(callSpaceAge.onEarth())
    println(callSpaceAge.onMercury())
    println(callSpaceAge.onVenus())
    println(callSpaceAge.onMars())
    println(callSpaceAge.onJupiter())
    println(callSpaceAge.onSaturn())
    println(callSpaceAge.onUranus())
    println(callSpaceAge.onNeptune())
}
