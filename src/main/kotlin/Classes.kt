fun main() {
    val child = Person("Child", "Child", 1)
    val p1 = Person("Ruslan", "Pankratov", 25, child)
    println(p1.firstName)

    val  rectangle = Rectangle(5.0,2.0)
    println("perimeter ${rectangle.perimeter}")
    val rectangle2 = Rectangle(5.0,2.0)

    println(rectangle == rectangle2)

}

//участок кода где аргументы, это называется первичный конструктор
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() // это по типу аррей листа MutableList


    init { //этот блок выполняется после конструктора
        println("Person is created $firstName")
    }

    constructor(
        firstName: String,
        lastName: String,
        age: Int,
        child: Person
    ) : //это вторичный конструктор, который имеет ключевое название конструктор, это по типу перегрузки
// конструктора в джаве
            this(firstName, lastName, age) {
        // у вторичного обязательно должны быть поля первого конструктора и они должны передаваться сюда
        children.add(child)

    }

    constructor() : this("", "", -1) // назначаем по умолчанию значения,
// через зис мы вызываем нащ первичный констурктор, конструктор без аргументов
}


data class Rectangle(var height: Double, var length: Double) { //создали первичный конструктор //data создаст все эквилсы,
    // хеш коды и т.д., это как ломбок, возможно гетеры он тоже создаёт
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1 // field это тоже самое что и  в джава this, тут мы создаём гетеры и сетеры, в аргументах
        // конструктора, сразу есть гетеры и сетеры
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * length
}