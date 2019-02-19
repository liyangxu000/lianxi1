package dao.impl;
import dao.BaseDao;
import dao.MembersinfoDao;
import substance.Membersinfo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2018/12/23.
 */
public class Membersinfoimpl extends BaseDao implements MembersinfoDao {
    @Override
    public List<Membersinfo> select() {
        connections();
        List<Membersinfo>list=new ArrayList<>();
        String sql="select * from membersinfo";
        try {
            pstmt= conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while (rs.next()){
                Membersinfo am=new Membersinfo();
                am.setMid(rs.getInt("mid"));
                am.setMname(rs.getString("mname"));
                am.setMgender(rs.getString("mgender"));
                am.setMage(rs.getInt("mage"));
                am.setMaddress(rs.getString("maddress"));
                am.setMemail(rs.getString("memail"));
                list.add(am);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Membersinfo> selectadd(int id) {
        connections();
        List<Membersinfo>list=new ArrayList<>();
        String sql="select * from membersinfo where mid=?";
        try {
            pstmt= conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            rs=pstmt.executeQuery();
            while (rs.next()){
                Membersinfo am=new Membersinfo();
                am.setMid(rs.getInt("mid"));
                am.setMname(rs.getString("mname"));
                am.setMgender(rs.getString("mgender"));
                am.setMage(rs.getInt("mage"));
                am.setMaddress(rs.getString("maddress"));
                am.setMemail(rs.getString("memail"));
                list.add(am);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int insert(Membersinfo membersinfo) {
        String sql="UPDATE membersinfo set mname=?,mgender=?,mage=?,maddress=?,memail=? where mid=?";

        Object oj[]={
                membersinfo.getMname(),
                membersinfo.getMgender().toString().trim(),
                membersinfo.getMage(),
                membersinfo.getMaddress(),
                membersinfo.getMemail(),
                membersinfo.getMid()
        };
        return executeUpdate(sql,oj);
    }
}
