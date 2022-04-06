fun main() {
    YabbaDabbaDo().printYabbaDabbaDo()
}

fun start() {
    println("pow!")

    var x = 3
    val name = "Cormoran"
    x = x * 10
    println("x is $x")
    // this is a comment
    while (x > 20) {
        x = x - 1
        println("x is now $x")
    }
    for (i in 1..10) {
        x = x + 1
        println("x is now $x")
    }

    if (x == 20) {
        println("x must be 20")
    } else if (x == 30) {
        println("x must be 30")
    } else {
        println("x isn't 20 or 30")
    }

    if (name.equals("Cormoran")) {
        println("$name Strike")
    }
}