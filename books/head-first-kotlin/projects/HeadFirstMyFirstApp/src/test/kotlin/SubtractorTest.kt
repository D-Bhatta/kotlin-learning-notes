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