package com.weather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2016/7/11.
 */
public class WeatherOpenHelper extends SQLiteOpenHelper {
    private static final String CREATE_RROVINCE = "create table province ("
            + "id integer primary key autoincrement, "
            + "province_name text, "
            + "province_code text)";

    public WeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_RROVINCE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
