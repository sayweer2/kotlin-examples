package com.calisma.repeat3

import java.util.InputMismatchException
import java.util.Scanner

fun main()
{
    val okuyucu = Scanner(System.`in`)

    println("lutfen isminizi tuslayiniz = ")

    val isim = okuyucu.nextLine()



    var yas = 0

    while(true)
    {
        try {
            println("lutfen yasinizi giriniz = ")
            yas = okuyucu.nextInt()
            okuyucu.nextLine()
            break
        }catch (e : InputMismatchException) //alınması beklenen turde degerin disinda bir deger alindigi zaman bu hata firlatilir. Scanner sinifi icin gecerli.
        {
            println("hatalı bir yas degeri tusladiniz. gecerli bir yas degeri tuslamaniz icin yonlendiriliyorsunuz lutfen bekleyiniz...")
            okuyucu.nextLine()//scanner sinifi nesneleri exception firlattigi zaman bufferi temizlemedigi icin burada bufferi temizleyip sonsuz donguden kurtuluyoruz.
        }
    }

    println("tuslamis oldugunuz yas = $yas")

    println("lutfen dogum yilinizi duslayiniz = ")
    val alinanDeger = okuyucu.nextLine().toIntOrNull()

    val dogumYili = alinanDeger?.let { println("naber gençlik") }?:println("burası null bir deger")


}