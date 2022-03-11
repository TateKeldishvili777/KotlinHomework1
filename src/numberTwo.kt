fun main(){
    val name = "rogor aba rogor"
    var size = name.length-1
    var nameReverse = ""
    while (size>=0){
        nameReverse = nameReverse.plus(name[size])
        size--
    }
    if(name==nameReverse){
        println(true)
    }
    else{
        println(false)
    }




}