fun main() {
    val arr = arrayOf(7, 2, 3, 4, 5, 6, 7, 8, 10, 32, 45)
    var sum = 0F
    var i = 0
    var cuant = 0F
    var size = arr.size
    while (i < size) {
        if (i%2==0){
            sum += arr[i]
            cuant+=1
        }
        i++
    }
    val answer = sum/cuant

    println(answer)

}