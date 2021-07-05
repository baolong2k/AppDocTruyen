package com.example.appdoctruyen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ManThongTinApp extends AppCompatActivity {

    TextView txtThongTin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_thong_tin_app);

        txtThongTin = findViewById(R.id.textviewthongtin);

        String thongtin =
                "Chào mừng bạn đến với ứng dụng đọc truyện android của bọn mình"+
                " Ứng dụng được tạo ra bởi Nhóm 1: \n" +
                "- Nguyễn Duy Bảo Long\n" +
                "- Đỗ Trung Đức \n"+
                "- Huỳnh Hải Công Huy \n"+
                "- Nguyễn Văn Tiến \n"+"\n"+
                "Ứng dụng làm ra với mục đích tìm hiểu về Android Studio, cho nên còn nhiều thiếu sót, hy vọng sẽ được mọi người đóng góp í kiến để nhóm phát triển thêm tính năng";
        txtThongTin.setText(thongtin);
    }
}