import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MyWalkerTest {
    @Test
    fun `should return string with MyWalker`() {
        val controlSpeed = 15
        val container = MyWalker()
        val actual = container.walk(controlSpeed)
        val expected = "I'm MyWalker. I walk with speed 15 km/h."
        assertEquals(expected, actual)
    }
}
