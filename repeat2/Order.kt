package com.calisma.repeat2

class Order (val musteri : Customer , val urunler : ArrayList<Product> , var toplamFiyat : Int =0){
    init {
        for (urun in urunler)
        {
            toplamFiyat += urun.urunFiyati
        }
    }

    fun odemeYap()
    {
        if (toplamFiyat > musteri.para)
        {
            println("maalesef odeme gerceklesemedi lutfen limitlerinizi kontrol edip tekrar deneyiniz!!!")
        }

        else
        {
            println("Tebrikler siparisiniz alindi\nSiparis tutari = $toplamFiyat")
            musteri.para -= toplamFiyat
            println("Kalan bakiyeni = ${musteri.para}")
        }
    }
}