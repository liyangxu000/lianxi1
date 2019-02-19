package server;



import reason.SelectMeeting;
import reason.SeverMen;
import reason.impl.SelectMeetingimpl;
import reason.impl.SeverMenimpl;
import substance.Meetingroom;
import substance.Membersinfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

/**
 * Created by dell on 2018/12/23.
 */
@WebServlet(name = "Servlet",urlPatterns = "/sver")
public class Servlet extends HttpServlet {
    SelectMeeting am=new SelectMeetingimpl();
    SeverMen al=new SeverMenimpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("utf-8");
        String type=request.getParameter("type");
      if (type==null || type.equals("select")){
          select(request,response);
      }else if (type.equals("insert")){
          insert(request,response);
      }else if (type==null || type.equals("selectAll")){
          selectAll(request,response);
      }else if(type.equals("selectapp")){
         selectapp(request,response);
      }else if (type.equals("update")){
          System.out.println("s");
          update(request,response);
      }

    }
    public void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       List<Meetingroom>list= am.select();
       request.getSession().setAttribute("list",list);
       response.sendRedirect("1.jsp");

    }
    public  void  insert(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
       String huiyishi=request.getParameter("uid");
        String name=request.getParameter("nameid");
      String shijian=request.getParameter("ushijian");
        //SimpleDateFormat sdf = new SimpleDateFormat();
        try {
           // Date date =  sdf.parse(shijian);
            Meetingroom an=new Meetingroom();
            an.setName(name);
          //  an.setOrder(date);
           an.setOrder(Date.valueOf(shijian));
            an.setUname(huiyishi);
            int ac=am.insert(an);
            if(ac>0){
                System.out.println("增加成功");
                select(request,response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public void  selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Membersinfo>list=al.select();
        request.getSession().setAttribute("list",list);
        response.sendRedirect("3.jsp");
    }

public void selectapp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String Id=request.getParameter("id");
      if(Id!=null){
          int id= Integer.valueOf(Id);
          List<Membersinfo>list=al.selectadd(id);
          request.getSession().setAttribute("list",list);
          response.sendRedirect("4.jsp");
      }
    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("utf-8");
        Membersinfo au=new Membersinfo();
     String id=  request.getParameter("suid");
      int Id=Integer.valueOf(id);
        System.out.println(id);
     String uname=request.getParameter("uname");
        String xingbie=  request.getParameter("xingbie");
        String nianling=  request.getParameter("nian");
        int nian =Integer.valueOf(nianling);
        String dizhi=  request.getParameter("dizhi");
        String youxian=  request.getParameter("you");
       au.setMname(uname);
       au.setMgender(xingbie);
       au.setMage(nian);
       au.setMaddress(dizhi);
       au.setMemail(youxian);
        au.setMid(Id);
       int cm= al.insert(au);
       if(cm==1){
           selectAll(request,response);
       }else {
           selectAll(request,response);
       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doPost(request,response);
    }
}
