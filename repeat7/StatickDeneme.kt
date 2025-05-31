package com.calisma.repeat7

object StatickDeneme {  //bu şekilde normal sinif olusturur gibi tanimlayip class ifadesi yerine object ifadesi kullanıldigi zaman statik benzeri bir yapi olan singleton yapi olusur. Bundan 1 tane olusur ve tum surec boyunca bu kullanilir.

    var tema = "koyu"
    fun temaYazdir()
    {
        println(tema)
    }
}