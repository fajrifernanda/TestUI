package task.ui.com.testui.adapter;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import task.ui.com.testui.R;
import task.ui.com.testui.model.News;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.RowHolder> {
    ArrayList<News> newsList;
    Context context;

    public NewsAdapter(ArrayList<News> newsList, Context context) {
        this.newsList = newsList;
        this.context = context;
    }

    @Override
    public NewsAdapter.RowHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View holder = inflater.inflate(R.layout.holder_news_item,parent,false);
        return new RowHolder(holder);
    }

    @Override
    public void onBindViewHolder(NewsAdapter.RowHolder holder, int position) {
        String newsTitle = newsList.get(position).getTitle();
        String newsLikes = "Fajri and "+newsList.get(position).getLikers()+" others";
        int comments = newsList.get(position).getComment();
        String newsAuthorName = newsList.get(position).getAuthor_name();
//        int resAuthor = context.getResources().getIdentifier(newsList.get(position).getAuthor_photo() , "drawable", context.getPackageName());
//        int resNews = context.getResources().getIdentifier(newsList.get(position).getPhoto() , "drawable", context.getPackageName());
//        Picasso.get().load(resAuthor).into(holder.civNewsAuthorPhoto);
//        Picasso.get().load(resNews).into(holder.ivNewsPhoto);
        holder.tvNewsTitle.setText(newsTitle);
        holder.tvNewsAuthorName.setText(newsAuthorName);
        holder.tvNewsLikers.setText(newsLikes);
        holder.tvNewsComments.setText(String.valueOf(comments));
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class RowHolder extends RecyclerView.ViewHolder {
        TextView tvNewsAuthorName, tvNewsTitle, tvNewsLikers, tvNewsComments;
        ImageView ivNewsPhoto;
        CircleImageView civNewsAuthorPhoto;
        public RowHolder(View itemView) {
            super(itemView);
            tvNewsAuthorName = itemView.findViewById(R.id.tv_news_author_name);
            tvNewsTitle = itemView.findViewById(R.id.tv_news_title);
            tvNewsComments = itemView.findViewById(R.id.tv_news_totalcomment);
            tvNewsLikers = itemView.findViewById(R.id.tv_news_likes);
            ivNewsPhoto = itemView.findViewById(R.id.iv_news_photo);
            civNewsAuthorPhoto = itemView.findViewById(R.id.civ_news_author_photo);
        }
    }
}
