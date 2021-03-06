package com.example.muctieutietkiem.packages.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.muctieutietkiem.packages.model.Goal;
import com.example.smartmanagertwo.R;

import java.util.List;

public class GoalAdapter extends BaseAdapter {

    Context context;
    int item_layout;
    List<Goal> goalList;

    public GoalAdapter(Context context, int item_layout, List<Goal> goalList) {
        this.context = context;
        this.item_layout = item_layout;
        this.goalList = goalList;
    }

    @Override
    public int getCount() {
        return goalList.size();
    }

    @Override
    public Object getItem(int i) {
        return goalList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view==null)
        {
            holder=new ViewHolder();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(item_layout,null);
            holder.goalThumb= view.findViewById(R.id.imvGoal);
            holder.goalName=view.findViewById(R.id.txtGoal);
            holder.goalTime=view.findViewById(R.id.txtDate);
            holder.barThumb=view.findViewById(R.id.imvBar);
            holder.goalSaved=view.findViewById(R.id.txtSaved);

            view.setTag(holder);
        }
        else {holder= (ViewHolder) view.getTag();
        }
        Goal g = goalList.get(i);
        holder.goalThumb.setImageResource(g.getGoalThumb());
        holder.goalName.setText(g.getGoalName());
        holder.goalTime.setText(("Ngày đạt: "+g.getGoalTime()));
        holder.barThumb.setImageResource(g.getBarThumb());
        holder.goalSaved.setText("Đã tiết kiệm:"+g.getGoalSaved());

        return view;
    }
    public static class ViewHolder{
        ImageView goalThumb,barThumb;
        TextView goalName,goalTime,goalSaved;

    }
}
