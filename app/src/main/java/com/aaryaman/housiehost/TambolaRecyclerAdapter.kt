
import android.content.ContentValues
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.aaryaman.housiehost.R
import com.aaryaman.housiehost.arr2
import com.aaryaman.housiehost.tr
import kotlinx.android.synthetic.main.tambola_item.view.*
import kotlinx.android.synthetic.main.activity_main.view.*


class tambolaRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return TambolaHolder(LayoutInflater.from(parent.context).inflate(R.layout.tambola_item, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is TambolaHolder -> {
                holder.bind(arr2!![position] )
            }
        }
    }

    override fun getItemCount(): Int {
        return arr2!!.size
    }
}


class TambolaHolder constructor(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val box = itemView.textView


    fun bind(n: Int) {
        if (n!=0)
            box.text= n.toString()
        else{
        Log.e("TAG", "well")
            box.setBackgroundColor(Color.parseColor("#CBCF4F"))
            box.text= tr.toString()
        }
    }

    init {

    }

}