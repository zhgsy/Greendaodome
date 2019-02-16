package com.bw.com.greendaodome.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.provider.CalendarContract;

import com.example.kson.greendao.DaoMaster;
import com.example.kson.greendao.DaoSession;

public class GreendaoUtils {
    private static GreendaoUtils minstance;
    private GreendaoUtils(){

    }

    /**
     * 双重检索锁
     * @return
     */
    public static GreendaoUtils getInstance(){
        if (minstance==null){
            synchronized (GreendaoUtils.class){
                if (minstance==null){
                    minstance=new GreendaoUtils();
                }
            }
        }
        return minstance;
    }
    /**
     * 初始化GreenDao,直接在Application中进行初始化操作
     */
    public void initGreenDao(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, Constants.DB_NAME);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    private DaoSession daoSession;
    public DaoSession getDaoSession() {
        return daoSession;
    }
}
