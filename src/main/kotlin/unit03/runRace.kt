fun main(){
    print("Enter a name: ")
    var name1 = readLine()!!
    print("Enter their time, in minutes: ")
    var runTime1 = readLine()!!.toDouble()
    print("Enter a name: ")
    var name2 = readLine()!!
    print("Enter their time, in minutes: ")
    var runTime2 = readLine()!!.toDouble()
    print("Enter a name: ")
    var name3 = readLine()!!
    print("Enter their time, in minutes: ")
    var runTime3 = readLine()!!.toDouble()

    if (runTime1 < runTime2){
        when{
            (runTime3 < runTime1) -> print("First place: $name3\nSecond place: $name1\nThird place: $name2")
            (runTime2 < runTime3) -> print("First place: $name1\nSecond place: $name2\nThird place: $name3")
            (runTime1 < runTime3 && runTime3 < runTime2) -> print("First place: $name1\nSecond place: $name3\nThird place: $name2")
            (runTime1 == runTime3) -> print("$name1 and $name3 tied for first place, and $name2 came in last.")
            (runTime2 == runTime3) -> print("$name1 won and runners $name2 and $name3 tied for last place.")
        }
    }

    if (runTime1 > runTime2){
        when{
            (runTime2 > runTime3) -> print("First place: $name3\nSecond place: $name2\nThird place: $name1")
            (runTime1 < runTime3) -> print("First place: $name2\nSecond place: $name1\nThird place: $name3")
            (runTime2 < runTime3 && runTime3 < runTime1) -> print("First place: $name2\nSecond place: $name3\nThird place: $name1")
            (runTime2 == runTime3) -> print("$name2 and $name3 tied for first place, and $name1 came in last.")
            (runTime1 == runTime3) -> print("$name2 won first place and runners $name1 and $name3 tied for last.")
        }
    }

    if (runTime1 == runTime2){
        when{
            (runTime1 > runTime3) -> print("$name3 won first place and runners $name1 and $name2 tied for last.")
            (runTime1 < runTime3) -> print("$name1 and $name2 tied for first place and $name3 came in last.")
            (runTime1 == runTime3) -> print("It was a three-way tie between $name1, $name2, and $name3.")
        }
    }

    }