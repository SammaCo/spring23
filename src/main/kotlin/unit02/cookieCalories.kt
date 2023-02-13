fun main() {
    print("Number of cookies eaten: ")
    var cookies = readLine()!!
    var intake = cookies.toInt() * 75
    println("Calorie intake was: $intake calories")
}