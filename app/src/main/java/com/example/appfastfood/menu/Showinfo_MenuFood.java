package com.example.appfastfood.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appfastfood.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Showinfo_MenuFood extends AppCompatActivity {

    ImageView showimg;
    TextView showname,showdes;
    Button addbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showinfo_menu_food);

        showimg = findViewById(R.id.imgfood_info);
        showname = findViewById(R.id.namefood_info);
        showdes = findViewById(R.id.desfood_info);
        addbtn = findViewById(R.id.addbtn);

        // Nhận dữ liệu từ intent
        String nameFood = getIntent().getStringExtra("NameFood");
        int imgFood = getIntent().getIntExtra("ImgFood", 0);

        // Hiển thị dữ liệu lên giao diện
        showname.setText(nameFood);
        showimg.setImageResource(imgFood);

        // Cập nhật nội dung truyện dựa trên tên truyện hoặc ID truyện
        String noiDungFood = getNoiDungFood(nameFood);
        showdes.setText(noiDungFood);
    }

    private String getNoiDungFood(String nameFood) {
        // Thêm logic tại đây để lấy nội dung food từ tên food hoặc ID food
        String fileName = "";

        // Thức ăn combo
        if (nameFood.equals("Combo Gà Rán")) {
             fileName = "com1.txt";
        }
        else if (nameFood.equals("Combo Mì Ý")) {
            fileName = "com2.txt";
        }
        else if (nameFood.equals("Combo Salad Hạt")) {
            fileName = "com3.txt";
        }
        else if (nameFood.equals("Combo Burger")) {
            fileName = "com4.txt";
        }
        else if (nameFood.equals("Combo Nhóm 1")) {
            fileName = "com5.txt";
        }
        else if (nameFood.equals("Combo Nhóm 2")) {
            fileName = "com6.txt";
        }
        else if (nameFood.equals("Combo Nhóm 3")) {
            fileName = "com7.txt";
        }

        //Thức ăn chính
        if (nameFood.equals("3 Miếng Gà Rán")) {
            fileName = "main1.txt";
        }
        else if (nameFood.equals("6 Miếng Gà Rán")) {
            fileName = "main2.txt";
        }
        else if (nameFood.equals("Gà Viên (Vừa)")) {
            fileName = "main3.txt";
        }
        else if (nameFood.equals("Gà Viên (Lớn)")) {
            fileName = "main4.txt";
        }
        else if (nameFood.equals("Burger Zinger")) {
            fileName = "main5.txt";
        }
        else if (nameFood.equals("Burger Tôm")) {
            fileName = "main6.txt";
        }
        else if (nameFood.equals("Burger Gà Quay Flava")) {
            fileName = "main7.txt";
        }
        else if (nameFood.equals("Mì Ý Xốt Cà Xúc Xích Gà Viên")) {
            fileName = "main8.txt";
        }
        else if (nameFood.equals("Mì Ý Xốt Cà Xúc Xích Gà Zinger")) {
            fileName = "main9.txt";
        }

        //Thứa ăn phụ
        if (nameFood.equals("1 Bánh Trứng")) {
            fileName = "side1.txt";
        }
        else if (nameFood.equals("4 Bánh Trứng")) {
            fileName = "side2.txt";
        }
        else if (nameFood.equals("2 Viên Khoai Môn Kim Sa")) {
            fileName = "side3.txt";
        }
        else if (nameFood.equals("3 Viên Khoai Môn Kim Sa")) {
            fileName = "side4.txt";
        }
        else if (nameFood.equals("5 Viên Khoai Môn Kim Sa")) {
            fileName = "side5.txt";
        }
        else if (nameFood.equals("2 Thanh Bí Phô Mai")) {
            fileName = "side6.txt";
        }
        else if (nameFood.equals("5 Thanh Bí Phô Mai")) {
            fileName = "side7.txt";
        }

        //Thức Uống
        if (nameFood.equals("Pepsi Lon")) {
            fileName = "drink1.txt";
        }
        else if (nameFood.equals("7Up Lon")) {
            fileName = "drink2.txt";
        }
        else if (nameFood.equals("Aquafina 500ml")) {
            fileName = "drink3.txt";
        }
        else if (nameFood.equals("Trà Đào")) {
            fileName = "drink4.txt";
        }
        else if (nameFood.equals("Pepsi Black Lime Lon")) {
            fileName = "drink5.txt";
        }
        else if (nameFood.equals("Mirinda Cam Lon")) {
            fileName = "drink6.txt";
        }
        else if (nameFood.equals("Trà Chanh Lipton (Lớn)")) {
            fileName = "drink7.txt";
        }
        else if (nameFood.equals("Trà Chanh Lipton (Vừa)")) {
            fileName = "drink8.txt";
        }



        try {
            InputStream inputStream = getAssets().open(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            reader.close();
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "Lỗi khi đọc nội dung food";
        }
        // Cập nhật logic tương ứng với dữ liệu food bạn có
    }
}
