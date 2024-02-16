fun main() {
    try
    {
        val x = readln().toDouble()
        var y = 0.0.toDouble()
        when(x){
            in -1.0..0.0-> y = x*-1
            in (0.0..0.9)-> y = 1-x
            in (1.0..3.0)-> y = (x-1)/2
            else-> println("Вы вышли за рамки определения функции")
        }
        println("y = $y")
    }
    catch (a: Exception) {
        println("ERROR")
    }
}