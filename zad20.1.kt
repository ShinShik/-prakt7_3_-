import kotlin.math.sqrt

fun main() {
    try
    {
        val x = readln().toDouble()
        var y = 0.0.toDouble()
        when(x){
            in -1.0..0.0-> y = x*x
            in (0.0..1.0)-> y = sqrt(x)
            in (1.0..2.0)-> y = x-1
            else-> println("Вы вышли за рамки определения функции")
        }
        println("y = $y")
    }
    catch (a: Exception) {
        println("ERROR")
    }
}