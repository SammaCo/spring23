fun main(){
    print("Is anyone in your party vegetarian? Y/N: ")
    val veggie = readln()

    print("Is anyone in your party vegan? Y/N: ")
    val vegan = readln()

    print("Is anyone in your party gluten-free? Y/N: ")
    val celiac = readln()

    println("Your restaurant options are:")
    when {
        (veggie == "Y" && vegan == "Y" && celiac == "Y") -> print("Corner Cafe\nThe Chef's Kitchen")
        (veggie == "Y" && vegan == "Y" && celiac == "N") -> print("Corner Cafe\nThe Chef's Kitchen")
        (veggie == "Y" && vegan == "N" && celiac == "Y") -> print("Main Street Pizza Company\nCorner Cafe\nThe Chef's Kitchen")
        (veggie == "Y" && vegan == "N" && celiac == "N") -> print("Main Street Pizza Company\nCorner Cafe\nMama's Fine Italian\nThe Chef's Kitchen")
        (veggie == "N" && vegan == "Y" && celiac == "Y") -> print("Corner Cafe\nThe Chef's Kitchen")
        (veggie == "N" && vegan == "Y" && celiac == "N") -> print("Corner Cafe\nThe Chef's Kitchen")
        (veggie == "N" && vegan == "N" && celiac == "Y") -> print("Main Street Pizza Company\nCorner Cafe\nThe Chef's Kitchen")
        (veggie == "N" && vegan == "N" && celiac == "N") -> print("Joe's Gourmet Burgers\nMain Street Pizza Company\nCorner Cafe\nMama's Fine Italian\nThe Chef's Kitchen")

    }
}