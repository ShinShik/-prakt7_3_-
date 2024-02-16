import kotlin.math.sqrt
fun main() {
    try
    {
        val NUM = readln().toInt()
        var n1 = (NUM/100)
        var n2 = NUM%100/10
        var n3 = NUM%10
        var n = n2/n1
        when{
            n1%n==0 && n2%n==0 && n3%n==0-> println("Является геометрической прогрессией")
            else->println("Не вляется геометрической прогрессией")        }
    }
    catch (a: Exception) {
        println("ERROR")
    }
}