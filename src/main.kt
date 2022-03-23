fun main(){
    var person=Human("Lavyne Beau",25,64)
    println( person.name)
    println( person.age)
    println( person.weight)
    person.eat(20)
    println(person.weight)
    person.speak("Food is my console and I don't think I will stop eating.")
    person.birthday()
    var newPerson=User("Batilon","Esmiyu","+254700245632","lasOEN098!","lonesmiyu@gmail.com")
    println(newPerson.firstName)
    println(newPerson.phoneNumber)
}
class Human(var name:String,var age:Int,var weight:Int){
   fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak(speech:String){
    println(speech)
}
    fun birthday(){
       age++
        println(age)
    }
}
data class User(var firstName:String,var lastName:String,var phoneNumber:String,var password:String,var email:String){

}