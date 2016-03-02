package work.nich.retrofit2demo.Model;

/**
 * Created by nich- on 2016/2/29.
 */
public class Question {

    private String marketTime;
    private String title;
    private String questionUrl;

    public String getMarketTime() {
        return marketTime;
    }

    public void setMarketTime(String marketTime) {
        this.marketTime = marketTime;
    }

    public Question(String marketTime, String title, String questionUrl) {
        this.marketTime = marketTime;

        this.title = title;
        this.questionUrl = questionUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestionUrl() {
        return questionUrl;
    }

    public void setQuestionUrl(String questionUrl) {
        this.questionUrl = questionUrl;
    }
}

