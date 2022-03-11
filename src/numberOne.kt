fun main() {
    val cars = arrayOf(7, 2, 3, 4)
    var sum = 0
    var i = 0
    var cuant = 0
    var size = cars.size
    while (i < size) {
        if (i%2==0){
            sum += cars[i]
            cuant+=1
        }
        i++
    }
    var answer = sum/cuant

    println(answer)

}