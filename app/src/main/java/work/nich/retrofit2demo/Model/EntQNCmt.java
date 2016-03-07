
package work.nich.retrofit2demo.Model;

import java.util.HashMap;
import java.util.Map;

public class EntQNCmt {

    private String strId;
    private String strCnt;
    private String strD;
    private String pNum;
    private String upFg;
    private Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * 
     * @return
     *     The strId
     */
    public String getStrId() {
        return strId;
    }

    /**
     * 
     * @param strId
     *     The strId
     */
    public void setStrId(String strId) {
        this.strId = strId;
    }

    /**
     * 
     * @return
     *     The strCnt
     */
    public String getStrCnt() {
        return strCnt;
    }

    /**
     * 
     * @param strCnt
     *     The strCnt
     */
    public void setStrCnt(String strCnt) {
        this.strCnt = strCnt;
    }

    /**
     * 
     * @return
     *     The strD
     */
    public String getStrD() {
        return strD;
    }

    /**
     * 
     * @param strD
     *     The strD
     */
    public void setStrD(String strD) {
        this.strD = strD;
    }

    /**
     * 
     * @return
     *     The pNum
     */
    public String getPNum() {
        return pNum;
    }

    /**
     * 
     * @param pNum
     *     The pNum
     */
    public void setPNum(String pNum) {
        this.pNum = pNum;
    }

    /**
     * 
     * @return
     *     The upFg
     */
    public String getUpFg() {
        return upFg;
    }

    /**
     * 
     * @param upFg
     *     The upFg
     */
    public void setUpFg(String upFg) {
        this.upFg = upFg;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
