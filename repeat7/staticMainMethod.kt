package com.calisma.repeat7

val isimsizKahramanIsim = "sel"
fun isimsizKahramanIsimYazdir()
{
    println(isimsizKahramanIsim)
}

fun main()
{
    println(StatickDeneme.tema)//Göründüğü gibi sadece isim uzerinden erisebiliyorum.
    StatickDeneme.temaYazdir()

    println("-------------")

    println(isimsizKahramanIsim) //burada da gorundugu gibi top-level tanimlanan degisken ve metodlara erismek icin nesne oluturmaya gerek duymuyoruz.
    isimsizKahramanIsimYazdir()

    println("---------------")

    println(CompanionObjectStaticDeneme.sayac)
    val nesne1 = CompanionObjectStaticDeneme(1,12)
    println(CompanionObjectStaticDeneme.sayac)
    val nesne2 = CompanionObjectStaticDeneme(2,23)
    println(CompanionObjectStaticDeneme.sayac)  //goruldugu gibi her nesne olusturuldugunda sayuac birer birer artıyor...

}