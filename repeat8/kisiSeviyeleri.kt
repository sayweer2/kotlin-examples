package com.example.kotlin

enum class kisiSeviyeleri (val seviye: String ,val puan: Int){
    GIRIS("baslangic" ,1),
    GELISME("ortalama",2),
    BILIRKISI("son nokta" ,3);

    fun yap()
    {
        println("yaptim")
    }

}