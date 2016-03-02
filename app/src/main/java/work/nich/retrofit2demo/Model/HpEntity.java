
package work.nich.retrofit2demo.Model;

import java.util.HashMap;
import java.util.Map;

public class HpEntity {

    private String strLastUpdateDate;
    private String strDayDiffer;
    private String strHpId;
    private String strHpTitle;
    private String strThumbnailUrl;
    private String strOriginalImgUrl;
    private String strAuthor;
    private String strContent;
    private String strMarketTime;
    private String sWebLk;
    private String strPn;
    private String wImgUrl;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The strLastUpdateDate
     */
    public String getStrLastUpdateDate() {
        return strLastUpdateDate;
    }

    /**
     * @param strLastUpdateDate The strLastUpdateDate
     */
    public void setStrLastUpdateDate(String strLastUpdateDate) {
        this.strLastUpdateDate = strLastUpdateDate;
    }

    /**
     * @return The strDayDiffer
     */
    public String getStrDayDiffer() {
        return strDayDiffer;
    }

    /**
     * @param strDayDiffer The strDayDiffer
     */
    public void setStrDayDiffer(String strDayDiffer) {
        this.strDayDiffer = strDayDiffer;
    }

    /**
     * @return The strHpId
     */
    public String getStrHpId() {
        return strHpId;
    }

    /**
     * @param strHpId The strHpId
     */
    public void setStrHpId(String strHpId) {
        this.strHpId = strHpId;
    }

    /**
     * @return The strHpTitle
     */
    public String getStrHpTitle() {
        return strHpTitle;
    }

    /**
     * @param strHpTitle The strHpTitle
     */
    public void setStrHpTitle(String strHpTitle) {
        this.strHpTitle = strHpTitle;
    }

    /**
     * @return The strThumbnailUrl
     */
    public String getStrThumbnailUrl() {
        return strThumbnailUrl;
    }

    /**
     * @param strThumbnailUrl The strThumbnailUrl
     */
    public void setStrThumbnailUrl(String strThumbnailUrl) {
        this.strThumbnailUrl = strThumbnailUrl;
    }

    /**
     * @return The strOriginalImgUrl
     */
    public String getStrOriginalImgUrl() {
        return strOriginalImgUrl;
    }

    /**
     * @param strOriginalImgUrl The strOriginalImgUrl
     */
    public void setStrOriginalImgUrl(String strOriginalImgUrl) {
        this.strOriginalImgUrl = strOriginalImgUrl;
    }

    /**
     * @return The strAuthor
     */
    public String getStrAuthor() {
        return strAuthor;
    }

    /**
     * @param strAuthor The strAuthor
     */
    public void setStrAuthor(String strAuthor) {
        this.strAuthor = strAuthor;
    }

    /**
     * @return The strContent
     */
    public String getStrContent() {
        return strContent;
    }

    /**
     * @param strContent The strContent
     */
    public void setStrContent(String strContent) {
        this.strContent = strContent;
    }

    /**
     * @return The strMarketTime
     */
    public String getStrMarketTime() {
        return strMarketTime;
    }

    /**
     * @param strMarketTime The strMarketTime
     */
    public void setStrMarketTime(String strMarketTime) {
        this.strMarketTime = strMarketTime;
    }

    /**
     * @return The sWebLk
     */
    public String getSWebLk() {
        return sWebLk;
    }

    /**
     * @param sWebLk The sWebLk
     */
    public void setSWebLk(String sWebLk) {
        this.sWebLk = sWebLk;
    }

    /**
     * @return The strPn
     */
    public String getStrPn() {
        return strPn;
    }

    /**
     * @param strPn The strPn
     */
    public void setStrPn(String strPn) {
        this.strPn = strPn;
    }

    /**
     * @return The wImgUrl
     */
    public String getWImgUrl() {
        return wImgUrl;
    }

    /**
     * @param wImgUrl The wImgUrl
     */
    public void setWImgUrl(String wImgUrl) {
        this.wImgUrl = wImgUrl;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
