class GoodWalker : IWalker {
    override fun walk(speed: Int): String {
        return "I'm GoodWalker. I walk with speed $speed km/h."
    }
}