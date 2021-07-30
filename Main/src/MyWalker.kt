class MyWalker : IWalker {
    override fun walk(speed: Int): String {
        return "I'm MyWalker. I walk with speed $speed km/h."
    }
}