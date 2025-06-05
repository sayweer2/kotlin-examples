package com.example.kotlin

fun main()
{
    val degisken1 = kisiSeviyeleri.GIRIS //enum siniflarinda tanimlanan sabitlerin her biri singleton bir yapı halinde derleme zamanında otomatik olarak olusturulurlar. (buradaki ornekte giris gelisme ve bilirkisi)
    val degisken2 = kisiSeviyeleri.GELISME
    val degisken3 = kisiSeviyeleri.BILIRKISI

    println(degisken1.name) //enum siniflarinin kendiliginden gelen bir ozelligi olan name ozelligi degiskenin ismini dondurur.
    println(degisken3.ordinal)  //enum sinifinin kendiliginden gelen ordinal ozelligi ise belirtilen sabitin enum sinifinin index olarak kacıncı sabiti oldugunu dondurur.

    degisken2.yap()

    println(degisken3.seviye)
}