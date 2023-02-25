fun main(){
    print("Enter a name: ")
    var name1 = readLine()!!
    print("Enter a name: ")
    var name2 = readLine()!!
    print("Enter a name: ")
    var name3 = readLine()!!

    val list = mutableListOf(name1, name2, name3)

    list.sort()
    println(list)
}