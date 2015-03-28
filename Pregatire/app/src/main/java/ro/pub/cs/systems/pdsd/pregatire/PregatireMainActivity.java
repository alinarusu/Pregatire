package ro.pub.cs.systems.pdsd.pregatire;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class PregatireMainActivity extends ActionBarActivity {

    private ButtonClickListener buttonClickListener = new ButtonClickListener();

    private class ButtonClickListener implements Button.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText leftEditText = (EditText)PregatireMainActivity.this.findViewById(R.id.left_edit_text);
            EditText rightEditText = (EditText)PregatireMainActivity.this.findViewById(R.id.right_edit_text);

            int leftButtonClickedNumber = Integer.parseInt(leftEditText.getText().toString());
            int rightButtonClickedNumber = Integer.parseInt(rightEditText.getText().toString());


            switch(v.getId()) {
                case R.id.left_button:
                    leftButtonClickedNumber++;
                    leftEditText.setText(String.valueOf(leftButtonClickedNumber));
                    break;
                case R.id.right_button:
                    rightButtonClickedNumber++;
                    rightEditText.setText(String.valueOf(rightButtonClickedNumber));
                    break;
            }


        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregatire_main);

        EditText leftEditText = (EditText)findViewById(R.id.left_edit_text);
        EditText rightEditText = (EditText)findViewById(R.id.right_edit_text);

        leftEditText.setText(String.valueOf(0));
        rightEditText.setText(String.valueOf(0));

        Button leftButton = (Button)findViewById(R.id.left_button);
        leftButton.setOnClickListener(buttonClickListener);
        Button rightButton = (Button)findViewById(R.id.right_button);
        rightButton.setOnClickListener(buttonClickListener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pregatire_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
