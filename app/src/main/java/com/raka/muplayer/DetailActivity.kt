package com.raka.muplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    private lateinit var ivPhoto: ImageView
    private lateinit var tvName: TextView
    private lateinit var tvDescription: TextView
    private lateinit var tvOverall: TextView
    private lateinit var tvDetail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        ivPhoto = findViewById(R.id.iv_photo_detail)
        tvName = findViewById(R.id.tv_username_player)
        tvDescription = findViewById(R.id.tv_description_player)
        tvOverall = findViewById(R.id.tv_player_overall)
        tvDetail = findViewById(R.id.tv_detail)

        val getName = intent.getStringExtra("name")
        val getDescription = intent.getStringExtra("description")
        val getOverall = intent.getStringExtra("overall")
        val getDetail = intent.getStringExtra("detail")
        val getPhoto = intent.getIntExtra("photo", 0)

        tvName.text = getName
        tvDescription.text = getDescription
        tvOverall.text = getOverall
        tvDetail.text = getDetail

        Glide.with(this@DetailActivity)
            .load(getPhoto)
            .into(ivPhoto)
    }
}