
package work.nich.retrofit2demo.Model;

import java.util.HashMap;
import java.util.Map;

public class ContentEntity {

    private String strLastUpdateDate;
    private String strContent;
    private String sWebLk;
    private String wImgUrl;
    private String sRdNum;
    private String strPraiseNumber;
    private String strContDayDiffer;
    private String strContentId;
    private String strContTitle;
    private String strContAuthor;
    private String strContAuthorIntroduce;
    private String strContMarketTime;
    private String sGW;
    private String sAuth;
    private String sWbN;
    private String subTitle;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The strContent
     */
    public String getStrContent() {
        return strContent;
    }

    /**
     * 
     * @param strContent
     *     The strContent
     */
    public void setStrContent(String strContent) {
        this.strContent = strContent;
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
     *     The wImgUrl
     */
    public String getWImgUrl() {
        return wImgUrl;
    }

    /**
     * 
     * @param wImgUrl
     *     The wImgUrl
     */
    public void setWImgUrl(String wImgUrl) {
        this.wImgUrl = wImgUrl;
    }

    /**
     * 
     * @return
     *     The sRdNum
     */
    public String getSRdNum() {
        return sRdNum;
    }

    /**
     * 
     * @param sRdNum
     *     The sRdNum
     */
    public void setSRdNum(String sRdNum) {
        this.sRdNum = sRdNum;
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
     *     The strContDayDiffer
     */
    public String getStrContDayDiffer() {
        return strContDayDiffer;
    }

    /**
     * 
     * @param strContDayDiffer
     *     The strContDayDiffer
     */
    public void setStrContDayDiffer(String strContDayDiffer) {
        this.strContDayDiffer = strContDayDiffer;
    }

    /**
     * 
     * @return
     *     The strContentId
     */
    public String getStrContentId() {
        return strContentId;
    }

    /**
     * 
     * @param strContentId
     *     The strContentId
     */
    public void setStrContentId(String strContentId) {
        this.strContentId = strContentId;
    }

    /**
     * 
     * @return
     *     The strContTitle
     */
    public String getStrContTitle() {
        return strContTitle;
    }

    /**
     * 
     * @param strContTitle
     *     The strContTitle
     */
    public void setStrContTitle(String strContTitle) {
        this.strContTitle = strContTitle;
    }

    /**
     * 
     * @return
     *     The strContAuthor
     */
    public String getStrContAuthor() {
        return strContAuthor;
    }

    /**
     * 
     * @param strContAuthor
     *     The strContAuthor
     */
    public void setStrContAuthor(String strContAuthor) {
        this.strContAuthor = strContAuthor;
    }

    /**
     * 
     * @return
     *     The strContAuthorIntroduce
     */
    public String getStrContAuthorIntroduce() {
        return strContAuthorIntroduce;
    }

    /**
     * 
     * @param strContAuthorIntroduce
     *     The strContAuthorIntroduce
     */
    public void setStrContAuthorIntroduce(String strContAuthorIntroduce) {
        this.strContAuthorIntroduce = strContAuthorIntroduce;
    }

    /**
     * 
     * @return
     *     The strContMarketTime
     */
    public String getStrContMarketTime() {
        return strContMarketTime;
    }

    /**
     * 
     * @param strContMarketTime
     *     The strContMarketTime
     */
    public void setStrContMarketTime(String strContMarketTime) {
        this.strContMarketTime = strContMarketTime;
    }

    /**
     * 
     * @return
     *     The sGW
     */
    public String getSGW() {
        return sGW;
    }

    /**
     * 
     * @param sGW
     *     The sGW
     */
    public void setSGW(String sGW) {
        this.sGW = sGW;
    }

    /**
     * 
     * @return
     *     The sAuth
     */
    public String getSAuth() {
        return sAuth;
    }

    /**
     * 
     * @param sAuth
     *     The sAuth
     */
    public void setSAuth(String sAuth) {
        this.sAuth = sAuth;
    }

    /**
     * 
     * @return
     *     The sWbN
     */
    public String getSWbN() {
        return sWbN;
    }

    /**
     * 
     * @param sWbN
     *     The sWbN
     */
    public void setSWbN(String sWbN) {
        this.sWbN = sWbN;
    }

    /**
     * 
     * @return
     *     The subTitle
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * 
     * @param subTitle
     *     The subTitle
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
