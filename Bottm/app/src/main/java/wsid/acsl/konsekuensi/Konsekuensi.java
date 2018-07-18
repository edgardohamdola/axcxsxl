package wsid.acsl.konsekuensi;

/**
 * Created by edg on 6/28/2017.
 */

public class Konsekuensi {

    private String konsekuensipoint;
    private String konsekuensidesc;

    public Konsekuensi(String konsekuensipoint, String konsekuensidesc){
        this.konsekuensipoint = konsekuensipoint;
        this.konsekuensidesc = konsekuensidesc;

    }

    public String getkonsekuensipoint(){
        return konsekuensipoint;
    }

    public void setkonsekuensipoint(String konsekuensipoint){
        this.konsekuensipoint = konsekuensipoint;
    }

    public String getkonsekuensidesc(){
        return konsekuensidesc;
    }

    public void setkonsekuensidesc(String konsekuensidesc){
        this.konsekuensidesc = konsekuensidesc;
    }
}
