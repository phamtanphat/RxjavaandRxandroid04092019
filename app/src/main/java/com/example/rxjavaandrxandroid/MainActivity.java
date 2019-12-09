package com.example.rxjavaandrxandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.Callable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    MylifeActivity mylifeActivity;
    Button btnIn;
    EditText edtPhone;
    TextView txtPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mylifeActivity = ViewModelProviders.of(this).get(MylifeActivity.class);
        btnIn = findViewById(R.id.buttonIn);
        edtPhone = findViewById(R.id.edtPhone);
        txtPhone = findViewById(R.id.tvPhone);

        Log.d("BBB",mylifeActivity.phone);
        btnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = edtPhone.getText().toString();
                mylifeActivity.phone = phone;
                txtPhone.setText(phone);
            }
        });
    }
    // Rxjava ,rxandroid :
//        + Observable :
//        - Cục data tạo dữ liệu just , defer ..
//        - Cục data bắn thông tin ra subscribe
//        - Cục data muốn tạo được trên luồng khác subscribeOn :
//              Schedulers.newThread()(Luồng phụ)
//              AndroidSchedulers.mainThread(Luồng chính)
//         -Cục data có quyền quyết định dữ liệu bắn trên luồng nào theo observeOn
//        +Observer : onNext , onError , onComplete

    // LifeCycle Aware Component
    // Quản lý vòng đời các class có LifeCycleOwner
    // Annotation là các event hoặc state trong việc nhận biết vòng đời của Activity
    // Class sử dụng thì phải kế thừa LifeCycleObserve
    // Thằng nào muốn truyền lifecycle : getLife.addObserve(mylifeActivity)

    // Tính bất biến dữ liệu : mutableLifeData
    // setvalue thay đổi dữ liệu và nó sẽ tự chạy method onChange trong đối tượng
    // postValue dùng luồng phụ không được để trong luồng chính

    // ViewModel : giữ lại giá trị cho activity nếu activity bị reset

}
