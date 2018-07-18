package wsid.acsl;

/**
 * Created by edg on 7/16/2017.
 */

public class item_jadwal {
    private int id;
    private String shift;
    private String time;
    private String pj_shift;
    private String ruangan;


    public item_jadwal(int id, String shift, String time, String pj_shift,String ruangan) {
        this.id = id;
        this.shift = shift;
        this.time = time;
        this.pj_shift = pj_shift;
        this.ruangan = ruangan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPj_shift() {
        return pj_shift;
    }

    public void setPj_shift(String pj_shift) {
        this.pj_shift = pj_shift;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {this.ruangan = ruangan;}
}
