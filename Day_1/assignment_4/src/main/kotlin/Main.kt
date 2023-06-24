fun main(args: Array<String>) {
    var s: String = readln().toString()
    var string: List<String> = s.split(" ")
    s = ""
    var count: Int = 0
    for(i in string){
        s += i.capitalize() + " "
        count++
    }
    println("Count the number of words in the string is: $count")
    println("Capitalize: $s")
}