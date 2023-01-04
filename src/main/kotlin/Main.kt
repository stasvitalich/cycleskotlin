fun main() {

    var fruit = arrayListOf("Apple", "Banana", "Lemon") //Создали массив

    for(i in fruit){ // При помощи цикла перебираем все элементы массива
        println(i) // Выводим каждый элемент массива на печать в консоль.
    }
    println("finish") // Обычный разделитель.
    println(fruit.indices) // Команда, показывающая диапазон массива.
    println("") // Разделитель

    for ((index, item) in fruit.withIndex()){ // Index здесь - это индекс каждого элемента в массиве.
                                                         // Item - имя элемента в массиве.
                                                         // Команда withIndex() позволяет выводить каждый элемент с его индексом.
        print("$index ")
        print("$item\n")
    }
    println("")

    for (n in 10 downTo 0 step 2){ // Перебираем элементы массива в обратном порядке с шагом 2.
        println(n)
    }

    println("")

    for (index in 1..fruit.size - 1){ // Перебираем массив с первого элемента. Не с нулевого.
        println(index)
    }

    println("")

    for (index in 1 until fruit.size){ // Перебираем массив с первого элемента. Не с нулевого. Вариант 2.
        println(index)
    }

    println("")

    for (index in 0..20){ // Цикл для перебора от 0 до 20.
        println(index)
        if (index == 8){ // Как только доходим до 8 элемента, прерываем цикл.
            break
        }
    }

    println("")

    for ((index, item) in fruit.withIndex()){ // Цикл для перебора от 0 до 20.
        println(item)
        if (fruit[index] == "Banana"){ // Как только доходим до элемента со значением Banana,
                                       // прерываем цикл.
            break
        }
    }

    println("")

    var animals = arrayListOf("Cat", "Dog", "Fish", "Horse", "Turtle", "Fox") // Создаём список с животными.
    animals.forEach{ // Используем специальный цикл для списка.
        println(it) // Выводим на печать каждую переменную из списка.
    }

    println("")

    var anotherExample = 0 // Создаём переменную для нуля.
    while (anotherExample < 10){ // Запускаем цикл while.
                                 // Пока переменная меньше 10 мы будем выводить её в консоль и прибавлять единицу.
        println(anotherExample)
        anotherExample ++
    }





}