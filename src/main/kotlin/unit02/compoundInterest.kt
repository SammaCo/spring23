import kotlin.math.*
fun main(){
    print("Enter principal: ")
    var prin = readLine()!!
    print("Enter annual interest rate: ")
    var rate = readLine()!!
    print("Enter times per year interest compounds: ")
    var compound = readLine()!!
    print("Enter number of years interest earned: ")
    var years = readLine()!!

    var form = 1 + (rate.toDouble()/compound.toDouble())
    var formTwo = compound.toDouble() * years.toDouble()

    var amount = prin.toDouble() * Math.pow(form, formTwo)
    var roundAmt = String.format("%.2f", amount)

    println("After $years years, there will be $$roundAmt in the account.")
}