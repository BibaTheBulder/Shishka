fun main(){
    val humanList: MutableList<Human> = mutableListOf()
    for (i in (1..10))
        humanList.add(HumanFactory.generateNewHuman())

    for (n in humanList){
        println(n.Interface?.walk(n.speed))
        println("My weight is ${n.weight}kg and my height is ${n.height}cm.")
    }
}


