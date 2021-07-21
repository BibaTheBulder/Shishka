class GoodWalker() : IWalker {
    var speedWalk = 10
    override fun walk(){
        println("GoodWalker walk with speed $speedWalk km/h")
    }
}