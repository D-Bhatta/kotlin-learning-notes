# Head First Kotlin: notes for chapters 1-

Book by Dawn Griffiths and David Griffiths.

<!-- markdownlint-disable MD010 -->

## Sections

- [Head First Kotlin: notes for chapters 1-](#head-first-kotlin-notes-for-chapters-1-)
  - [Sections](#sections)
  - [Notes](#notes)
  - [Additional notes](#additional-notes)
    - [Language specific](#language-specific)

## Notes

- We create a kotlin project in intelliJidea called `HeadFirstMyApp`.
- In `Main.kt` We add the following code:

```kotlin
fun main (args: Array<String>){
    println("pow!")
}
```

- We run the file and we see the result:

```powershell
pow!

Process finished with exit code 0

```

- Here the code is being converted into `MainKt.class`. This has JVM bytecode. JVM translates it into machinecode and runs it.
- `var` is for variables whose value will change. `val` is for variables whose value will stay the same.
- Kotlin has `while`, `do-while`, and `for` loops.
- If there is just one line of code in the block, {} curly braces can be omitted.

```kotlin
fun main(args: Array<String>) {
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
```

- Output:

```powershell
pow!
x is 30
x is now 29
x is now 28
x is now 27
x is now 26
x is now 25
x is now 24
x is now 23
x is now 22
x is now 21
x is now 20
x is now 21
x is now 22
x is now 23
x is now 24
x is now 25
x is now 26
x is now 27
x is now 28
x is now 29
x is now 30
x must be 30
Cormoran Strike

Process finished with exit code 0

```


## Additional notes

### Language specific

- kotlin

```kotlin

```

- Powershell

```powershell

```
