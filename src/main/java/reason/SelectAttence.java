package reason;

import substance.Attence;

import java.util.List;

/**
 * Created by dell on 2019/1/23.
 */
public interface SelectAttence {
    public List<Attence> select();
    public int insert(Attence attence);
}
