
fun main() {
    println(isEven(28))
      println(isEven(33))
        var market=Products("tomatoes",25.0,100.00,"groceries")
            var shop=Products("sanitaizer",3.00,210.00,"hygiene")
              market.sortProduct()
                 shop.sortProduct()
     println(checkWord("banana"))
    println(person(arrayOf("Jane","Sarah","Juliet","Victorine","Catherine")))

    
}
fun isEven(num:Int):Boolean{
    if(num%2==0){
        return true
      }
        else {
           (num%2!=0)
              return false

    }
}
data class Products (var name:String,var Weight:Double,var Price:Double,var Category:String){
    fun sortProduct() {
        var groceries = mutableListOf<String>()
            var hygiene = mutableListOf<String>()

                when (Category) {
                    "groceries" -> println(mutableListOf("$name","$Category"))
                       "hygiene" ->println(mutableListOf("$name","$Category"))
                           else ->println("Any other Category")
            }
        }
    }
fun checkWord(word:String):String{
    var name= ""
    for ( letter in word){
        if (word.indexOf(letter)%2==0){
            name += letter

        }

    }
    return name

}
fun person(names:Array<String>):MutableList<String>{
    var longNameList= mutableListOf<String>()
    for(name in names){
        if(name.length%2==0){
            longNameList.add(name)
        }
    }
    return longNameList

}
