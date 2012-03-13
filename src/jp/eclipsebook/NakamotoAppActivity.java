package jp.eclipsebook;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class NakamotoAppActivity extends Activity implements OnCheckedChangeListener {
	int sum	= 0;
	ToggleButton tb1, tb2, tb3, tb4, tb5, tb6, tb7, tb8, tb9, tb10, tb11, tb12, tb13, tb14, tb15, tb16, tb17, tb18, tb19, tb20, tb21, tb22, tb23, tb24, tb25, tb26, tb27, tb28, tb29, tb30, tb31, tb32, tb33, tb34, tb35, tb36;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		final Activity activity = this;
		TextView textview = (TextView)activity.findViewById(R.id.textView1);
		textview.setText("合計: " + sum + "円");
		// ToggleButtonの取得
        tb1 = (ToggleButton) findViewById(R.id.toggleButton1);
        tb2 = (ToggleButton) findViewById(R.id.toggleButton2);
        tb3 = (ToggleButton) findViewById(R.id.toggleButton3);
        tb4 = (ToggleButton) findViewById(R.id.toggleButton4);
        tb5 = (ToggleButton) findViewById(R.id.toggleButton5);
        tb6 = (ToggleButton) findViewById(R.id.toggleButton6);
        tb7 = (ToggleButton) findViewById(R.id.toggleButton7);
        tb8 = (ToggleButton) findViewById(R.id.toggleButton8);
        tb9 = (ToggleButton) findViewById(R.id.toggleButton9);
        tb10 = (ToggleButton) findViewById(R.id.toggleButton10);
        tb11 = (ToggleButton) findViewById(R.id.toggleButton11);
        tb12 = (ToggleButton) findViewById(R.id.toggleButton12);
        tb13 = (ToggleButton) findViewById(R.id.toggleButton13);
        tb14 = (ToggleButton) findViewById(R.id.toggleButton14);
        tb15 = (ToggleButton) findViewById(R.id.toggleButton15);
        tb16 = (ToggleButton) findViewById(R.id.toggleButton16);
        tb17 = (ToggleButton) findViewById(R.id.toggleButton17);
        tb18 = (ToggleButton) findViewById(R.id.toggleButton18);
        tb19 = (ToggleButton) findViewById(R.id.toggleButton19);
        tb20 = (ToggleButton) findViewById(R.id.toggleButton20);
        tb21 = (ToggleButton) findViewById(R.id.toggleButton21);
        tb22 = (ToggleButton) findViewById(R.id.toggleButton22);
        tb23 = (ToggleButton) findViewById(R.id.toggleButton23);
        tb24 = (ToggleButton) findViewById(R.id.toggleButton24);
        tb25 = (ToggleButton) findViewById(R.id.toggleButton25);
        tb26 = (ToggleButton) findViewById(R.id.toggleButton26);
        tb27 = (ToggleButton) findViewById(R.id.toggleButton27);
        tb28 = (ToggleButton) findViewById(R.id.toggleButton28);
        tb29 = (ToggleButton) findViewById(R.id.toggleButton29);
        tb30 = (ToggleButton) findViewById(R.id.toggleButton30);
        tb31 = (ToggleButton) findViewById(R.id.toggleButton31);
        tb32 = (ToggleButton) findViewById(R.id.toggleButton32);
        tb33 = (ToggleButton) findViewById(R.id.toggleButton33);
        tb34 = (ToggleButton) findViewById(R.id.toggleButton34);
        tb35 = (ToggleButton) findViewById(R.id.toggleButton35);
        tb36 = (ToggleButton) findViewById(R.id.toggleButton36);
        
        // リスナーの登録
        tb1.setOnCheckedChangeListener(this);
        tb2.setOnCheckedChangeListener(this);
        tb3.setOnCheckedChangeListener(this);
        tb4.setOnCheckedChangeListener(this);
        tb5.setOnCheckedChangeListener(this);
        tb6.setOnCheckedChangeListener(this);
        tb7.setOnCheckedChangeListener(this);
        tb8.setOnCheckedChangeListener(this);
        tb9.setOnCheckedChangeListener(this);
        tb10.setOnCheckedChangeListener(this);
        tb11.setOnCheckedChangeListener(this);
        tb12.setOnCheckedChangeListener(this);
        tb13.setOnCheckedChangeListener(this);
        tb14.setOnCheckedChangeListener(this);
        tb15.setOnCheckedChangeListener(this);
        tb16.setOnCheckedChangeListener(this);
        tb17.setOnCheckedChangeListener(this);
        tb18.setOnCheckedChangeListener(this);
        tb19.setOnCheckedChangeListener(this);
        tb20.setOnCheckedChangeListener(this);
        tb21.setOnCheckedChangeListener(this);
        tb22.setOnCheckedChangeListener(this);
        tb23.setOnCheckedChangeListener(this);
        tb24.setOnCheckedChangeListener(this);
        tb25.setOnCheckedChangeListener(this);
        tb26.setOnCheckedChangeListener(this);
        tb27.setOnCheckedChangeListener(this);
        tb28.setOnCheckedChangeListener(this);
        tb29.setOnCheckedChangeListener(this);
        tb30.setOnCheckedChangeListener(this);
        tb31.setOnCheckedChangeListener(this);
        tb32.setOnCheckedChangeListener(this);
        tb33.setOnCheckedChangeListener(this);
        tb34.setOnCheckedChangeListener(this);
        tb35.setOnCheckedChangeListener(this);
        tb36.setOnCheckedChangeListener(this);
	}
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			int tbid = buttonView.getId();
			
			if (tbid == R.id.toggleButton1) {
				this.calc(770, isChecked);
				this.reWrite(R.drawable.menu01, isChecked, 5);
			} else if (tbid  == R.id.toggleButton2) {
				this.calc(750, isChecked);
				this.reWrite(R.drawable.menu02, isChecked, 2);
			} else if (tbid  == R.id.toggleButton3) {
				this.calc(800, isChecked);
				this.reWrite(R.drawable.menu03, isChecked, 9);
		    } else if (tbid  == R.id.toggleButton4) {
				this.calc(850, isChecked);
				this.reWrite(R.drawable.menu04, isChecked, 6);
		    } else if (tbid  == R.id.toggleButton5) {
				this.calc(900, isChecked);
				this.reWrite(R.drawable.menu05, isChecked, 10);
		    } else if (tbid  == R.id.toggleButton6) {
				this.calc(750, isChecked);
				this.reWrite(R.drawable.menu06, isChecked, 0);
		    } else if (tbid  == R.id.toggleButton7) {
				this.calc(830, isChecked);
				this.reWrite(R.drawable.menu07, isChecked, 5);
		    } else if (tbid  == R.id.toggleButton8) {
				this.calc(850, isChecked);
				this.reWrite(R.drawable.menu08, isChecked, 7);
		    } else if (tbid  == R.id.toggleButton9) {
				this.calc(770, isChecked);
				this.reWrite(R.drawable.menu09, isChecked, 10);
		    } else if (tbid  == R.id.toggleButton10) {
				this.calc(380, isChecked);
				this.reWrite(R.drawable.menu10, isChecked, 10);
		    } else if (tbid  == R.id.toggleButton11) {
				this.calc(750, isChecked);
				this.reWrite(R.drawable.menu11, isChecked ,1);
		    } else if (tbid  == R.id.toggleButton12) {
				this.calc(750, isChecked);
				this.reWrite(R.drawable.menu12, isChecked, 3);
		    } else if (tbid  == R.id.toggleButton13) {
				this.calc(170, isChecked);
				this.reWrite(R.drawable.menu13, isChecked, 5);
		    } else if (tbid  == R.id.toggleButton14) {
				this.calc(800, isChecked);
				this.reWrite(R.drawable.menu14, isChecked, 5);
		    } else if (tbid  == R.id.toggleButton15) {
				this.calc(480, isChecked);
				this.reWrite(R.drawable.menu15, isChecked, 5);
		    } else if (tbid  == R.id.toggleButton16) {
				this.calc(580, isChecked);
		    } else if (tbid  == R.id.toggleButton17) {
				this.calc(60, isChecked);
				this.reWrite(R.drawable.menu17, isChecked, 0);
		    } else if (tbid  == R.id.toggleButton18) {
				this.calc(110, isChecked);				
		    } else if (tbid  == R.id.toggleButton19) {
				this.calc(160, isChecked);
				this.reWrite(R.drawable.menu19, isChecked, 0);
		    } else if (tbid  == R.id.toggleButton20) {
				this.calc(110, isChecked);
				this.reWrite(R.drawable.menu20, isChecked, 0);
		    } else if (tbid  == R.id.toggleButton21) {
				this.calc(120, isChecked);
				this.reWrite(R.drawable.menu21, isChecked, 5);
		    } else if (tbid  == R.id.toggleButton22) {
				this.calc(60, isChecked);
		    } else if (tbid  == R.id.toggleButton23) {
				this.calc(60, isChecked);
				this.reWrite(R.drawable.menu23, isChecked, 5);
		    } else if (tbid  == R.id.toggleButton24) {
				this.calc(170, isChecked);
				this.reWrite(R.drawable.menu24, isChecked, 2);
		    } else if (tbid  == R.id.toggleButton25) {
				this.calc(170, isChecked);
				this.reWrite(R.drawable.menu25, isChecked, 10);
		    } else if (tbid  == R.id.toggleButton26) {
				this.calc(60, isChecked);
		    } else if (tbid  == R.id.toggleButton27) {
				this.calc(60, isChecked);
				this.reWrite(R.drawable.menu27, isChecked, 0);
		    } else if (tbid  == R.id.toggleButton28) {
				this.calc(60, isChecked);
		    } else if (tbid  == R.id.toggleButton29) {
				this.calc(60, isChecked);
		    } else if (tbid  == R.id.toggleButton30) {
				this.calc(200, isChecked);
				this.reWrite(R.drawable.menu30, isChecked, 0);
		    } else if (tbid  == R.id.toggleButton31) {
				this.calc(60, isChecked);
				this.reWrite(R.drawable.menu31, isChecked, 0);
		    } else if (tbid  == R.id.toggleButton32) {
				this.calc(110, isChecked);
				this.reWrite(R.drawable.menu32, isChecked, 0);
		    } else if (tbid  == R.id.toggleButton33) {
				this.calc(160, isChecked);
				this.reWrite(R.drawable.menu33, isChecked, 0);
		    } else if (tbid  == R.id.toggleButton34) {
				this.calc(500, isChecked);
				this.reWrite(R.drawable.menu34, isChecked, 0);
		    } else if (tbid  == R.id.toggleButton35) {
				this.calc(200, isChecked);
				this.reWrite(R.drawable.menu35, isChecked, 0);
		    } else if (tbid  == R.id.toggleButton36) {
				this.calc(200, isChecked);
				this.reWrite(R.drawable.menu36, isChecked, 0);
			}
			
			

			TextView textview1 = (TextView)this.findViewById(R.id.textView1);
			textview1.setText("合計: " + sum + "円");
			
		}
		
		private void calc(int price, boolean isChecked) {
			if(isChecked == true) {
				sum+=price;
			} else {
				sum-=price;
			}
		}

		private void reWrite(int picture, boolean isChecked, int spice) {
			MyView myview = (MyView)this.findViewById(R.id.myview1);
			Resources res = getResources();
			String hoshi = "";
			if(isChecked == true) {
				myview.bitmap = BitmapFactory.decodeResource(res, picture);
				for(int i=0; i<spice; i++) {
					hoshi+="★";
				}
				TextView textview2 = (TextView)this.findViewById(R.id.textView2);
				textview2.setText("辛さ: " + hoshi);
			} else {
				myview.bitmap = BitmapFactory.decodeResource(res, R.drawable.top);
				TextView textview2 = (TextView)this.findViewById(R.id.textView2);
				textview2.setText("");
			}
			myview.invalidate();
		}
		
		/*ToggleButton toggle1 = (ToggleButton)this.findViewById(R.id.toggleButton1);
		ToggleButton toggle2 = (ToggleButton)this.findViewById(R.id.toggleButton2);
		
		toggle1.setOnCheckedChangeListener(new OnCheckedChangeListener(){
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
				int m = 770;
				MyView myview = (MyView)activity.findViewById(R.id.myview1);
				Resources res = getResources();
				if(isChecked == true){
					sum = sum + m;
					myview.bitmap = BitmapFactory.decodeResource(res, R.drawable.menu01);

				} else {
					sum = sum - m;
					myview.bitmap = BitmapFactory.decodeResource(res, R.drawable.top);
				}
				myview.invalidate();
				TextView textview = (TextView)activity.findViewById(R.id.textView1);
				textview.setText("合計: " + sum + "円");
			}

		});
		toggle2.setOnCheckedChangeListener(new OnCheckedChangeListener(){
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
				int m = 60;
				if(isChecked == true){
					sum = sum + m;
				} else {
					sum = sum - m;
				}
				TextView textview = (TextView)activity.findViewById(R.id.textView1);
				textview.setText("合計: " + sum + "円");
			}

		});
		
	}*/
}