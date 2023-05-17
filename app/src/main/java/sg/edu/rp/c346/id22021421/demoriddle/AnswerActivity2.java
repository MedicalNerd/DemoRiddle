package sg.edu.rp.c346.id22021421.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AnswerActivity2 extends AppCompatActivity {
TextView tvAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);
        tvAnswer2 = findViewById(R.id.textView);
        Intent intentreceived2 = getIntent();
        String questionSelected2 = intentreceived2.getStringExtra("Question2");
        tvAnswer2.setText(questionSelected2+" answer is : Gone");
    }
}