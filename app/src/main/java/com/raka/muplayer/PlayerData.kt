package com.raka.muplayer

object PlayerData {
    private val namePlayer = arrayOf("Antony",
        "Aaron Wan Bissaka",
        "Bruno Fernandes",
        "Casemiro",
        "David De Gea",
        "Lisandro Martinez",
        "Luke Shaw",
        "Marcus Rashford",
        "Raphael Varane",
        "Rasmus Hojlund")

    private val descriptionPlayer = arrayOf("Striker",
        "Defender",
        "Midfielder",
        "Midfielder",
        "GoalKeeper",
        "Defender",
        "Defender",
        "Striker",
        "Defender",
        "Striker")

    private val overralPlayer = arrayOf("88",
        "87",
        "97",
        "94",
        "90",
        "94",
        "87",
        "98",
        "97",
        "80")

    private val detailPlayer = arrayOf("Antony Matheus dos Santos, dikenal dengan sebutan Antony, adalah seorang pemain sepak bola profesional berkebangsaan Brasil yang bermain sebagai gelandang sayap untuk klub Liga Utama Inggris Manchester United dan tim nasional Brasil. Bergabung dengan Manchester United pada tahun 2022",
        "Aaron Wan Bissaka adalah seorang pemain sepak bola berkewarganegaraan Inggris yang bermain untuk klub Manchester United F.C. pada posisi Bek. Bergabung dengan Manchester United pada tahun 2019",
        "Bruno Miguel Borges Fernandes adalah seorang pemain sepak bola asal Portugal yang saat ini bermain sebagai gelandang di tim Liga Utama Inggris Manchester United F.C. dan tim nasional sepak bola Portugal. Bergabung dengan Manchester United pada tahun 2020",
        "Carlos Henrique Casimiro, biasa lebih dikenal sebagai Casemiro, adalah seorang pemain sepak bola profesional asal Brasil yang bermain sebagai gelandang bertahan untuk klub Liga Utama Inggris Manchester United dan tim nasional Brasil. Bergabung dengan Manchester United pada tahun 2022",
        "David de Gea Quintana adalah seorang pemain sepak bola berkebangsaan Spanyol yang berposisi sebagai penjaga gawang dan terakhir bermain di Manchester United. Dia dianggap sebagai salah satu penjaga gawang terbaik di generasinya karena penyelamatan dan refleksnya yang bagus.",
        "Lisandro Martínez adalah seorang pemain sepak bola profesional asal Argentina yang bermain sebagai bek tengah untuk klub Premier League yaitu Manchester United dan tim nasional Argentina. Bergabung dengan Manchester United pada tahun 2022",
        "Luke Paul Hoare Shaw adalah pemain sepak bola Inggris yang bermain sebagai bek kiri untuk Manchester United dan tim nasional Inggris. Bergabung dengan Manchester United pada tahun 2014",
        "Marcus Rashford MBE atau yang lebih dikenal Sebagai Rashford adalah seorang pemain sepak bola profesional untuk Manchester United dan tim nasional Inggris kelahiran Wythensawe, Manchester, Inggris, Rashford mencetak dua gol pada pertandingan debutnya bersama tim senior menghadapi Midtjylland di UEFA Europa League. Bergabung dengan Manchester United pada tahun 2016",
        "Raphaël Varane adalah seorang pemain sepak bola berkewarganegaraan Prancis yang bermain untuk klub Manchester United sebagai bek tengah atau gelandang bertahan. Sebelumnya, ia bermain untuk tim kampung halamannya, RC Lens. Di level internasional, ia telah tampil 15 kali dan mencetak 3 gol untuk Prancis U21. Bergabung dengan Manchester United pada tahun 2021",
        "Rasmus Winther Højlund adalah seorang pemain sepak bola profesional asal Denmark yang bermain sebagai penyerang untuk klub Liga Utama Inggris Manchester United dan tim nasional Denmark. Højlund memulai karier profesional dengan klub Copenhagen pada 2020. Bergabung dengan Manchester United pada tahun 2023")

    private val photoPlayer = intArrayOf(R.drawable.antony,
        R.drawable.bissaka,
        R.drawable.bruno,
        R.drawable.casemiro2,
        R.drawable.degea,
        R.drawable.martinez,
        R.drawable.shaw,
        R.drawable.rashford2,
        R.drawable.varane,
        R.drawable.hojlund)

    val listData: ArrayList<Player>
        get() {
            val list = arrayListOf<Player>()
            for (position in namePlayer.indices) {
                val player = Player()
                player.name = namePlayer[position]
                player.description = descriptionPlayer[position]
                player.overall = overralPlayer[position]
                player.detail = detailPlayer[position]
                player.photo = photoPlayer[position]
                list.add(player)
            }
            return list
        }
}