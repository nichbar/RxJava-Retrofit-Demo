
package work.nich.retrofit2demo.Model;

import java.util.HashMap;
import java.util.Map;

public class Article {

    private ContentEntity contentEntity;
    private String result;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The contentEntity
     */
    public ContentEntity getContentEntity() {
        return contentEntity;
    }

    /**
     * 
     * @param contentEntity
     *     The contentEntity
     */
    public void setContentEntity(ContentEntity contentEntity) {
        this.contentEntity = contentEntity;
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
