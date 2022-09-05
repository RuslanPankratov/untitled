fun main() {
    testWhen("Rer")
    testWhen(1)
}


fun testWhen(input: Any) {// Any позволяет передавать любой тип данных
     when(input){
         1 -> println("Единица")
         2 -> println("Два")
         in 10..20 -> println("10 do 20")
         is String -> println("была введена строка длиной ${input.length}")
         else -> println("Что-то ещё")
     }

}