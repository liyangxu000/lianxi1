package reason;

import substance.Meetingroom;

import java.util.List;

/**
 * Created by dell on 2018/12/23.
 */
public interface SelectMeeting {
    public List<Meetingroom> select();
    public int insert(Meetingroom meetingroom);
}
