import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond (gigaSecond: LocalDateTime) {

// This is used to get the current date and time
//    val date: LocalDateTime = LocalDateTime.now()
    val date: LocalDateTime = gigaSecond.plusSeconds(1_000_000_000)
    constructor(gigaSecond: LocalDate) : this (gigaSecond.atStartOfDay())

    /**
     * localDate.atStartOfDay() - this is a method of LocalDate class in Java.
     * It combines this date with the time of midnight to create a class LocalDateTime at the start of this date.
     * It was useful for me when a class could take two types of values - LocalTime and LocalDateTime.
     *
     * constructor(hereGoesNameOfTheVariableThatIsPassedToTheClass: LocalDate) : this (LocalDate.atStartOfDay()) -
     * here we use the constructor to convert the type of value passed to the class from LocalDate to LocalDateTime.
     */
}

fun main(){
    val instanceOfTheClassGigasecond = Gigasecond(LocalDateTime.of(1991, 5, 10, 12, 0, 1))
// This is used to print the current date and time
//    println(instanceOfTheClassGigasecond.date)
    println(instanceOfTheClassGigasecond.date)
}
