package tw.edu.ntut.csie.app01_103590054;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    private EditText inputScore;
    private Button gradeButton;
    private TextView gradeView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputScore = (EditText) findViewById(R.id.inputScore);
        gradeButton = (Button) findViewById(R.id.gradeButton);
        gradeView = (TextView) findViewById(R.id.gradeView);
        gradeButton.setOnClickListener(btnOkOnClick);
    }

    private View.OnClickListener btnOkOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            letterGrade lg = new letterGrade();
            if(!inputScore.getText().toString().isEmpty() )
            {
                String score = inputScore.getText().toString();
                try {
                    int num = Integer.parseInt(score);
                    if(num>=0||num<=100)    gradeView.setText(getString(R.string.grade)+lg.letterGrade(num));
                    else gradeView.setText(getString(R.string.error));
                } catch (NumberFormatException e) {
                    gradeView.setText(getString(R.string.error));
                }

            }
            else
            {
                gradeView.setText(getString(R.string.error));
            }
        }
    };
}

