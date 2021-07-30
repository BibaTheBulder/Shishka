object HumanFactory{
    fun generateNewHuman (): Human{
        val human: Human = Human()
        var randomChoice = (1..3).random()
        when (randomChoice){
            1->{human.Interface = MyWalker()
                human.weight = (60..200).random()
                human.height = (160..220).random()
                human.speed = (1..15).random()
            }
            2->{human.Interface = ZombieWalker()
                human.weight = (40..60).random()
                human.height = (150..180).random()
                human.speed = (1..10).random()
            }
            3->{human.Interface = GoodWalker()
                human.weight = (40..60).random()
                human.height = (150..180).random()
                human.speed = (1..10).random()
            }
        }
        return human
    }
}