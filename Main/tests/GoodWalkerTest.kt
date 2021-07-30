import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GoodWalkerTest {
    @Test
    fun `should return string with GoodWalker`(){
        val controlSpeed = 5
        val container = GoodWalker()
        val actual = container.walk(controlSpeed)
        val expected = "I'm GoodWalker. I walk with speed 5 km/h."
        assertEquals(expected,actual)
    }
}