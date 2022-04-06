/* InlineIf.kt */
class InlineIf {
    fun inlineIfReturnFromElse(){
        val x = 3
        val y = 4
        println(if (x > y) "X is greater than Y" else "Y is greater than X")
    }
    fun inlineIfReturnFromIf(){
        val x = 4
        val y = 3
        println(if (x > y) "X is greater than Y" else "Y is greater than X")
    }
}