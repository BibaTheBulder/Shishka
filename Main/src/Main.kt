fun main() {
    val ob = SpeedPrinter()
    ob.showSpeed(5)
    val w1: IWalker = GoodWalker()
    val w2: IWalker = ZombieWalker()
    val w3: IWalker = SadWalker()
    w1.walk(10)
    w2.walk(15)
    w3.walk(5)
}
