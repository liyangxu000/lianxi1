package reason.impl;

import dao.MeetingroomDao;
import dao.impl.Meetingroomimpl;
import reason.SelectMeeting;
import substance.Meetingroom;

import java.util.List;

/**
 * Created by dell on 2018/12/23.
 */
public class SelectMeetingimpl implements SelectMeeting{
    MeetingroomDao am=new Meetingroomimpl();
    @Override
    public List<Meetingroom> select() {
        return am.select();
    }

    @Override
    public int insert(Meetingroom meetingroom) {
        return am.insert(meetingroom);
    }
}
