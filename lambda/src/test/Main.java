package test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXXZ");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.isLenient());
//        calendar.setLenient(false);
        calendar.set(2021, 1 - 1, 31);
//        System.out.println(sdf.format(calendar.getTime()));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        calendar.add(Calendar.MONTH, 1);
//        System.out.println(sdf.format(calendar.getTime()));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        calendar.add(Calendar.MONTH, -1);
//        System.out.println(sdf.format(calendar.getTime()));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        // 現在日時を取得
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        // Timestampオブジェクトの出力
        System.out.println("timestampオブジェクト:" + timestamp);
        // Date型へ変換
        Date date = new Date(timestamp.getTime());
        // Dateオブジェクトの出力
        System.out.println("Dateオブジェクト:" + date);
        //Timestamp型へ変換
        timestamp = new Timestamp(date.getTime());
        //Timestampオブジェクトの出力
        System.out.println("timestampオブジェクト:" + timestamp);
        String[] s = {"1","2"};
        Arrays.asList(s);
    }
}
