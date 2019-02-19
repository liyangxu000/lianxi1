package dao.impl;

import dao.AttenceDao;
import dao.BaseDao;
import substance.Attence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2019/1/23.
 */
public class Attenceimpl extends BaseDao implements AttenceDao {
    @Override
    public List<Attence> select() {
        connections();
        List<Attence>list=new ArrayList<>();
        String sql="select * from ATTENCE";
        try {
            pstmt= conn.prepareStatement(sql);
           rs= pstmt.executeQuery();
           while (rs.next()){
               Attence am=new Attence();
               am.setId(rs.getInt("ID"));
               am.setEmpname(rs.getString("EMPNAME"));
               am.setDept(rs.getString("DEPT"));
               am.setChkdate(rs.getDate("CHKDATE"));
               am.setStatus(rs.getInt("STATUS"));
               list.add(am);
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int insert(Attence attence) {
        String sql="insert into ATTENCE values(null,?,?,?,?)";
        Object pa[]={
                attence.getEmpname(),
                attence.getDept(),
                attence.getChkdate(),
                attence.getStatus()
        };
        return executeUpdate(sql,pa);
    }
}
