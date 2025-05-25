package com.example.repeat6

class Marsli(val marsliIsim: String): Uzayli("sw") {

    override fun uc()
    {
        println("marsli $marsliIsim ucuyor!!!")
    }

    infix fun kacti(isim2: String) //infix fonksiyonlar burada kullandığımız gibi 2 sekilde olusturulabilir bunlardan birisi uye fonksiyonlar digeri ise extension fonksiyonlardır burada kullanmis oldugumuz tur uye fonksiyon kismina giriyor.
    //uye fonksiyon = bir sinifin parcasi olan bir sinifin icerisinde tanimli olan fonksiyondur.
    {
        println("${this.marsliIsim} $isim2 ye kacti")
    }
}