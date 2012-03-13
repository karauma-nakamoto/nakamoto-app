package jp.eclipsebook;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.*;


public class MyView extends View {
	public Bitmap bitmap = null;
	
	public MyView(Context context){
		super(context);
		init(context);
	}
	
	public MyView(Context context, AttributeSet attrs){
		super(context, attrs);
		init(context);
	}
	
	public MyView(Context context, AttributeSet attrs, int defStyle){
		super(context, attrs, defStyle);
		init(context);
	}
	
	private void init(Context context){
		Resources res = context.getResources();
		bitmap = BitmapFactory.decodeResource(res, R.drawable.top);
	}
	
	public void onDraw(Canvas canvas){
		super.onDraw(canvas);
		canvas.drawColor(Color.RED);
		if(bitmap != null){
			Paint paint = new Paint();
			int w=bitmap.getWidth();
	        int h=bitmap.getHeight();
	        Rect src=new Rect(0,0,w,h);
	        Rect dst=new Rect(canvas.getWidth()/2-w/2,0,canvas.getWidth()/2+w/2,h);
	        canvas.drawBitmap(bitmap,src,dst,paint);
		}
	}

}
