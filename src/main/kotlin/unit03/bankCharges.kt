fun main(){
    print("How many checks were written this month? ")
    val checks = readln().toDouble()

    print("Your service fees for this month are:\n$")

    if (checks < 20)
        print(10.00 + (checks * .10))
    else if (checks >= 60)
        print(10.00 + (checks * .04))
    else if (checks >= 40)
        print(10.00 + (checks * .06))
    else if (checks >= 20)
        print(10.00 + (checks * .08))
}