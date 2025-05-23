package com.calisma.repeat5

class Saat {

    lateinit var isimler : Array<String>

    fun hesapla()//mesela bu geri donus degeri olmayan bir fonksiyon c ve java dilindeki void fonksiyonlarla aynı isi yapmak icin varlar.
    {
        println("04 amasya")
    }

    fun hesapla2(sayi2: Int ,sayi1: Int): Int      //bu da int turunde geri donus degeri bulunan bir fonksiyon mesela...
    {
        var degisken: Int = sayi1 + sayi2
        return degisken
    }

    fun hesapla2(sayi1: Int ,sayi2: Int ,sayi3: Int): Int  //iste bu da hesapla2 fonksiyonunu overloading ettigimiz bir senaryo. Geri donus degerinin farkli olmasi overloading icin yeterli bir sebep degil en azından kotlin icin boyle.
    {
        var degisken = sayi1 + sayi2 + sayi3
        return degisken
    }

    fun topla(vararg sayilar: Int): Int   //int turunde parametreler alabilen bir vararg fonksiyon
    {
        var sonuc = 0
        for (sayi in sayilar)
        {
            sonuc = sayi + sonuc
        }
        return sonuc
    }
    fun isimYazdir(vararg isimler: String) //string turunde parametreler alabilen bir vararg fonksiyon
    {
        for (isim in isimler)
        {
            println(isim)
        }
        println("toplam ${isimler.size} isim yazdirildi")
    }
}