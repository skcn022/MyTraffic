package net.flowdee.mytraffic;

/**
 * Created by som on 20-May-17.
 */

public class MyData {

    // Explicit
    private String[] titleStrings = new String[]{"หัวข้ออที่ 1", "หัวข้ออที่ 2", "หัวข้ออที่ 3", "หัวข้ออที่ 4", "หัวข้ออที่ 5",
            "หัวข้ออที่ 6", "หัวข้ออที่ 7", "หัวข้ออที่ 8", "หัวข้ออที่ 9", "หัวข้ออที่ 10", "หัวข้ออที่ 11", "หัวข้ออที่ 12", "หัวข้ออที่ 13",
            "หัวข้ออที่ 14", "หัวข้ออที่ 15", "หัวข้ออที่ 16", "หัวข้ออที่ 17", "หัวข้ออที่ 18", "หัวข้ออที่ 19", "หัวข้ออที่ 20" };

    private String[] detailString;

    private int[] ints = new int[]{R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03,
            R.drawable.traffic_04, R.drawable.traffic_05, R.drawable.traffic_06, R.drawable.traffic_07,
            R.drawable.traffic_08, R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11,
            R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14, R.drawable.traffic_15,
            R.drawable.traffic_16, R.drawable.traffic_17, R.drawable.traffic_18, R.drawable.traffic_19,
            R.drawable.traffic_20};

    public int[] getInts() {
        return ints;
    }

    public String[] getTitleStrings() {
        return titleStrings;
    }

    public String[] getDetailString() {

        String[] resultStrings = new String[titleStrings.length];
        String s = "รายละเอียด " ;

        for (int i = 0; i < resultStrings.length; i++ ) {
            resultStrings[i] = s + titleStrings[i] + manyDetail();
        }
        return resultStrings;
    }

    private String manyDetail() {
        String s = "";
        for (int i=0; i < 10; i++ ) {
            s = s + "รายละเอียด ";
        }
        return s;
    }
}  // main card
