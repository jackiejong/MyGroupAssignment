package hfad.com.mygroupassignment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {
    private ArrayList<INFS1609> mINFS1609;
    private RecyclerViewClickListener mListener;


    public TextView week, date;

    public CourseAdapter (ArrayList<INFS1609> course, RecyclerViewClickListener listener) {
        mINFS1609 = course;
        mListener = listener;
    }

    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView week, date;
        private RecyclerViewClickListener mListener;

        public CourseViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            mListener = listener;
            v.setOnClickListener(this);
            week = v.findViewById(R.id.week_num);
            date = v.findViewById(R.id.date_num);
        }

        @Override
        public void onClick(View view) {
            mListener.onClick(view, getAdapterPosition());
        }
    }


    @Override
    public CourseAdapter.CourseViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.week_list_row,parent,false);
        return new CourseViewHolder(v,mListener);
    }
    @Override
    public void onBindViewHolder (CourseViewHolder holder, int position) {
        INFS1609 course_week1 = mINFS1609.get(position);
        holder.week.setText(course_week1.getWeek_title());
        holder.date.setText(course_week1.getDate());
    }

    @Override
    public int getItemCount() {
        return mINFS1609.size();
    }
}