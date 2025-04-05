package com.calisma.repeat2

fun main(){

    val satici1 = Seller("sel" ,"y")
    satici1.bilgileriGoster()
    val satici2 = Seller("seyit" ,"degirmen")
    satici2.bilgileriGoster()

    val musteri = Customer("yusuf" ,"degirmen", 120)
    musteri.girisYap()
    musteri.bilgileriGoster()

    val urun1 = Product("un" ,100 ,satici1)
    val urun2 = Product("yem" ,20 ,satici1)
    val urun3 = Product("saman" ,40 ,satici1)
    val urun4 = Product("araba" ,9999 ,satici2)

    satici1.urunEkle(urun1)
    satici1.urunEkle(urun2)
    satici1.urunEkle(urun3)
    satici2.urunEkle(urun4)

    musteri.urunEkle(urun2)
    musteri.urunEkle(urun2)
    musteri.siparisiTamamla()
}