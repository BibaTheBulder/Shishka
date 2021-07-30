class ZombieWalker : IWalker {
    override fun walk(speed: Int): String {
        return "I'm ZombieWalker. I walk with speed $speed km/h."
    }
}