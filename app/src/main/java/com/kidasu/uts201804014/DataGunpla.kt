package com.kidasu.uts201804014

object DataGunpla {
    private val kodeGunpla = arrayOf(
        "GU001",
        "GU002",
        "GU003",
        "GU004",
        "GU005",
        "GU006",
        "GU007",
        "GU008",
        "GU009",
        "GU010"
    )

    private val namaGunpla = arrayOf(
        "Aile Strike",
        "00 Raiser",
        "Strike Freedom",
        "Destiny",
        "Exia RII",
        "Amazing Exia",
        "00 Sky",
        "Earthree",
        "Infinite Justice",
        "A. Strike Freedom"
    )

    private val hargaGunpla = arrayOf(
        "Rp. 200.000",
        "Rp. 260.000",
        "Rp. 310.000",
        "Rp. 320.000",
        "Rp. 200.000",
        "Rp. 250.000",
        "Rp. 220.000",
        "Rp. 200.000",
        "Rp. 310.000",
        "Rp. 340.000"
    )

    private val logoGunpla = intArrayOf(
        R.drawable.g1,
        R.drawable.g2,
        R.drawable.g3,
        R.drawable.g4,
        R.drawable.g5,
        R.drawable.g6,
        R.drawable.g7,
        R.drawable.g8,
        R.drawable.g9,
        R.drawable.g10
    )

    val listData: ArrayList<Gunpla>
        get() {
            val listGunpla = arrayListOf<Gunpla>()
            for (position in namaGunpla.indices){
                val gunpla = Gunpla()
                gunpla.kode = kodeGunpla[position]
                gunpla.nama = namaGunpla[position]
                gunpla.harga = hargaGunpla[position]
                gunpla.logo = logoGunpla[position]
                listGunpla.add(gunpla)
            }
            return listGunpla
        }
}