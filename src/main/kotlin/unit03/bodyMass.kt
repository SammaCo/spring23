import kotlin.math.*
fun main() {
    print("Enter your weight in lbs: ")
    var weight = readLine()!!
    print("Enter your height in inches: ")
    var height = readLine()!!

    var bodyMass = (weight.toDouble() * 703) / (Math.pow(height.toDouble(), 2.toDouble()))

    if (bodyMass < 18.5)
        println("Underweight")
    else if (bodyMass > 25)
        println("Overweight")
    else
        println("Optimal weight")
    }