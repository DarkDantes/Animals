class animalsRepository(val appDataBase: AppDataBase) {




    fun insert(animals : animals){
        appDataBase.list.add(animals)
    }


    fun  getAll():MutableList<animals>{

        return appDataBase.list
    }


    //список травоядных, 2 тип
    fun  getGrass(): MutableList<animals> {
        val grass = mutableListOf<animals>()
        appDataBase.list.forEach {
            if(it.type == 2) {
                grass.add(it)
            }
        }
        return grass
    }


    //список плотоядных, 1 тип
    fun  getMeat(): MutableList<animals> {
        val meat = mutableListOf<animals>()
        appDataBase.list.forEach {
            if(it.type == 1) {
                meat.add(it)
            }
        }
        return meat
    }



    fun delete(animals: animals){
        appDataBase.list.remove(animals)
    }




    fun findById(id: Int): animals? {
        return appDataBase.list.find { it.id == id }
    }









    fun  update(animals: animals)
    {

        val animalsF = findById(animals.id)
        if(animalsF != null) {
            val index = appDataBase.list.indexOf(animalsF)
            appDataBase.list[index] = animals
        }
    }
}