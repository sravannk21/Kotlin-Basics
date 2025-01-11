package com.learn.kotlinbasics

fun main() {
    val myTrue=true;
    val myFalse=false;
    println(myTrue || myFalse);//this will be true because one of the condition is true
    println(myTrue && myFalse); //this will be false because both the condition is false
    println(!myTrue); // this will be false because the condition is true
}