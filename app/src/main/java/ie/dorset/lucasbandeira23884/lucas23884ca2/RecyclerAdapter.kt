package ie.dorset.lucasbandeira23884.lucas23884ca2


import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_layout.*


class RecyclerAdapter(): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var titles = arrayOf("Spider-Man", "Batman", "Lord of the Rings", "Matrix")

    private var details = arrayOf("Get tickets!", "Get tickets!", "Get tickets!", "Get tickets!")

    private var images = intArrayOf(R.drawable.spider, R.drawable.batman, R.drawable.lotr, R.drawable.matrix)

    private var counter = intArrayOf(15, 15, 15, 15, 15)

    var count = 15

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemImage.setImageResource(images[position])
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
//        holder.counterSeats.text = counter[position]


    }

    override fun getItemCount(): Int {
        return titles.size
    }



    inner class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var increaseCounter: Button
        var decreaseCounter: Button
        var counterSeats: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
            increaseCounter = itemView.findViewById(R.id.increase_button)
            decreaseCounter = itemView.findViewById(R.id.decrease_button)
            counterSeats = itemView.findViewById(R.id.counter_seats)

            itemView.setOnClickListener {
                val position: Int = adapterPosition
                Toast.makeText(itemView.context, "You clicked on ${titles[position]}", Toast.LENGTH_LONG).show()
            }

//            increaseCounter.setOnClickListener{
//                if (count <= 0) {
//                    count = 0
//                    print("No more tickets!")
//                }
//                count--
//                counterSeats.setText(count).toString()
//            }
//
//            decreaseCounter.setOnClickListener {
//                if (count == 15) {
//                    count = 15
//                }
//                    count++
//                counterSeats.setText(count).toString()
//            }



        }

    }
}


