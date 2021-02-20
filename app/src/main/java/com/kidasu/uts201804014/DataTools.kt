package com.kidasu.uts201804014

object DataTools {
    private val kodeTools = arrayOf(
        "TO001",
        "TO002",
        "TO003",
        "TO004",
        "TO005",
        "TO006",
        "TO007",
        "TO008",
        "TO009",
        "TO0010"
    )

    private val namaTools = arrayOf(
        "Nipper Basic",
        "Sanding Sponge",
        "Cutting Mat A4",
        "Cutting Mat A3",
        "Mr. Cement S",
        "Part Opener",
        "Masking Tape",
        "Paint Tray",
        "Enamel Polish",
        "Cutting Knife"
    )

    private val hargaTools = arrayOf(
        "Rp. 25.000",
        "Rp. 25.000",
        "Rp. 40.000",
        "Rp. 60.000",
        "Rp. 50.000",
        "Rp. 45.000",
        "Rp. 38.000",
        "Rp. 5.000",
        "Rp. 25.000",
        "Rp. 25.000"
    )

    private val logoTools = intArrayOf(
        R.drawable.t1,
        R.drawable.t2,
        R.drawable.t3,
        R.drawable.t4,
        R.drawable.t5,
        R.drawable.t6,
        R.drawable.t7,
        R.drawable.t8,
        R.drawable.t9,
        R.drawable.t10
    )

    val listData: ArrayList<Tools>
        get() {
            val listTools = arrayListOf<Tools>()
            for (position in namaTools.indices){
                val tools = Tools()
                tools.kode = kodeTools[position]
                tools.nama = namaTools[position]
                tools.harga = hargaTools[position]
                tools.logo = logoTools[position]
                listTools.add(tools)
            }
            return listTools
        }
}