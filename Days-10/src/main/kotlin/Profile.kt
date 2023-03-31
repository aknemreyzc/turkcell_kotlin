class Profile<T>
{
    private val arr = mutableListOf<T>()
    constructor()
    {}

    constructor(data: T)
    {}

    fun add(item : T)
    {
        arr.add(item)
    }

    fun allList() : List<T>
    {
        return arr
    }


    fun  call (data : T) : Any
    {
        val item  = when(data)
        {
            is String -> return data.toString()
            is Int ->  return data.toInt()
            else -> return Unit
        }

    }

}