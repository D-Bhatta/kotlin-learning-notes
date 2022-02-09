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