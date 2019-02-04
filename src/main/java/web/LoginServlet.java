package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
/**
 * s1:设置请求端字符编码为utf-8
 * s2:从前端页面获取请求参数
 * s3:如果"king".equals(uname) && "test".equals(pwd)为true
 *    则表示之前登录过的，则获取其session对象，并绑定它的值，
 *    并重定向到welcom.jsp,  否则，在请求端绑定值并给出错误提示，
 *    并转发到"login.jsp";
 * */
public class LoginServlet extends HttpServlet {

        @Override
        protected void service(
                HttpServletRequest request,
                HttpServletResponse response)
					throws ServletException,
                IOException {
            request.setCharacterEncoding("utf-8");

            //读取用户名和密码
            String uname = request.getParameter("uname");
            String pwd = request.getParameter("pwd");

		/*
		 * 查询数据库中是否有匹配条件的记录。
		 * 如果有，则登录成功，返回欢迎页面；
		 * 否则登录失败，提示用户“用户名或密码错误”
		 */
            System.out.println("开始测试！");
            if("King".equals(uname)
                    && "test".equals(pwd)){
                //有匹配条件的记录，登录成功
                System.out.println("方法里面了");

			/*
			 * 将一些数据绑订到session对象上，
			 * 为session验证做准备。
			 */
                HttpSession session =
                        request.getSession();
                session.setAttribute("user", uname);
              //  response.sendRedirect("https://www.baidu.com");

                response.sendRedirect("welcome.jsp");
            }else{
                //没有匹配条件的记录，登录失败
                request.setAttribute("login_failed",
                        "用户名或密码错误");
                request.getRequestDispatcher("login.jsp")
                        .forward(request, response);
            }

        }
}
