package cn.com.cncp.web.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

/**
 * 处理404页面
 *
 * 参考文档https://blog.csdn.net/jwf111/article/details/88571067
 */
@Controller
public class MyErrorController implements ErrorController {
    private static final Logger logger = LoggerFactory.getLogger(MyErrorController.class);



    @RequestMapping("/error")
    public String handleError(HttpServletRequest request){
        logger.info("开始打印错误页面");
        //获取statusCode:401,404,500
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if(statusCode == 500){
            return "/error/500";
        }else if(statusCode == 404){
            //对应的是/error/404.html、/error/404.jsp等，文件位于/templates下面
            return "/error/404";
        }else if(statusCode == 403){
            return "/403";
        }else{
            return "/500";
        }

    }


    @Override
    public String getErrorPath() {
        return "/error";
    }
}
