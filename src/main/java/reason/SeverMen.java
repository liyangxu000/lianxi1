package reason;

import substance.Membersinfo;

import java.util.List;

/**
 * Created by dell on 2018/12/23.
 */
public interface SeverMen {
    public List<Membersinfo> select();
    public List<Membersinfo> selectadd(int id);
    public  int insert(Membersinfo membersinfo);
}
