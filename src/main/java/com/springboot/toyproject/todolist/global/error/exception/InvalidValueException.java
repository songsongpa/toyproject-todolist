package com.springboot.toyproject.todolist.global.error.exception;

import com.springboot.toyproject.todolist.global.error.ErrorCode;

public class InvalidValueException extends BusinessException {
    public InvalidValueException(String value) {
        super(value, ErrorCode.INVALID_INPUT_VALUE);
    }

    public InvalidValueException(String value, ErrorCode errorCode) {
        super(value, errorCode);
    }
}
