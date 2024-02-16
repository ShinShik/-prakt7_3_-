import kotlin.math.sqrt

fun main() {
    try
    {
        var a = readln().toDouble()
        var b = readln().toDouble()
        var c = readln().toDouble()
        var p = (a+b+c)/2.0
        var S = sqrt(p*(p-a)*(p-b)*(p-c))
        println("S треугольника = $S")
    }
    catch (a: Exception) {
        println("Введено неверное значение")
    }
}