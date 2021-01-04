package java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet(name = "Servlet",urlPatterns = "/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String item = request.getParameter("searchtext");
        if(item.equals("")) {
            System.out.println("Invalid request!");
        }
        else {
            int corecount = Runtime.getRuntime().availableProcessors();
            System.out.println(corecount);
            String dir = "C:\\Users\\troy9\\IdeaProjects\\Assignment1_APJ2\\src\\directory\\";
            File directory = new File(dir);
            File[] files = directory.listFiles();
            Thread[] threads = new Thread[corecount];

            for (int i = 0, k = 0; i < files.length;i++,k=(k+1)%corecount) {
                threads[k] = new Thread_1(files[i]);
                threads[k].start();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
