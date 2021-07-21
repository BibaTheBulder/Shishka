class GoodWalker() : SpeedPrinter(),IWalker {
    override fun walk(speedWalk: Int){
        println("GoodWalker walk with speed $speedWalk km/h")
    }
}