package locpt152.ntu.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //khai báo
    EditText editSoA, editSoB;
    TextView textviewKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editSoA = (EditText)findViewById(R.id.edSoA);
        editSoB = (EditText)findViewById(R.id.edSoB);
        textviewKQ = (TextView)findViewById(R.id.tvKQ);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);
    }

    //hàm xử lý
    public void XuLyCong(View v) {
        //lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //chuyển sang kiểu số
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tính tổng
        int tong = a+b;
        String chuoiTong = String.valueOf(tong);
        //Xuất kq
        textviewKQ.setText("Tổng là:" + chuoiTong);
    }

    public void XuLyTru(View v) {
        //lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //chuyển sang kiểu số
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tính hiệu
        int hieu = a-b;
        String chuoiHieu = String.valueOf(hieu);
        //Xuất kq
        textviewKQ.setText("Hiệu là:" + chuoiHieu);
    }

    public void XuLyNhan (View v) {
        //lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //chuyển sang kiểu số
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tính tích
        int tich = a*b;
        String chuoiNhan = String.valueOf(tich);
        //Xuất kq
        textviewKQ.setText("Tích là:" + chuoiNhan);
    }

    public void XuLyChia(View v) {
        //lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //chuyển sang kiểu số
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tính Chia
        int chia = a/b;
        String chuoiChia = String.valueOf(chia);
        //Xuất kq
        textviewKQ.setText("Chia là:" + chuoiChia);
    }

}