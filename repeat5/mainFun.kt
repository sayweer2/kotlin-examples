package com.calisma.repeat5

fun main()
{
    lateinit var isimler: Array<String> // lateinit anahtar kelimesi ile referans turden degiskenleri ilk deger atamadan olusturabiliyoruz.
    //ama bazı onemli detayları var. mesela sınıf seviyesinde kullanılmalıdır yoksa hata alınir(yani sinifin icerisinde olusturulmalidir)
    //burada main fonksiyon icerisinde olusturmamiza ragmen hata almiyoruz cunku henuz kullanmaya calismadik.kullanmaya calistigimiz noktada hata aliyoruz.
    //bir diger nokta ise val ile olusturulmamalari gerektigi cunku val ile olusturulurlarsa sonradan degerler atanamaz zaten bir degeri olmadigi icin hata almak isten bile degil.

}