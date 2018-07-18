package wsid.acsl;

/**
 * Created by edg on 7/16/2017.
 */

public class item_faq {
    private int id;
    private String question;
    private String answer;


    public item_faq(int id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
