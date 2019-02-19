package substance;

import java.sql.Date;

/**
 * Created by dell on 2019/1/23.
 */
public class Attence  {
   private int id;
   private String empname;
   private String dept;
   private Date  chkdate;
   private  int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Date getChkdate() {
        return chkdate;
    }

    public void setChkdate(Date chkdate) {
        this.chkdate = chkdate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
