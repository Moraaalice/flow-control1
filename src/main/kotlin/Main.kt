fun main() {
    numbers(100)
    //
    ageRobot(2)
    ageRobot(8)
    ageRobot(15)
    //
    name(arrayOf("alice","AliciaMoraa","MoraaOngongo","Trina"))
    //
    numbs()

}
fun numbers(numbers:Int){
    for (numb in 1..100)
        if (numb %2 != 0){
            println(numb)
        }
}
fun ageRobot(age:Int){
    if (age in 0..5){
        println("fanta")
    }
    else if (age in 7..14){
        println("fanta")
    }
    else
        println("cocacola")

}
fun name(name:Array<String>):String{
    var adding = 0
    for (na in name) {
        if (na.length > 5) {
            adding++
        }
        return na
        }

}


fun numbs(){
    for (n in 1..100){
        if (n %3 ==0 && n %5 == 0){
            println("FizzBuzz")
        }
        else if (n %3 == 0){
            println("Fizz")
        }
        else if (n %5 == 0){
            println("Buzz")
        }
    }
}


