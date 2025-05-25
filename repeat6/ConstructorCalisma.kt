package com.example.repeat6

class ConstructorCalisma(val id: Int ,var isim: String ,var soyad: String) { //burada kullandigimiz constructor primary constructor olarak geçiyor ve sadece degiskenler olusturulabiliyor  yani herhangi bir islem yapılamıyor.
    var maas: Double = 0.0//init blogundan once propertyleri tanımlarsak init bloğunun içerisinde kullanabiliriz.
    var borc: Double = 0.0
    var cocukSayisi: Int =0
    var meslek : String =""
    init { // başlatırken primary constructorla beraber islemler yapmak istiyorsak init bloğunu kullanabiliriz.
        println("nesne basariyla olusturuldu.")//nesne oluşturulurken yapılan islemlerdir. bu işleme initializer denir.
    }

    constructor( id: Int,isim : String, soyad : String ,maas: Double, borc: Double):this(id ,isim ,soyad)
    {
        this.maas = maas
        this.borc = borc
        println("secondary constructor basariyla kullanildi ve nesne olusturuldu.")
    }

    constructor(id: Int ,isim: String ,soyad: String ,cocukSayisi: Int ,meslek: String):this(id,isim,soyad)
    {
        this.cocukSayisi =cocukSayisi
        this.meslek = meslek
        println("ikinci secondary constructor kullanilarak nesne olusturuldu")
    }


}