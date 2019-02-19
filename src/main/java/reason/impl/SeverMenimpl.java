package reason.impl;

import dao.MembersinfoDao;
import dao.impl.Membersinfoimpl;
import reason.SeverMen;
import substance.Membersinfo;

import java.util.List;

/**
 * Created by dell on 2018/12/23.
 */
public class SeverMenimpl implements SeverMen {
    MembersinfoDao am=new Membersinfoimpl();
    @Override
    public List<Membersinfo> select() {
        return am.select();
    }

    @Override
    public List<Membersinfo> selectadd(int id) {
        return am.selectadd(id);
    }

    @Override
    public int insert(Membersinfo membersinfo) {

        return am.insert(membersinfo);
    }
}
