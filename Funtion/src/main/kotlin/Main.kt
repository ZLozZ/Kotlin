
//Đề
/*
cho 2 số thực a và b. Viết định nghĩa hàm để thực hiện các chức năng sau. Hiển thị kết qua lên màn hình:
a) Tính và trả về tổng a + b
b) Tình v trả về hiệu a-b
c) Tính và trả về tích a*b
d) Tính và trả về thương a/b
e) Tính và trả về a**b
 */

fun main(args: Array<String>) {
    print("Nhập 2 số: ");
    var a = readln().toFloat();
    var b = readln().toFloat();
    //a
    val sum: (Float, Float) -> Float = {s, x->s+x}
    print("Tổng 2 số là: ${sum(a,b)}")

    //b
    val sub = {x: Float, y: Float -> x-y}
    print("\nhiệu 2 số là: ${sub.invoke(a,b)}")

    //c
    val mul = Cal(a,b){a,b->a*b}
    print("\nTích 2 số là: $mul")

    //d
    val div = {x:Float, y:Float -> x/y}
    print("\nThương 2 số là: ${Cal(a, b, div)}")

    //e
    val exp = {x:Float, y:Float -> Math.pow(x.toDouble(), y.toDouble()).toFloat()}
    print("\nThương 2 số là: ${Cal(a, b, exp)}")
}

fun Cal(x:Float, y:Float, div: (Float,Float) -> Float): Float{
    val result = div(x,y)
    return result
}