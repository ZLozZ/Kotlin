
//Đề
/*
cho 2 số nguyên a và b. Viết định nghĩa hàm để thực hiện các chức năng sau. Hiển thị kết qua lên màn hình:
a)Tìm ước chung lớn nhất của a và b
b)Tìm bội chung nhỏ nhất của a và b
 */

fun main(args: Array<String>) {
    print("Nhập 2 số: ");
    var a = readln().toInt();
    var b = readln().toInt();
    //a
    print("\nUCLN là: ${UCLN(a,b)}")

    //b
    print("\nBCNN là: ${BCNN(a,b)}")
}

tailrec fun UCLN(a:Int, b:Int): Int =
    if(a==b)
        a
    else if(a < b) b.minus(a).toInt() else a.minus(b).toInt()

fun BCNN(a:Int, b:Int): Int{
    return (a*b)/UCLN(a,b)
}



