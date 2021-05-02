package com.example.animationapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CanvasFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return new MyView(getActivity());
    }

    public class MyView extends View{

        public MyView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            int x = getWidth();
            int y = getHeight();
            int radius = 100;

            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.GREEN);
            canvas.drawPaint(paint);
            paint.setColor(Color.parseColor("#da4747"));

            canvas.drawCircle(x/3, y/2 , radius, paint);

            paint.setColor(Color.parseColor(("#dadada")));

            canvas.drawCircle(x/3 + x/3, y/2, radius, paint);

            canvas.drawRect(13, 300, 180, 580, paint);

            paint.setColor(Color.parseColor(("#ff2233")));

            canvas.drawRect(300, 200, 500, 600, paint);

            paint.setColor(Color.parseColor(("#ff2233")));

            canvas.drawRect(600, 50, 1000, 700, paint);

            Point a = new Point(x / 6, y / 3 + y / 2);
            Point b = new Point( x / 3, y / 3 + y / 2);
            Point c = new Point(x / 6, y / 5 + y / 2);

            Path path = new Path();
            path.setFillType(Path.FillType.EVEN_ODD);


            paint.setColor(Color.parseColor(("#cfeb34")));

            path.lineTo(a.x, a.y);
            path.lineTo(b.x, b.y);
            path.lineTo(c.x, c.y);
            path.lineTo(a.x, a.y);

            canvas.drawPath(path, paint );

            a = new Point(x / 6 + x / 2, y / 3 + y / 2);
            b = new Point( x / 2, y / 3 + y / 2);
            c = new Point(x / 6 + x / 2, y / 5 + y / 2);

            paint.setColor(Color.parseColor(("#2deda7")));

            Path path1 = new Path();

            path1.lineTo(a.x, a.y);
            path1.lineTo(b.x, b.y);
            path1.lineTo(c.x, c.y);
            path1.lineTo(a.x, a.y);

            canvas.drawPath(path1, paint );

        }
    }
}