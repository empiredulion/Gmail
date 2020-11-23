package com.example.gmail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

public class InboxAdapter extends BaseAdapter{

    List<MailModel> singleMails;
    Context context;

    public InboxAdapter(List<MailModel> singleMail, Context context) {
        this.singleMails = singleMail;
        this.context = context;
    }


    @Override
    public int getCount() {
        return singleMails.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.mail_layout, viewGroup, false);
        }

        TextView imageName = view.findViewById(R.id.image_name);
        TextView sender = view.findViewById(R.id.text_user);
        TextView subject = view.findViewById(R.id.text_subject);
        TextView content = view.findViewById(R.id.text_content);
        TextView time = view.findViewById(R.id.time);
        ImageButton star = view.findViewById(R.id.on_star);

        MailModel singleMail = singleMails.get(i);
        imageName.setText(singleMail.getSender());
        sender.setText(singleMail.getSender());
        subject.setText(singleMail.getSubject());
        content.setText(singleMail.getContent());

        return view;
    }
}
