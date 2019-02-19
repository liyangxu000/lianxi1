package reason.impl;

import dao.AttenceDao;
import dao.impl.Attenceimpl;
import reason.SelectAttence;
import substance.Attence;

import java.util.List;

/**
 * Created by dell on 2019/1/23.
 */
public class SelectAttenceimpl  implements SelectAttence{
    AttenceDao am=new Attenceimpl();
    @Override
    public List<Attence> select() {
        return am.select();
    }

    @Override
    public int insert(Attence attence) {
        return am.insert(attence);
    }
}
