import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ZombieWalkerTest {
    @Test
    fun `should return string with ZombieWalker`(){
        val controlSpeed = 10
        val container = ZombieWalker()
        val actual = container.walk(controlSpeed)
        val expected = "I'm ZombieWalker. I walk with speed 10 km/h."
        assertEquals(expected,actual)
    }
}