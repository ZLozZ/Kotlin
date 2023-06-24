fun main(args: Array<String>) {

    var n: Int = readln().toInt()
    var arr: IntArray = IntArray(n)
    for(i in 0..(n-1))
    {
        arr[i] = readln().toInt()
    }

    var temp: Int
    for(i in 0..(n-2))
    {
        for(j in (i+1)..(n-1))
        {
            if(arr[i] > arr[j])
            {
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }
    for(i in 0..(n-1))
    {
        println(" "+arr[i])
    }
}