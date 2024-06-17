package com.caiwei.object.response;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Result<T> {
    private String code;
    private String message;
    private Object data;

    public static <T> Result<T> success(String message) {
        return new Result<T>(ResultEnum.SUCCESS.getCode(), message, null);
    }

    public static <T> Result<T> success(Object data) {
        return new Result<T>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), data);
    }

    public static <T> Result<T> success(String message, Object data) {
        return new Result<T>(ResultEnum.SERVER_INTERNAL_ERROR.getCode(), message, data);
    }

    public static <T> Result<T> error(String message) {
        return new Result<T>(ResultEnum.SERVER_INTERNAL_ERROR.getCode(), message, null);
    }

    public static <T> Result<T> error(String message, Object data) {
        return new Result<T>(ResultEnum.SERVER_INTERNAL_ERROR.getCode(), message, data);
    }
}
