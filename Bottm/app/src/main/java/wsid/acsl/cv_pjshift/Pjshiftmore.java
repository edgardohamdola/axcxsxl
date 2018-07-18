package wsid.acsl.cv_pjshift;

/**
 * Created by edg on 6/28/2017.
 */

public class Pjshiftmore {

    private String nama;
    private String shift;
    private String nohp;
    int photoID;

    public Pjshiftmore(String nama, String shift, String nohp, int photoID){
        this.nama = nama;
        this.shift = shift;
        this.nohp = nohp;
        this.photoID = photoID;

    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getShift(){
        return shift;
    }

    public void setShift(String shift){
        this.shift = shift;
    }

    public String getNohp(){
        return nohp;
    }

    public void setNohp(String nohp){
        this.nohp = nohp;
    }

    public int getPhotoID(){
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

}
