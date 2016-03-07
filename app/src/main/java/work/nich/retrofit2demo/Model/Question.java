
package work.nich.retrofit2demo.Model;

import java.util.HashMap;
import java.util.Map;

public class Question {

    private QuestionAdEntity questionAdEntity;
    private String result;
    private Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * 
     * @return
     *     The questionAdEntity
     */
    public QuestionAdEntity getQuestionAdEntity() {
        return questionAdEntity;
    }

    /**
     * 
     * @param questionAdEntity
     *     The questionAdEntity
     */
    public void setQuestionAdEntity(QuestionAdEntity questionAdEntity) {
        this.questionAdEntity = questionAdEntity;
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
