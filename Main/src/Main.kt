fun main() {
    val w1: IWalker = GoodWalker()
    val w2: IWalker = ZombieWalker()
    val w3: IWalker = SadWalker()
    val w4: IWalker = MyWalker()
    w1.walk(10)
    w2.walk(15)
    w3.walk(5)
    w4.walk(35)
}
