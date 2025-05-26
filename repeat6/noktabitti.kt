    package com.example.repeat6

    import android.provider.ContactsContract

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

    infix fun Uzayli.kac(isim2: String) //burada ise bir diger infix fonksiyon olusturma yolu olan extension fonksiyondan olusturmayi gorduk.
    {
        println("${this.uzayliIsim} $isim2 ye kaciyor.")
    }

    val uzayliKardes: Uzayli = Uzayli("sayweer2")
    val uzayliKardes2: Uzayli = Marsli("sayweer")   //extension fonksiyonloar statik dispatch (derleme zamanında, referans türüne göre çalışır). override edilmiş gerçek fonksiyonlar dinamik dispatch (çalışma zamanında, gerçek nesne türüne göre çalışır)


    uzayliKardes2.kos("sayweer")//her ne kadar farklı turden nesneler olsalar da extension fonksiyonda bizim icin onemli olan referansının hangi sinif turunden oldugudur.
    uzayliKardes.kos("sayweer")

    val ben: ConstructorCalisma = ConstructorCalisma(302 ,"seyit" ,"degirmen") //primary constructor kullanilirak olusturuldu.
    val digerBen: ConstructorCalisma = ConstructorCalisma(5004 ,"sel" ,"ykn" ,123123.0 ,0.0)//secondary constructor kullanilirak olusuturuldu.primary da kullanıldı mecburen 😂
    val digerYarimlaOrtakParcamiz = ConstructorCalisma(1 ,"afra" ,"degirmen" ,0 ,"babasinin kizi")

    println(digerBen.isim)
    println(ben.isim) // gibi gibi kullanilabilir.
    println(digerYarimlaOrtakParcamiz.soyad)

    uzayliKardes2.kos("sayweer")
    uzayliKardes.kos("sayweer2")

    uzayliKardes kac "sel"
    uzayliKardes2 kac "sln"

    val dataUrun1 = DataClassCalisma("elma" ,500 ,12.0)
    val dataUrun2 = DataClassCalisma("elma" ,500 ,12.0)
    val dataUrun3 = DataClassCalisma("armut" ,600 ,10.0)

    println(dataUrun1)  //buralarda nesnelerin tüm bilgileri ekrana yazdirilir cunku data class kullanilarak olusturulan nesneler kullandık bu da su demek toString() fonksiyonu otomatik olarak eklenmiş oldu.
    println(dataUrun2)
    println(dataUrun3)

    println(dataUrun1 == dataUrun2) //burada == operatoru aslinda equals() fonksiyonu gorevi goruyor .ve nesnelerin ikisi de data class ile olusturuldugu icin icerikleri karsilastirilacak. equals() fonksiyonu once fonksiyonu turunu karsilastirir eger ayni siniftan olusturulmuslarsa sonraki asamaya gecilir. burada sonraki asama iceriklerin karsilastirilmasi ve bu kisimda icerikler ayni oldugu icin true doner.
    println(dataUrun2 == dataUrun3) //burada yine aynı siniftan olusturulduklari icin turleri ayni oluyor ve ilk asamayi geciyoruz daha sonraki asamada data class dan olusturulduklari icin icerikler karsilastirilir ve icerikler ayni olmadigi icin sonuc false cikar.
    println(ben == dataUrun1) //bu tarz durumlarda sonuc kesinlikle false doner cunku equals() fonksiyonunun kontrol ettigi ilk sey turler ve buradaki nesneler farkli siniflardan olusturulmus bu yuzden data sinifindan bir nesne ve normal siniftan bir nesne karsilastirildigi zaman sonuc her zaman false doner.
    
}