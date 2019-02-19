package substance;

import java.sql.Date;

/**
 * Created by dell on 2018/12/23.
 */
public class Meetingroom {
  private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;
    private Date  order;
    private String uname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getOrder() {
        return order;
    }

    public void setOrder(Date order) {
        this.order = order;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
