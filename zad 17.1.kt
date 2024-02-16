import kotlin.math.sqrt
fun main() {
    try
    {
        var V = readln().toDouble()
        var U = readln().toDouble()
        var t1 = readln().toDouble()
        var t2 = readln().toDouble()
        var S = (t1*V)+(t2*(V-U))
        when{
            V<U->println("Скорость лодки не может быть меньше скорости реки")
            else->  println("Лодка прошла $S км")
        }
    }
    catch (a: Exception) {
        println("Введено неверное значение")
    }
}