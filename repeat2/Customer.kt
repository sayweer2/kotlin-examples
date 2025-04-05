package com.calisma.repeat2

class Customer(override var isim: String, override var soyAd: String ,var para: Int ) : User() {

    override fun girisYap() {
        println("$isim $soyAd adli musteri hesabina basarili bir sekilde giris yapildi.")
    }

    override fun cikisYap() {
        println("$isim $soyAd adli musteri hesabindan basarili bir sekilde cikis yapildi.")
    }

    override fun bilgileriGoster() {
        println("musteri = $isim $soyAd")
    }

    val sepetim = ArrayList<Product>()
    fun urunEkle(urun : Product)
    {
        sepetim.add(urun)
    }

    fun siparisiTamamla()
    {
        val siparis = Order(this ,sepetim)
        siparis.odemeYap()
    }
}