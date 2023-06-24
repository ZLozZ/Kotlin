import java.lang.Math
fun main(args: Array<String>) {
    var hexa: CharArray = charArrayOf('0', '1', '2', '3', '4', '5', '6','7','8', '9', 'A', 'B', 'C', 'D', 'E', 'F')
    var bin: Int
    var hex: String
    print("Mời nhập: ")
    var value: Int = readln().toInt()
    bin = int_to_bin(value)
    println("$bin\n")
    hex = int_to_hexa(hexa, value)
    println("$hex")
}

fun int_to_hexa(hexa_arr: CharArray, value: Int): String{
    var vl: Int = value
    var hex: Int
    var result_hexa: String = ""
    while(true)
    {
        hex = vl%16
        vl /=16
        result_hexa = hexa_arr[hex] + result_hexa
        if(vl<16)
            if(value>=16)
                result_hexa = hexa_arr[vl] + result_hexa
            break
    }
    return result_hexa
}

fun int_to_bin(value: Int): Int{
    var vl_in: Int = value
    var bin: Int
    var result_bin: Int = 0
    var cnt: Int = 0
    while(true)
    {

        if(vl_in == 1 || vl_in == 0) {
            result_bin += (vl_in * (Math.pow(10.toDouble(), cnt.toDouble())).toInt())
            break
        }
        bin = vl_in%2
        result_bin += (bin*(Math.pow(10.toDouble(), cnt.toDouble())).toInt())
        vl_in = vl_in/2
        cnt+=1
    }
    return result_bin
}
