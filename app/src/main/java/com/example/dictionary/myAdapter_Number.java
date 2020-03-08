package com.example.dictionary;

import android.content.Context;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


// class adapter   should extend    <> have ViewHolder (class extend from RecyclerView.ViewHolder )
// in inside this class send data to layout
public class myAdapter_Number extends RecyclerView.Adapter<myAdapter_Number.myViewHolder> {

    ArrayList<Word> modelview;
    public myAdapter_Number(ArrayList<Word> modelview) {
        this.modelview = modelview;

    }

    @NonNull
    @Override
    //note : this method do with number item(view_holder)  which display on screen only after this no
    // this oppsite list view all time dispaly item call method getView() from adapter
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflate to custom layout which hold data
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_number, parent, false);
        // send layout to class myViewHolder
        myViewHolder myHolder = new myViewHolder(v);

        //return holder to can all method see it
        return myHolder;
    }


    // link data to holder
    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        Word model = modelview.get(position);
        holder.EN.setText(model.getWordEN());
        holder.AR.setText(model.getWordAR());

        if(model.hasImage())
        {
            holder.img.setImageResource(model.getImage());
        }
        else
        {
            holder.img.setVisibility(View.GONE);
        }



    }

    @Override
    public int getItemCount() {
        return modelview.size();
    }


    // holder class to recive custom_layout to can find_view_item
    //may declare out no problem

    class myViewHolder extends RecyclerView.ViewHolder {
       TextView AR ,EN;
       ImageView img;
       View parent;
        public myViewHolder(@NonNull View itemView) {  // itemView == custom_layout
            super(itemView);
            EN = itemView.findViewById(R.id.txt_EN);
            AR = itemView.findViewById(R.id.txt_AR);
            img = itemView.findViewById(R.id.img);
            parent = itemView.findViewById(R.id.parent);

        }
    }

    public static class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {
        private OnItemClickListener mListener;

        public interface OnItemClickListener {
            public void onItemClick(View view, int position);

            public void onLongItemClick(View view, int position);
        }

        GestureDetector mGestureDetector;

        public RecyclerItemClickListener(Context context, final RecyclerView recyclerView, OnItemClickListener listener) {
            mListener = listener;
            mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

                @Override
                public void onLongPress(MotionEvent e) {
                    View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
                    if (child != null && mListener != null) {
                        mListener.onLongItemClick(child, recyclerView.getChildAdapterPosition(child));
                    }
                }
            });
        }

        @Override
        public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e) {
            View childView = view.findChildViewUnder(e.getX(), e.getY());
            if (childView != null && mListener != null && mGestureDetector.onTouchEvent(e)) {
                mListener.onItemClick(childView, view.getChildAdapterPosition(childView));
                return true;
            }
            return false;
        }

        @Override public void onTouchEvent(RecyclerView view, MotionEvent motionEvent) { }

        @Override
        public void onRequestDisallowInterceptTouchEvent (boolean disallowIntercept){}
    }
}
