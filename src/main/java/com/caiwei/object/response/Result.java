package com.caiwei.object.response;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Result<T> {
    private String code;
    private String message;
    private Object data;

    public static <T> Result<T> success() {
        return new Result<T>(ResultEnum.SUCCESS.getText(), ResultEnum.SUCCESS.getValue(), null);
    }

    public static <T> Result<T> success(Object data) {
        return new Result<T>(ResultEnum.SUCCESS.getText(), ResultEnum.SUCCESS.getValue(), data);
    }
    public static <T> Result<T> error(String message) {
        return new Result<T>(ResultEnum.SERVER_INTERNAL_ERROR.getText(), message, null);
    }
    public static <T> Result<T> error(String message, Object data) {
        return new Result<T>(ResultEnum.SERVER_INTERNAL_ERROR.getText(), message, data);
    }
}
