package cn.com.cncp.common;

/**
 * 定义通用的返回结果集
 * @param <T>
 */
public class Result<T> {
    private Integer code;
    private String message;
    private T data;


    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
