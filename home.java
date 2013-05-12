//This is the home page that gets displayed when the web application is first run <runs in apache-tomcat server>
import java.io.*;
import java.util.*;
 
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class TheWebSite extends HttpServlet {
    protected void doGet( HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        ArrayList<String> pictures = new ArrayList<String>();      
        response.setContentType("text/html");        
        //manipulation to get the images   
        String filename = "/notices/notices.txt";
        ServletContext context = getServletContext();
        //                                          
        // First get the file InputStream using ServletContext.getResourceAsStream()
        // method.
        //
        InputStream is = context.getResourceAsStream(filename);
        if (is != null) {
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader reader = new BufferedReader(isr);
             //PrintWriter writer = response.getWriter();
             String text = "";
             //                                                                                            
             // We read the file line by line and later will be displayed on the 
             // browser page.
             //
             while ((text = reader.readLine()) != null) {
                 pictures.add(text);  		// add to scary
             }                                                                                                                                         
        }        
        // end of pictures, manipulation  
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> CS NOTICEBOARD </title>");
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/mystyle3.css\" />");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"title2\"> </div>");
        out.println("<div class=\"home\"> <a href=\"./TheWebSite\"> </a></div>");
        out.println(" <div class=\"container2\">");        
        out.println("<div class = \"menu\"> </div>");
        //out.println("<br><br><h1 style=\"{position:absolute; text-indent:300px; top:75px;}\">General </h1>");
        //out.println("<h1 style=\"{position:absolute; text-indent:900px; top:75px;}\"> Courses </h1>");
        out.println("</div>");
        String path1 = "";
        int i = 0;
        int size = pictures.size();
        if(!( (path1 = pictures.get(i)) != null) ){
                path1 = "";
        }
        out.println("<div class=\"one\" style=\"{ background:url(notices/"+path1+"); background-size:100% 100%;}\"> </div>");
        i++;
        i=i%size;
        path1 = "success.png";
        if(! ( (path1 = pictures.get(i) ) != null) ){   
             path1 = "spinner.gif";
        }
        out.println("<div class=\"two\" style=\"{ background:url(notices/"+path1+"); background-size:100% 100%;}\"> </div>");
        i++;
        i=i%size;
        path1 = "success.png";
        if(!( (path1 = pictures.get(i)) != null)){   
             path1 = "spinner.gif";
        }
        out.println("<div class=\"three\" style=\"{ background:url(notices/"+path1+"); background-size:100% 100%;}\"> </div>");
        i++;
        i=i%size;
        path1 = "success.png";
        if(!( (path1 = pictures.get(i)) != null)){   
             path1 = "spinner.gif";
        }
        out.println("<div class=\"four\" style=\"{ background:url(notices/"+path1+"); background-size:100% 100%;}\"> </div>");
        i++;
        i=i%size;
        path1 = "success.png";
        if(!( (path1 = pictures.get(i)) != null)){   
                path1 = "spinner.gif";
        }
        out.println("<div class=\"five\" style=\"{ background:url(notices/"+path1+");background-size:100% 100%; }\"> </div>");
        i++;
        i=i%size;
        path1 = "success.png";
        if(!( (path1 = pictures.get(i) ) != null) ){   
              path1 = "spinner.gif";
        }
        out.println("<div class=\"six\" style=\"{ background:url(notices/"+path1+"); background-size:100% 100%;}\"> </div>");
        i++;
        i=i%size;
        path1 = "success.png";
        if(!( (path1 = pictures.get(i)) != null)){   
             path1 = "spinner.gif";
        }
        out.println("<div class=\"postgrad\" style=\"{ background:url(notices/"+path1+"); background-size:100% 100%;}\"> </div>");
        out.println("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
        out.println("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
        out.println("<br><br><br><br><br><br><h2  style=\" text-indent:100px; color:#009900\" >There are: "+size+" notices available</h2></div>");
        out.println("<div class=\"container1\"> ");
        //out.println("<br><br><h1 style=\"{position:absolute; text-indent:300px; top:75px;}\">Careers </h1>");
        //out.println("<h1 style=\"{position:absolute; text-indent:900px; top:75px;}\">New Stuff </h1>");
        out.println("<div class=\"one\" > This element has 1 been added successfully</div>");
        out.println("<div class=\"two\"> This element has 2 been added successfully</div>");
        out.println("<div class=\"three\"> This element 3 has been added successfully</div>");
        out.println("<div class=\"four\"> This element 4 has been added successfully</div>");
        out.println("<div class=\"five\"> This element 5 has been added successfully</div>");
        out.println("<div class=\"six\"> This element 6 has been added successfully</div>");
        out.println("<h2> This element 6 has been added successfully</h2>");
        out.println("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
