package com.example.android.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int counter = 1;
    int trial1=1;
    int trial2=1;
    int trial3=1;
    int trial4=1;
    int trial5=1;
    int trial6=1;
    int trial7=1;
    int trial8=1;
    int trial9=1;
    int draw=0;
    int[][] check = {
            {10,2,3},
            {4,5,6},
            {7,8,9}
    };


    public void one(View view) {
        TextView player = (TextView) findViewById(R.id.players);
        TextView textView = (TextView) findViewById(R.id.one);
        if(trial1==1) {
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                textView.setText("X");
                player.setText("Player 2");
                counter++;
                result(0,0,1);
            } else if (counter == 2 || counter == 4 || counter == 6 || counter == 8) {
                textView.setText("0");
                player.setText("Player 1");
                counter++;
                result(0,0,0);
            }
        }
        trial1=2;
    }


    public void two(View view){
        TextView player = (TextView)findViewById(R.id.players);
        TextView textView = (TextView) findViewById(R.id.two);
        if(trial2==1) {
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                textView.setText("X");
                player.setText("Player 2");
                counter++;
                result(0,1,1);
            } else if (counter == 2 || counter == 4 || counter == 6 || counter == 8) {
                textView.setText("0");
                player.setText("Player 1");
                counter++;
                result(0,1,0);
            }
        }
        trial2=2;
    }

    public void three(View view){
        TextView player = (TextView)findViewById(R.id.players);
        TextView textView = (TextView) findViewById(R.id.three);
        if(trial3==1) {
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                textView.setText("X");
                player.setText("Player 2");
                counter++;
                result(0,2,1);
            } else if (counter == 2 || counter == 4 || counter == 6 || counter == 8) {
                textView.setText("0");
                player.setText("Player 1");
                counter++;
                result(0,2,0);
            }
        }
        trial3=2;
    }

    public void four(View view){
        TextView player = (TextView)findViewById(R.id.players);
        TextView textView = (TextView) findViewById(R.id.four);
        if(trial4==1) {
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                textView.setText("X");
                player.setText("Player 2");
                counter++;
                result(1,0,1);
            } else if (counter == 2 || counter == 4 || counter == 6 || counter == 8) {
                textView.setText("0");
                player.setText("Player 1");
                counter++;
                result(1,0,0);
            }
        }
        trial4=2;
    }

    public void five(View view){
        TextView player = (TextView)findViewById(R.id.players);
        TextView textView = (TextView) findViewById(R.id.five);
        if(trial5==1) {
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                textView.setText("X");
                player.setText("Player 2");
                counter++;
                result(1,1,1);
            } else if (counter == 2 || counter == 4 || counter == 6 || counter == 8) {
                textView.setText("0");
                player.setText("Player 1");
                counter++;
                result(1,1,0);
            }
        }
        trial5=2;
    }

    public void six(View view){
        TextView player = (TextView)findViewById(R.id.players);
        TextView textView = (TextView) findViewById(R.id.six);
        if(trial6==1) {
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                textView.setText("X");
                player.setText("Player 2");
                counter++;
                result(1,2,1);
            } else if (counter == 2 || counter == 4 || counter == 6 || counter == 8) {
                textView.setText("0");
                player.setText("Player 1");
                counter++;
                result(1,2,0);
            }
        }
        trial6=2;
    }

    public void seven(View view){
        TextView player = (TextView)findViewById(R.id.players);
        TextView textView = (TextView) findViewById(R.id.seven);
        if(trial7==1) {
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                textView.setText("X");
                player.setText("Player 2");
                counter++;
                result(2,0,1);
            } else if (counter == 2 || counter == 4 || counter == 6 || counter == 8) {
                textView.setText("0");
                player.setText("Player 1");
                counter++;
                result(2,0,0);
            }
        }
        trial7=2;
    }

    public void eight(View view){
        TextView player = (TextView)findViewById(R.id.players);
        TextView textView = (TextView) findViewById(R.id.eight);
        if(trial8==1) {
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                textView.setText("X");
                player.setText("Player 2");
                counter++;
                result(2,1,1);
            } else if (counter == 2 || counter == 4 || counter == 6 || counter == 8) {
                textView.setText("0");
                player.setText("Player 1");
                counter++;
                result(2,1,0);
            }
        }
        trial8=2;
    }

    public void nine(View view){
        TextView player = (TextView)findViewById(R.id.players);
        TextView textView = (TextView) findViewById(R.id.nine);
        if(trial9==1) {
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                textView.setText("X");
                player.setText("Player 2");
                counter++;
                result(2,2,1);
            } else if (counter == 2 || counter == 4 || counter == 6 || counter == 8) {
                textView.setText("0");
                player.setText("Player 1");
                counter++;
                result(2,2,0);
            }
        }
        trial9=2;
    }
    public void result(int x, int y, int z) {
        check[x][y] = z;
        draw++;
        int line;
        for (line = 0; line <= 2; line++) {
            if ((check[line][0] == check[line][1] && check[line][0] == check[line][2]) ||
                    (check[0][line] == check[1][line] && check[0][line] == check[2][line]) ) {
                winner(z);
            }
            else if((check[0][0] == check[1][1] && check[0][0] == check[2][2]) ||
                    (check[0][2] == check[1][1] && check[0][2] == check[2][0])) {
                winner(z);
            }
            else if(draw==9){
                winner(3);}

        }
    }

    public void winner(int p){
        TextView textView = (TextView) findViewById(R.id.winner);
        if (p==1)
            textView.setText("Player 1 Wins");
        else if(p==0)
            textView.setText("Player 2 Wins");
        else if(p==3)
            textView.setText("Match Drawn");
        counter=10;
    }

    public void reset(View view){
        TextView textView1= (TextView) findViewById(R.id.one);
        textView1.setText("1");
        TextView textView2= (TextView) findViewById(R.id.two);
        textView2.setText("2");
        TextView textView3= (TextView) findViewById(R.id.three);
        textView3.setText("3");
        TextView textView4= (TextView) findViewById(R.id.four);
        textView4.setText("4");
        TextView textView5= (TextView) findViewById(R.id.five);
        textView5.setText("5");
        TextView textView6= (TextView) findViewById(R.id.six);
        textView6.setText("6");
        TextView textView7= (TextView) findViewById(R.id.seven);
        textView7.setText("7");
        TextView textView8= (TextView) findViewById(R.id.eight);
        textView8.setText("8");
        TextView textView9= (TextView) findViewById(R.id.nine);
        textView9.setText("9");
        TextView textView10 = (TextView) findViewById(R.id.winner);
        textView10.setText("");
        TextView textView11 = (TextView) findViewById(R.id.players);
        textView11.setText("Player 1");
        counter = 1;
        trial1=1;
        trial2=1;
        trial3=1;
        trial4=1;
        trial5=1;
        trial6=1;
        trial7=1;
        trial8=1;
        trial9=1;
        draw=0;
        check = new int[][]{
                {10, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

    }
}

