package com.bw.com.greendaodome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.bw.com.greendaodome.entity.UserEntity;
import com.bw.com.greendaodome.utils.GreendaoUtils;
import com.example.kson.greendao.UserEntityDao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 增
     * @param view
     */
    public void zeng(View view) {
        UserEntity userEntity=new UserEntity();
        userEntity.setName("傻缺");
        UserEntityDao userEntityDao = GreendaoUtils.getInstance().getDaoSession().getUserEntityDao();
        userEntityDao.insert(userEntity);

    }
    /**
     * 删
     * @param view
     */
    public void shan(View view) {

    }
    /**
     * 改
     * @param view
     */
    public void gai(View view) {

    }
    /**
     * 查
     * @param view
     */
    public void cha(View view) {

    }
}
