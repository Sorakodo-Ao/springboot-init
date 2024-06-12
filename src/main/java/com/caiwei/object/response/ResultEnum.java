package com.caiwei.object.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultEnum {

    REQUEST_ERROR("400", "request_error"),

    NOT_FOUND("404", "not_found"),

    REQUEST_TIMEOUT("408", "request_timeout"),

    SERVER_INTERNAL_ERROR("500", "server internal error"),

    SERVICE_UNAVAILABLE("503", "service is unavailable"),

    PARAMETER_ERROR("416", "parameter_error"),

    SUCCESS("200", "success");

    private String text;
    private String value;
}
