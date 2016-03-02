package work.nich.retrofit2demo.utils;

/**
 * Created by nich- on 2016/2/29.
 */
public class OneApi {
    /**
     * 由于One Api的限制，文章和问答 只能获取到最近十天的数据
     */

    public static final String OneBaseUrl = "http://rest.wufazhuce.com/OneForWeb/one/";

    public static final String getDailyHome(String date) {
        return "http://rest.wufazhuce.com/OneForWeb/one/getHp_N?strDate=" + date + "&strRow=1";
    }

    public static final String getDailyArticle(String date, int count) {
        return "http://rest.wufazhuce.com/OneForWeb/one/getC_N?strDate=" + date + "&strRow=" + count;
    }

    public static final String getDailyQuestion(String date, int count) {
        return "http://rest.wufazhuce.com/OneForWeb/one/getQ_N?strDate=" + date + "&strRow=" + count;
    }

}
