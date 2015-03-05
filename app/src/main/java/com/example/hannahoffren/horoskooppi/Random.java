package com.example.hannahoffren.horoskooppi;

/**
 * Created by HannaHoffren on 13/11/14.
 */


public class Random {

    public Random () {


    }

    public String getHoroscope () {
        String[] sana1 = {"Tapaat","Kuulet" ,"Näet", "Osaat", "Hämmästyt", "Kohtaat", "Järkytyt", "Ilahdut"};
        String[] sana2 = {"uuden", "vanhan", "hämärän", "punaisen", "järjettömän", "valkean", "ihanan", "vaivaannuttavan"};
        String[] sana3 = {"ystävän", "työtarjouksen" , "uutisen", "valheen", "totuuden", "kirjan", "koiran", "karvan", "kissan", "palomiehen"};
        String[] sana4 = {"aamulla", "illalla", "nukkumassa", "töissä", "koulussa" , "matkalla", "uimassa", "lenkillä", "tietokoneella", "puhelimessa", "kotona"
                , "kaupassa", "postissa", "suihkussa"};
        String[] sana5 = {"Hän", "Se", "Kypsyystasosi", "Joku", "Tuntematon", "Poliisi", "Palomies", "Lääkäri", "Myyjä", "Kissa", "Koira", "Lintu", "Karhu", "Seepra", "Kauris", "Siili", "Jänis"};
        String[] sana6 = {"menee pois", "juoksee", "huutaa", "valittaa", "itkee", "puree", "hyökkää", "pussaa", "halaa", "ohittaa sinut", "riisuutuu"};
        String[] sana7 = {"kotona", "kadulla", "sairaalassa", "kaupassa", "jonossa", "tiellä", "kylässä", "piilossa", "katolla", "taivaalla", "hautuumaalla", "kahvilassa"};
        String[] sana8 = {"koska", "sillä", "kun", "ehkä", "ja"};
        String[] sana9 = {"näytät","olet" ,"kuulet", "toteat", "maailma", "ystäväsi", "anoppisi", "sinä olet", "lyöt", "isket", "kirjoitat", "juot", "nukut", "näet"};
        String[] sana10 = {"harhoja","ihmeitä" ,"outoja asioita", "rumasti", "iloisesti", "syvästi", "huonosti", "blondisti"};
        String[] sana11 = {"hyvin", "erinomaisesti", "epäilyttävästi", "vakuuttavasti", "vakavasti", "HERPDERPDERP", "naurettavasti", "huolestuttavasti", "hienolla mallilla",
                "tosi tosi tosi tosi huonosti", "niinkuin oletat niiden olevan", "niinkuin et oleta niiden olevan"};


        // find out how many words there are in each list
        int sana1Length = sana1.length;
        int sana2Length = sana2.length;
        int sana3Length = sana3.length;
        int sana4Length = sana4.length;
        int sana5Length = sana5.length;
        int sana6Length = sana6.length;
        int sana7Length = sana7.length;
        int sana8Length = sana8.length;
        int sana9Length = sana9.length;
        int sana10Length = sana10.length;
        int sana11Length = sana11.length;

        // Generate two random numbers
        int  rand1 = (int) (Math.random() * sana1Length);
        int  rand2 = (int) (Math.random() * sana2Length);
        int  rand3 = (int) (Math.random() * sana3Length);
        int  rand4 = (int) (Math.random() * sana4Length);
        int  rand5 = (int) (Math.random() * sana5Length);
        int  rand6 = (int) (Math.random() * sana6Length);
        int  rand7 = (int) (Math.random() * sana7Length);
        int  rand8 = (int) (Math.random() * sana8Length);
        int  rand9 = (int) (Math.random() * sana9Length);
        int  rand10 = (int) (Math.random() * sana10Length);
        int  rand11 = (int) (Math.random() * sana11Length);

        String phrase1 = sana1[rand1];
        String phrase2 = sana2[rand2];
        String phrase3 = sana3[rand3];
        String phrase4 = sana4[rand4];
        String phrase5 = sana5[rand5];
        String phrase6 = sana6[rand6];
        String phrase7 = sana7[rand7];
        String phrase8 = sana8[rand8];
        String phrase9 = sana9[rand9];
        String phrase10 = sana10[rand10];
        String phrase11 = sana11[rand11];



          String RandomLause =  (phrase1 + " " + phrase2 + " " + phrase3 + " " + phrase4 + ". " + phrase5 + " " + phrase6 + " "
                    + phrase7 + ", " + phrase8 + " " + phrase9 + " " + phrase10 + ". " + "Asiasi ovat siis " + phrase11 + ".");

            return RandomLause;
        }

    }
