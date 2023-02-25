fun main(){
    print("Enter a month in numeric form: ")
    var mon = readLine()!!.toInt()
    print("Enter a day in numeric form: ")
    var day = readLine()!!.toInt()
    print("Enter a 2 digit year: ")
    var yr = readLine()!!.toInt()

    if (mon * day == yr)
        println("The date is magic!")
    else
        println("The date is not magic...")
}