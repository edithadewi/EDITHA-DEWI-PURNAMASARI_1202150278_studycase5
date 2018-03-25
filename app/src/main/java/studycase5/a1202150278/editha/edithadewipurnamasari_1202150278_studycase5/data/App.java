package studycase5.a1202150278.editha.edithadewipurnamasari_1202150278_studycase5.data;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;


public class App extends Application {
    public static int getWarna(Context context) {
        SharedPreferences prefs = context.getSharedPreferences("pengaturan", MODE_PRIVATE);
        int warna = prefs.getInt("warna", 0);
        return warna;
    }

    public static int getIndex(Context context) {
        SharedPreferences prefs = context.getSharedPreferences("pengaturan", MODE_PRIVATE);
        int index = prefs.getInt("index", 0);
        return index;
    }

    public static void setWarna(Context context, int kode_warna, int index) {
        SharedPreferences.Editor editor = context.getSharedPreferences("pengaturan", MODE_PRIVATE).edit();
        editor.putInt("warna", kode_warna);
        editor.putInt("index", index);
        editor.apply();
    }
}
