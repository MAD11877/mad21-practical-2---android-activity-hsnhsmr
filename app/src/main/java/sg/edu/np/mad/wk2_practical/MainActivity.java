package sg.edu.np.mad.wk2_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User u = new User();
        Button b = findViewById(R.id.button);
        if (u.getFollowed() == true)
        {
            b.setText("Unfollow");
        }
        else
        {
            b.setText("Follow");
        }
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean status = u.getFollowed();
                if (status == true)
                    b.setText("Unfollow");
                else
                    b.setText("Follow");
            }
        });
    }
}