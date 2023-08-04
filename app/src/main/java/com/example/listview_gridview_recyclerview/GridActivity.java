package com.example.listview_gridview_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;


public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        GridView gridView = findViewById(R.id.gridView);
        String[] hollywoodActors = {"Cilian Murphy","Dwayne Johnson","Morgan Freeman","Tom Holland","Zendaya","Johny Depp"};
        int[] images = {R.drawable.cilianmurphy,R.drawable.dwaynejohnson,R.drawable.morganfreeman,R.drawable.tomholland,R.drawable.zendaya,R.drawable.johnydepp};

        GridAdapter gridAdapter = new GridAdapter(GridActivity.this,hollywoodActors,images);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showImageInDialog( images[position] );
            }
        });
    }

    public void showImageInDialog(int images){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.show_image_in_custom_dialog);

        ImageView imageViewDialog = dialog.findViewById(R.id.imageViewDialog);
        imageViewDialog.setImageResource(images);

        dialog.show();
    }

}