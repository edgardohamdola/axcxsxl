package wsid.acsl.rule;

/**
 * Created by edg on 6/28/2017.
 */

public class rule {

    private String rulepoint;
    private String ruledesc;

    public rule(String rulepoint, String ruledesc){
        this.rulepoint = rulepoint;
        this.ruledesc = ruledesc;

    }

    public String getrulepoint(){
        return rulepoint;
    }

    public void setrulepoint(String rulepoint){
        this.rulepoint = rulepoint;
    }

    public String getruledesc(){
        return ruledesc;
    }

    public void setruledesc(String ruledesc){
        this.ruledesc = ruledesc;
    }
}
