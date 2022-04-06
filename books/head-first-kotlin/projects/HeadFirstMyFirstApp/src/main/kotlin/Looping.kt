/* Looping.kt */
class Looping {
    fun loop() {
        var x = 0
        println("Before the loop: x = $x")
        while (x < 5) {
            x++
            println("In the loop: x = $x")
        }
        println("After loop execution: x = $x")
    }
}