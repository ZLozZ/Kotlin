/*
Bài 1: Định nghĩa interface mô tả các hành động sau. Tiếp đó triển khai hành động chi tiết ở lớp con:
1. Tính và trả về tổng a+b
2. Tính và trả về hiệu a+b
3. Tính và trả về tích a*b
4. Tính và trả về thương a/b
5. Tính và trả về a^b
 */


interface Cal{
    fun sum(a:Int, b:Int): Int
    fun sub(a:Int, b:Int): Int
    fun div(a:Int, b:Int): Float
    fun mul(a:Int , b:Int): Int
    fun FPower(a: Int, b: Int): Int
}

class CalAction: Cal{
    override fun sum(a: Int, b: Int): Int {
        return a+b
    }

    override fun sub(a: Int, b: Int): Int {
        return a-b
    }

    override fun div(a: Int, b: Int): Float {
        return (a/b).toFloat()
    }

    override fun mul(a: Int, b: Int): Int {
        return a*b
    }
    override fun FPower(a: Int, b: Int): Int {
        return Math.pow(a.toDouble(),b.toDouble()).toInt()
    }

}
fun main(args: Array<String>) {
    val Cal = CalAction()
    print("Nhập a và b: ")
    var a = readln().toInt()
    var b = readln().toInt()
    print("\na + b = ${Cal.sum(a,b)}")
    print("\na - b = ${Cal.sub(a,b)}")
    print("\na * b = ${Cal.mul(a,b)}")
    print("\na / b = ${Cal.div(a,b)}")
    print("\na^b = ${Cal.FPower(a,b)}")

}