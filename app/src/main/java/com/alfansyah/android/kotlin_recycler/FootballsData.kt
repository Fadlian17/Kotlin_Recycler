package com.alfansyah.android.kotlin_recycler


    object FootballsData {
        private val footballNames = arrayOf(
            "Cristiano Ronaldo",
            "Lionel Messi",
            "Mohamed Salah",
            "Eden Hazard",
            "Coutinho",
            "Jorginho",
            "Kante",
            "Trent Arnold",
            "Van Dijk",
            "Marcelo",
            "Kepa Arrizabalaga")

        private val footballDetails = arrayOf(
            "Cristiano Ronaldo dos Santos Aveiro, OIH atau lebih dikenal Cristiano Ronaldo merupakan seorang pemain sepak bola Portugal. Ia dapat berposisi sebagai sayap kiri atau kanan serta penyerang tengah. Saat ini ia bermain untuk tim Italia, Juventus dan untuk tim nasional Portugal.",
            "Lionel Andrés \"Leo\" Messi adalah seorang pemain sepak bola Argentina yang saat ini bermain untuk FC Barcelona dan merupakan kapten tim nasional sepak bola Argentina dan FC Barcelona, bermain sebagai penyerang. Ia adalah pencetak gol terbanyak Barcelona sepanjang sejarah.",
            "Mohamed Salah Ghaly adalah pemain sepak bola profesional Mesir yang bermain sebagai penyerang untuk klub Inggris Liverpool dan timnas Mesir. Salah memulai karier seniornya di klub tempat lahirnya, El Mokawloon di Liga Premier Mesir tahun 2010, langsung bergabung dengan Basel untuk harga dirahasiakan.\n",
            "Eden Hazard merupakan seorang pemain sepak bola berkebangsaan Belgia yang bermain untuk klub Real Madrid di Liga Spanyol mulai bulan Juni 2019 dan timnas Belgia. Ia dapat bermain pada posisi gelandang serang dan Gelandang sayap.\n",
            "Philippe Coutinho Correia, adalah pemain sepak bola Brasil yang kini bermain sebagai gelandang untuk FC Barcelona. Gaya permainan dan kemampuannya menarik dibandingkan dengan pemain internasional dan legenda Brazil Ronaldinho.",
            "Jorge Luiz Frello Filho biasa dipanggil Jorginho adalah seorang pemain sepak bola berkewarganegaraan Brasil yang saat ini bermain untuk klub Chelsea, dan bermain pada posisi gelandang. Jorginho memulai karier masa juniornya di klub Verona kemudian melanjutkan karier seniornya di klub tersebut.",
            "N'Golo Kanté adalah seorang pemain sepak bola berkewarganegaraan Prancis yang bermain untuk klub Chelsea biasa bermain pada posisi gelandang bertahan. Kanté memulai karier juniornya di klub Boulogne. Sempat pindah ke Caen dan Leicester City sebelum bergabung dengan Chelsea pada tahun 2016.",
            "Trent John Alexander-Arnold adalah seorang pemain sepak bola berkewarganegaraan Inggris yang bermain untuk klub Liverpool pada posisi bek kanan. Lahir dan dibesarkan di Liverpool, Alexander-Arnold memulai karier juniornya di Liverpool dan menjadi kapten klub di berbagai level pemain muda",
            "Virgil van Dijk adalah seorang pemain sepak bola berkewarganegaraan Belanda yang bermain untuk klub Liverpool F.C. biasa bermain pada posisi bek. Van Dijk memulai karier juniornya di klub Willem II dan FC Groningen kemudian memulai karier seniornya di klub tersebut sejak tahun 2011.",
            "Marcelo Vieira da Silva Júnior adalah seorang pemain sepak bola Brasil yang bermain untuk Real Madrid dan tim nasional sepak bola Brasil. Marcelo konon berbakat dengan kemampuan teknis yang besar, tendangan keras, dan passing yang baik.",
            "Kepa Arrizabalaga Revuelta adalah pemain sepak bola profesional asal Spanyol Bergabung bersama Athletic Bilbao, ia membuat debut tim pertamanya pada 2016 setelah dipinjamkan ke Ponferradina dan Valladolid")

        private val footballImages = intArrayOf(
            R.drawable.ronaldo,
            R.drawable.messi,
            R.drawable.salah,
            R.drawable.eden,
            R.drawable.coutinho,
            R.drawable.jorginho,
            R.drawable.kante,
            R.drawable.trent,
            R.drawable.van_dijk,
            R.drawable.mercelo,
            R.drawable.kepa)

        val listData: ArrayList<Football>
            get() {
                val list = arrayListOf<Football>()
                for (position in footballNames.indices) {
                    val football = Football()
                    football.name = footballNames[position]
                    football.detail = footballDetails[position]
                    football.photo = footballImages[position]
                    list.add(football)
                }
                return list
            }
    }