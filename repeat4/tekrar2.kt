package com.calisma.repeat4

import java.util.Scanner

fun main()
{
    val okuyucu = Scanner(System.`in`)

    println("lutfen kilonuzu tuslayiniz =")
    var kilo = okuyucu.nextLine().toIntOrNull()

    if(kilo != null && kilo > 0)
    {
        when(kilo)
        {
            in 0..40 -> println("cok zayif")
            in 41..65 -> println("zayif")
            in 66..80 -> println("orta(ideal)")
            in 80..100 -> println("kilolu")
            else -> println("obezite ihtimali (cok kilolu)")
        }
    }else
    {
        println("gecerli bir kilo degeri girmediginiz icin sistem otomatik olarak 0 olarak atayacak kilonuzu!!!")
        kilo = 0
    }

    when
    {
        kilo == 0 -> println("puff siz varoldugunuza emin misiniz????")
        kilo % 2 == 0 -> println("cift sayi bir kiloya sahipsiniz!")
        else -> println("tek sayi bir kiloya sahipsiniz")
    }
}