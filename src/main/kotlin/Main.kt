import kotlin.math.*

fun main() {

    val appDataBase = AppDataBase()
    val repository = animalsRepository(appDataBase)


    // type = 1 : Плотоядные
    // type = 2 : Травоядные

    val wolf = animals(1, "wolf", 1 )
    repository.insert(wolf)

    val cow = animals(2, "cow", 2 )
    repository.insert(cow)

    val horse= animals(3, "horse", 2 )
    repository.insert(horse)

    val tiger = animals(4, "tiger", 1 )
    repository.insert(tiger)


// Получить Список всех животных
// print(repository.getAll())

// Получить Список травоядных
//println(repository.getGrass())

// Получить Список плотоядных
//println(repository.getMeat())


    // Изменить horse на god
    //val dog = animals(3, "dog", 1 )
    //repository.update(dog)
    //print(repository.getAll())

}

