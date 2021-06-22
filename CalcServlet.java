import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-21
 * Time: 19:48
 */
public class CalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.方法开头设置通用属性，编码和数据类型
        //设置编码
        response.setCharacterEncoding("utf-8");
        //设置数据类型
        response.setContentType("text/html");
        //2.得到前端的传递的参数
        String num1 = request.getParameter("number1");
        String num2 = request.getParameter("number2");
        //3.进行业逻辑处理
        int total = Integer.parseInt(num1)+Integer.parseInt(num2);
        //4.返回结果给前端
        PrintWriter writer = response.getWriter();
        writer.println(String.format("<h1>计算的结果是：%d</h1>",total));
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
