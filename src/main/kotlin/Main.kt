fun main(args: Array<String>) {
    val x=5
    val y=8
    val z=50
    val m=6
    val sum=x+y
    val product=x*y
    val quotient=z/m
    val remainder=z/m

    println("x=$x")    //string templates
    println("sum is $sum\n")
    println("product is $product\n")
    println("quotient is $quotient\n")
    println("remaindeer is $remainder\n")
     val instruments = listOf("trumpets","drums","pianos","violin")   // immutable lists
    println(instruments)
    val mylist = mutableListOf("trumpets","drums","pianos","violin") //mutable lists

    println(mylist)
    val isUnit= println("this is an expression") // expression values in kotlin (sometimes the value is kotlin.Unit)
    println(isUnit)


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

    when (x){            //when expression or condition
        3->print("x==3")
        4->print("x==4")
        else ->{
            print("\nx is neither 3 or 4")
        }
    }
    for (i in 1..5){
        println(i)
    }
    //if else statement
    val guests=30
    if(guests==0){
        println("there are no guests")
    }
    else if(guests<10){
        println("there are few guests")
    }
    else{
        println("there are many guests")
    }
    

}