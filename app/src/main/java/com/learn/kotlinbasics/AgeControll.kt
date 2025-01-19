package com.learn.kotlinbasics

fun main(){
    print("enter your age as whole number: ")
    val age=readln().toInt()
    if (age>40){
        println("you cannot go into the club, please go home")
    }
    else if(age>=18) {
        println("you can enter the club")
    }
    else if(age<18){
        println("You can not enter the club")
    }else{
        println("Age is not verified, please contact support")
    }

    //usig compaining conditions
    if(age>=18 && age<=40){
        println("you can enter the club")
    }
    else{
        println("you cannot enter the club")
    }

    //range method
    if (age in 18..40){
        println("you can enter the club")
    }
    else{
        println("you cannot enter the club")
    }

}