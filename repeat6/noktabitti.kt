package com.example.repeat6

fun main()
{
    fun Marsli.kos(isim: String) //bu kısım cok kritik bir nokta extension fonksiyonlar normal fonksiyonlar gibi runtime da değil compile time da calisirlar bu yuzden de override islemi gerceklestirilemez.
    {
        println("$isim isimli marsli uzayli kosmaya basladi")
    }
    fun Uzayli.kos(isim: String){
        println("$isim kosmaya basladi")
        //this.uc() //burada eger thiss.uc() yerine println icerisinde println(this.uc()) seklinde bir seyle yazdirmayi deneseydim ciktida kotlin.Unit seklinde bir cıktı daha cıkacaktı.
        //cunku uc() fonksiyonu javadaki void fonksiyonu gibi bir fonksiyon ama javadakinin aksine hiçbir sey dondurmez demek yerine Unit adinda bir nesnedir. yani yazdirilabilir.
        //burada println() icerisinde kullanırsak eger o zaman once void olarak calisir ve yapmasi gerekenleri yapar daha sorna ise nesne yani kotlin.Unit ekrana bastirilir.
    }

    val uzayliKardes: Uzayli = Uzayli()
    val uzayliKardes2: Uzayli = Marsli()

    uzayliKardes2.kos("sayweer")//her ne kadar farklı turden nesneler olsalar da extension fonksiyonda bizim icin onemli olan referansının hangi sinif turunden oldugudur.
    uzayliKardes.kos("sayweer")

    val ben: ConstructorCalisma = ConstructorCalisma(302 ,"seyit" ,"degirmen") //primary constructor kullanilirak olusturuldu.
    val digerBen: ConstructorCalisma = ConstructorCalisma(5004 ,"sel" ,"ykn" ,123123.0 ,0.0)//secondary constructor kullanilirak olusuturuldu.primary da kullanıldı mecburen 😂

    println(digerBen.isim)
    println(ben.isim) // gibi gibi kullanilabilir.

}