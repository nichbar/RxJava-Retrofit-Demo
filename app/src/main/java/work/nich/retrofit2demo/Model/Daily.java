
package work.nich.retrofit2demo.Model;

import java.util.HashMap;
import java.util.Map;

public class Daily {

    private HpEntity hpEntity;
    private String result;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The hpEntity
     */
    public HpEntity getHpEntity() {
        return hpEntity;
    }

    /**
     * 
     * @param hpEntity
     *     The hpEntity
     */
    public void setHpEntity(HpEntity hpEntity) {
        this.hpEntity = hpEntity;
    }

    /**
     * 
     * @return
     *     The result
     */
    public String getResult() {
        return result;
    }

    /**
     * 
     * @param result
     *     The result
     */
    public void setResult(String result) {
        this.result = result;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
