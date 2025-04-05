package com.calisma.repeat2

class Seller(override var isim: String, override var soyAd: String) : User() {

    override fun girisYap() {
        println("$isim $soyAd adli satici hesabiyla basarili bir sekilde giris yapildi.")
    }

    override fun cikisYap() {
        println("$isim $soyAd adli satici hesabiyla basarili bir sekilde cikis yapildi...")
    }

    override fun bilgileriGoster() {
        println("satıcı = $isim $soyAd")
    }

    val urunlerim = ArrayList<Product>()

    fun urunEkle(urun : Product)
    {
        urunlerim.add(urun)
    }

}