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

## Adding test libraries

- We can add test libraries to a gradle project by adding the following to the `build.kts` file:

```kotlin
dependencies {
    testImplementation(kotlin("test"))
    testImplementation("com.google.truth:truth:1.1.3")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.6.0")
    testImplementation("org.junit.platform:junit-platform-commons:1.6.0")
    testImplementation("org.junit.platform:junit-platform-engine:1.6.0")
}
```

- This adds the truth and JUnit 5 libraries to the project.

## Write tests

- Create a file `Totaller.kt`.

```kotlin
/* Totaller.kt */
class Totaller(var total: Int = 0) {
    fun add(num: Int): Int {
        total += num
        return total
    }
}
```

- Right click on `Totaller` class name and click `Generate...` and then click `Test...`.
- Create setup and teardown functions if needed and generate the file.
- Write a few tests.

```kotlin
/* TotallerTest.kt */
import org.junit.jupiter.api.Test
import com.google.common.truth.Truth.assertThat

internal class TotallerTest {
    @Test
    fun `add 5 and verify result is 5`() {
        val totaller = Totaller()
        assertThat(totaller.add(5)).isEqualTo(5)
    }
    @Test
    fun `add 5 and 9 and verify result is 14`() {
        val totaller = Totaller()
        assertThat(totaller.add(5)).isEqualTo(5)
        assertThat(totaller.add(9)).isEqualTo(14)
    }
}
```

- Run the tests.
- Create a file `Subractor.kt` and generate it's test file `SubtractorTest.kt`.

```kotlin
/* Subtractor.kt */
class Subtractor(val maximum: Int = 100) {
    fun subfrom100(num: Int): Int {
        return maximum - num
    }
}
```

- Write a few tests and run the tests.

```kotlin
/* SubtractorTest.kt */
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

internal class SubtractorTest {
    @Test
    fun `subtract 10 from 100 and return 90`() {
        val subtractor: Subtractor = Subtractor()
        assertThat(subtractor.subfrom100(10)).isEqualTo(90)
    }
}
```



## Additional notes

### Resources

- https://truth.dev/
- https://docs.gradle.org/current/userguide/kotlin_dsl.html
- https://stackoverflow.com/questions/50128728/how-do-i-use-the-native-junit-5-support-in-gradle-with-the-kotlin-dsl
- https://technology.lastminute.com/junit5-kotlin-and-gradle-dsl/

### Language specific

- kotlin

```kotlin

```

- Powershell

```powershell

```
