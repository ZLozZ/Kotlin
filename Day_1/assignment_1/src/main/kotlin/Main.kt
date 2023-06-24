fun main(args: Array<String>) {
    var bf_value:Int = 0
    var cr_value: Int = 0
    for(i in 10..200)
    {
        if((i%7)==0 && (i%5)!=0)
        {
            cr_value = i
            if(bf_value != 0)
                print(",")
        }
        if(cr_value!=bf_value)
        {
            bf_value = cr_value
            print(bf_value)
        }
    }
    println(".")
}