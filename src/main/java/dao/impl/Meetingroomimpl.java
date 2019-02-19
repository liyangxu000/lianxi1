package dao.impl;
import dao.BaseDao;
import dao.MeetingroomDao;
import substance.Meetingroom;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2018/12/23.
 */
public class Meetingroomimpl extends BaseDao implements MeetingroomDao {
    @Override
    public List<Meetingroom> select() {
        connections();
     List<Meetingroom>list=new ArrayList<>();
     String sql="select * from MEETINGROOM";
        try {
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while (rs.next()){
                Meetingroom am=new Meetingroom();
                am.setId(rs.getInt("id"));
                am.setName(rs.getString("meeting_name"));
                am.setOrder(rs.getDate("meeting_ordeer"));
                am.setUname(rs.getString("meeting_ordeer"));
                list.add(am);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int insert(Meetingroom meetingroom) {
        String sql="insert into MEETINGROOM values(null,?,?,?)";
        Object ac[]={
                meetingroom.getName(),
                meetingroom.getOrder(),
                meetingroom.getUname()
        };
        return executeUpdate(sql,ac);
    }
}
