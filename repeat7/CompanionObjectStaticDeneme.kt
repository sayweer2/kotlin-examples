package com.calisma.repeat7

class CompanionObjectStaticDeneme(val id: Int ,var kredi : Int) {
    init {
        nesneOlusturuldugundaCagir()//boylece bu siniftan her nesne olusturuldugunda sayac birer birer artacak.
    }

    companion object{ //burada da singleton yapının baska bir varyasyonunu goruyoruz diyebiliriz bu yapi ise tum bu siniftan olusturulan nesneler icin ortak bir yapidir.
        var sayac = 0
        fun nesneOlusturuldugundaCagir()
        {
            sayac++
        }
    }
}