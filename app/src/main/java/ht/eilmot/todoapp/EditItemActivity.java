package ht.eilmot.todoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
    }
    public void onSubmit(View v){
        this.finish();

    }
    public void onCreat(Bundle savedIntanceState){
        String todoItem=getIntent().getStringExtra("todoItem");
    }
}
