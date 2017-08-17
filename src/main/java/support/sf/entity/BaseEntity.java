package support.sf.entity;

/**
 * Created by 11544 on 2017/8/17.
 */
public class BaseEntity {
    private String id;
    private String name;
    private int state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
