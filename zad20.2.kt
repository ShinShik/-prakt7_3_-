import kotlin.math.round
import kotlin.math.sqrt

fun main() {
    try
    {
        val x = readln().toDouble()
        var y = 0.0.toDouble()
        when(x){
            in -1.0..0.0-> y = x*-1
            in (0.0..2.9)-> y = 1.0
            in (3.0..4.0)-> y = round((4.0-x)*100)/100
            else-> println("Вы вышли за рамки определения функции")
        }
        println("y = $y")
    }
    catch (a: Exception) {
        println("ERROR")
    }
}