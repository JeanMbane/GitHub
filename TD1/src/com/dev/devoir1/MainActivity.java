package com.dev.devoir1;



import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 final EditText nom=(EditText)findViewById(R.id.editText1);
	     final EditText pass=(EditText)findViewById(R.id.editText2);
		 Button login=(Button)findViewById(R.id.button1);
		 Button rest=(Button)findViewById(R.id.button2);
		 
		 
			login.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					String e="mbane";
					String c="1234";
					String n=nom.getText().toString();
					String p=pass.getText().toString();
			   
				   if(n.equals(e) && p.equals(c))
				   {			   
					   Toast.makeText(MainActivity.this, "welcom",Toast.LENGTH_SHORT).show();	   
				   }
				   else{
					   
					   Toast.makeText(MainActivity.this, "error reset de nouveau",Toast.LENGTH_SHORT).show();
				    }
					
				}
			});
			
			rest.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View org0) {
					// TODO Auto-generated method stub
					nom.setText("");
					pass.setText("");
					
				}
			});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
