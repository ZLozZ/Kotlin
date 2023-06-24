fun main(args: Array<String>) {
   var leap_year: IntArray = intArrayOf(29, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
   var month: Int
   var year: Int
   println("input month and year mm/yyyy:" )
   var s: String = readln()
   var input: List<String> = s.split("/")
   month = input[0].toInt()
   year = input[1].toInt()
   if(check_lyear(year))
   {
      if(month == 2)
      {
         println("number of days that month in leap year: ${leap_year[0]}")
      }
      else
      {
         println("number of days that month in leap year: ${leap_year[month]}")
      }
   }
   else
   {
      println("number of days that month in non leap year : ${leap_year[month]}")
   }
}

fun check_lyear(year: Int): Boolean
{
   if(year % 400 == 0)
      return true
   if(year % 4 == 0 && year % 100 != 0)
      return true
   return false
}
