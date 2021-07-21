fun main() {
    val ob = SpeedPrinter()
    ob.showSpeed(5)
    val w1: IWalker = GoodWalker()
    val w2: IWalker = ZombieWalker()
    val w3: IWalker = SadWalker()
    w1.walk()
    w2.walk()
    w3.walk()
}
