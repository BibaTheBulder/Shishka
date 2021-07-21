class SadWalker : IWalker {
    var speedWalk = 5
    override fun walk(){
        println("SadWalker walk with speed $speedWalk km/h")
    }
}