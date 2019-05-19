package cn.com.cncp.web.exception;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.util.WebUtils;

/**
 * 暂时无效
 */
public class MyWebUtils extends WebUtils {
    /**
     * 判断是否是ajax请求
     * spring ajax 返回含有 ResponseBody或者RestController注解
     * @param handlerMethod HandlerMethod
     * @return 是否ajax请求
     *
     * todo
     */
    public static boolean isAjax(HandlerMethod handlerMethod){
        ResponseBody responseBody = handlerMethod.getMethodAnnotation(ResponseBody.class);
        if(null!=responseBody){
            return true;
        }
        //获取类上面的Annotation,可能包含组合注解，故采用spring的工具类
        Class<?> beanType = handlerMethod.getBeanType();
        responseBody = AnnotationUtils.getAnnotation(beanType, ResponseBody.class);
        if(null !=responseBody){
            return true;
        }
        return false;
    }

}
