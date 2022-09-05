fun main() { //функции это как методы
    println(testSimple())
    println(testNumber())
    println(testNumber3(10, 5))
    println(testString(23))
    val arr: List<Int>  = testList(1,2,3)
    for (number in arr){
        println(number)
    }
    testList(y = 10, z = 20, x = 5)// так же мы можем давать значение прямо в аргументы

    testDefaultArguments()// по дефолту выведет
    testDefaultArguments(10,10) //выведит новые значения
    testDefaultArguments(y = 10) //можно даже так, y будет новый а х по дефолту 20
    //по сути тут была перегрузка метода
}

fun testSimple(): Int { //мы пишем здесь : Int что будет возвращать нам метод
    return 5 + 5
}

fun testNumber(): Int = 5 + 5// если мы пишем в одну строку,
// то не обязательно писать скобки, это тоже самое, что и наверху

fun testNumber3(x: Int, y: Int): Int = x * y //как и в джаве передаём аргументы, тип всегда назначается через
// переменая : тип


fun testNumber4(x: Int, y: Int) = x * y // так как котлин знает, что это целочисленное число, мы можем не указывать
// тип : Int , но при более сложных функция лучше писать тип возвращаемый, но лучше всегда указывать тип, это лишь
// как знание

fun testString(number: Int): String {
    return "This test $number"
}

fun testList(x: Int, y: Int, z: Int) : List<Int>{
    return listOf(x,y,z)
}


fun testDefaultArguments(x: Int = 20, y: Int = 10){ //так как мы ничего тут не возвращаем, эта функция будет как воид
  //  return x * y так здесь не сделаешь , так же мы можем делать значение по дефолту x: Int = 20, это будет срабатывать
    //если мы не передали никаких аргументов, но если мы передаём аргументы, будут новые аргументы работать
    println(x * y)
}