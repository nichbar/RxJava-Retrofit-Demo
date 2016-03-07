
package work.nich.retrofit2demo.Model;

import java.util.HashMap;
import java.util.Map;

public class QuestionAdEntity {

    private EntQNCmt entQNCmt;
    private String strLastUpdateDate;
    private String strDayDiffer;
    private String sWebLk;
    private String strPraiseNumber;
    private String strQuestionId;
    private String strQuestionTitle;
    private String strQuestionContent;
    private String strAnswerTitle;
    private String strAnswerContent;
    private String strQuestionMarketTime;
    private String sEditor;
    private Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * 
     * @return
     *     The entQNCmt
     */
    public EntQNCmt getEntQNCmt() {
        return entQNCmt;
    }

    /**
     * 
     * @param entQNCmt
     *     The entQNCmt
     */
    public void setEntQNCmt(EntQNCmt entQNCmt) {
        this.entQNCmt = entQNCmt;
    }

    /**
     * 
     * @return
     *     The strLastUpdateDate
     */
    public String getStrLastUpdateDate() {
        return strLastUpdateDate;
    }

    /**
     * 
     * @param strLastUpdateDate
     *     The strLastUpdateDate
     */
    public void setStrLastUpdateDate(String strLastUpdateDate) {
        this.strLastUpdateDate = strLastUpdateDate;
    }

    /**
     * 
     * @return
     *     The strDayDiffer
     */
    public String getStrDayDiffer() {
        return strDayDiffer;
    }

    /**
     * 
     * @param strDayDiffer
     *     The strDayDiffer
     */
    public void setStrDayDiffer(String strDayDiffer) {
        this.strDayDiffer = strDayDiffer;
    }

    /**
     * 
     * @return
     *     The sWebLk
     */
    public String getSWebLk() {
        return sWebLk;
    }

    /**
     * 
     * @param sWebLk
     *     The sWebLk
     */
    public void setSWebLk(String sWebLk) {
        this.sWebLk = sWebLk;
    }

    /**
     * 
     * @return
     *     The strPraiseNumber
     */
    public String getStrPraiseNumber() {
        return strPraiseNumber;
    }

    /**
     * 
     * @param strPraiseNumber
     *     The strPraiseNumber
     */
    public void setStrPraiseNumber(String strPraiseNumber) {
        this.strPraiseNumber = strPraiseNumber;
    }

    /**
     * 
     * @return
     *     The strQuestionId
     */
    public String getStrQuestionId() {
        return strQuestionId;
    }

    /**
     * 
     * @param strQuestionId
     *     The strQuestionId
     */
    public void setStrQuestionId(String strQuestionId) {
        this.strQuestionId = strQuestionId;
    }

    /**
     * 
     * @return
     *     The strQuestionTitle
     */
    public String getStrQuestionTitle() {
        return strQuestionTitle;
    }

    /**
     * 
     * @param strQuestionTitle
     *     The strQuestionTitle
     */
    public void setStrQuestionTitle(String strQuestionTitle) {
        this.strQuestionTitle = strQuestionTitle;
    }

    /**
     * 
     * @return
     *     The strQuestionContent
     */
    public String getStrQuestionContent() {
        return strQuestionContent;
    }

    /**
     * 
     * @param strQuestionContent
     *     The strQuestionContent
     */
    public void setStrQuestionContent(String strQuestionContent) {
        this.strQuestionContent = strQuestionContent;
    }

    /**
     * 
     * @return
     *     The strAnswerTitle
     */
    public String getStrAnswerTitle() {
        return strAnswerTitle;
    }

    /**
     * 
     * @param strAnswerTitle
     *     The strAnswerTitle
     */
    public void setStrAnswerTitle(String strAnswerTitle) {
        this.strAnswerTitle = strAnswerTitle;
    }

    /**
     * 
     * @return
     *     The strAnswerContent
     */
    public String getStrAnswerContent() {
        return strAnswerContent;
    }

    /**
     * 
     * @param strAnswerContent
     *     The strAnswerContent
     */
    public void setStrAnswerContent(String strAnswerContent) {
        this.strAnswerContent = strAnswerContent;
    }

    /**
     * 
     * @return
     *     The strQuestionMarketTime
     */
    public String getStrQuestionMarketTime() {
        return strQuestionMarketTime;
    }

    /**
     * 
     * @param strQuestionMarketTime
     *     The strQuestionMarketTime
     */
    public void setStrQuestionMarketTime(String strQuestionMarketTime) {
        this.strQuestionMarketTime = strQuestionMarketTime;
    }

    /**
     * 
     * @return
     *     The sEditor
     */
    public String getSEditor() {
        return sEditor;
    }

    /**
     * 
     * @param sEditor
     *     The sEditor
     */
    public void setSEditor(String sEditor) {
        this.sEditor = sEditor;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
