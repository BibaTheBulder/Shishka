class ZombieWalker : IWalker {
    var speedWalk = 15
    override fun walk(){
        println("ZombieWalker walk with speed $speedWalk km/h")
    }
}