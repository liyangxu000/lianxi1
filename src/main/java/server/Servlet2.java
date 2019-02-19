package server;

import reason.SelectAttence;
import reason.SeverMen;
import reason.impl.SelectAttenceimpl;
import reason.impl.SeverMenimpl;
import substance.Attence;
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
 * Created by dell on 2009/8/20.
 */
@WebServlet(name = "Servlet2",urlPatterns = "/select")
public class Servlet2 extends HttpServlet {
    SelectAttence am=new SelectAttenceimpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String type= request.getParameter("type");
      if(type==null || type.equals("select")){
          select(request,response);
      }else if (type.equals("insert")){
          insert(request,response);
      }
    }
   public void  select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

       List<Attence>list=am.select();
       request.getSession().setAttribute("list",list);
       response.sendRedirect("5.jsp");
   }
  public void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      request.setCharacterEncoding("utf-8");
      response.setContentType("utf-8");
        String name=  request.getParameter("uname");
      String bumen=  request.getParameter("bumen");
      String riqi=  request.getParameter("riqi");

      Date ab=Date.valueOf(riqi);
      String zhuangtai=  request.getParameter("mid");
      int cm=Integer.valueOf(zhuangtai);
       Attence ac=new Attence();
       ac.setEmpname(name);
       ac.setDept(bumen);
       ac.setChkdate(ab);
       ac.setStatus(cm);
       int al= am.insert(ac);
        if(al==1){
            System.out.println("增加成功");
            select(request,response);
        }else {
            System.out.println("增加失败");
        }

  }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
