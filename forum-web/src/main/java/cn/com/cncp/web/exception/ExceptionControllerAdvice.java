package cn.com.cncp.web.exception;

import cn.com.cncp.common.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;


/**
 * 全局异常捕获处理
 * @ControllerAdvice:controller增强器
 *          启动应用后，被 @ExceptionHandler、@InitBinder、@ModelAttribute 注解的方法，都会作用在 被 @RequestMapping 注解的方法上
 *          404错误是不经过Controller的，所以使用@ControllerAdvice或@RestControllerAdvice无法获取到404错误
 *  BasicErrorController:throw-exception-if-no-handler-found: true开启后默认找/templates/error/404.html 无法集成swagger
 * https://www.cnblogs.com/magicalSam/p/7198420.html
 */
@RestControllerAdvice
public class ExceptionControllerAdvice{
    private static final Logger logger = LoggerFactory.getLogger(ExceptionControllerAdvice.class);

    /**
     * 处理500
     * @param request
     * @param handlerMethod
     * @param ex
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public Object globalException(HttpServletRequest request, HandlerMethod handlerMethod,Throwable ex){
        if(isAjax(request)){
            return new Result(getStatus(request).value(), "访问出错，无法访问: " + ex.getMessage());
        }else{
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("/error/500");
            modelAndView.addObject("errorMsg",ex.getMessage());
            return modelAndView;
        }
    }

    /**
     * 捕捉404异常,这个方法只在配置
     * spring.mvc.throw-exception-if-no-handler-found=true来后起作用
     *
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public Object handle(HttpServletRequest request,NoHandlerFoundException e) {
        if(isAjax(request)){
            return new Result(404,"没有【"+request.getMethod()+"】"+request.getRequestURI()+"方法可以访问");
        }else{
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("/error/404");
            modelAndView.addObject("errorMsg",e.getMessage());
            return modelAndView;
        }

    }
    /**
     * 判断是否是ajax请求
     * @param request
     * @return
     */
    private boolean isAjax(HttpServletRequest request) {
        return (request.getHeader("X-Requested-With") != null &&
                "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString()));
    }
    /**
     * 获取状态响应码
     */
    private HttpStatus getStatus(HttpServletRequest request){
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if(null == statusCode){
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
}
