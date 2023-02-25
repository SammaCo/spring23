fun main(){
    print("Enter an object mass: ")
    var mass = readLine()!!.toDouble()

    var weight = (mass * 9.8)
    println(weight)

    if (weight < 10)
        println("Too light")
    else if (weight > 1000)
        println("Too heavy")
    else
        println("This is an optimal weight" )
}