package wsid.acsl.Mhs;

/**
 * Created by edg on 7/24/2017.
 */

public class MhsPost {

    private String postTitle;

    private String postSubTitle;

    private String postShift;

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostSubTitle() {
        return postSubTitle;
    }

    public void setPostSubTitle(String postSubTitle) {
        this.postSubTitle = postSubTitle;
    }

    public String getPostShift() {
        return postShift;
    }

    public void setPostShift(String postShift) {
        this.postShift = postShift;
    }

    public MhsPost(String postTitle, String postSubTitle, String postShift) {
        this.postTitle = postTitle;
        this.postSubTitle = postSubTitle;
        this.postShift = postShift;
    }
}