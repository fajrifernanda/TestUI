package task.ui.com.testui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import java.util.ArrayList

import de.hdodenhof.circleimageview.CircleImageView
import task.ui.com.testui.R
import task.ui.com.testui.model.News


class NewsAdapter(val newsList: ArrayList<News>, val context: Context) : RecyclerView.Adapter<NewsAdapter.RowHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RowHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.holder_news_item,parent,false)
        return RowHolder(v)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: RowHolder?, position: Int) {
        val newsTitle = newsList.get(position).title
        val newsLikes = "Fajri and " + newsList[position].likers + " others"
        val comments = newsList[position].comment
        val newsAuthorName = newsList[position].author_name
        val idPhoto: Int = context.resources.getIdentifier(newsList[position].author_photo, "drawable",
                context.getPackageName())
        val newsPhoto: Int = context.resources.getIdentifier(newsList[position].photo, "drawable", context.packageName)
        holder?.tvNewsTitle?.text = newsTitle
        holder?.tvNewsAuthorName?.text = newsAuthorName
        holder?.tvNewsLikers?.text = newsLikes
        holder?.tvNewsComments?.text = comments.toString()
        holder?.civNewsAuthorPhoto?.setImageResource(idPhoto)
        holder?.ivNewsPhoto?.setImageResource(newsPhoto)
    }

    class RowHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNewsAuthorName = itemView.findViewById<TextView>(R.id.tv_news_author_name)
        val tvNewsTitle = itemView.findViewById<TextView>(R.id.tv_news_title)
        val tvNewsComments = itemView.findViewById<TextView>(R.id.tv_news_totalcomment)
        val tvNewsLikers = itemView.findViewById<TextView>(R.id.tv_news_likes)
        val ivNewsPhoto = itemView.findViewById<ImageView>(R.id.iv_news_photo)
        val civNewsAuthorPhoto = itemView.findViewById<CircleImageView>(R.id.civ_news_author_photo)
    }

}