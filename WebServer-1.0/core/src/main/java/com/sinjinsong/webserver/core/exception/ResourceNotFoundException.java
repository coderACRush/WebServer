package com.sinjinsong.webserver.core.exception;

import com.sinjinsong.webserver.core.enumeration.HTTPStatus;
import com.sinjinsong.webserver.core.exception.base.ServletException;

/**
 * Created by SinjinSong on 2017/7/21.
 */
public class ResourceNotFoundException extends ServletException {
    private static final HTTPStatus status = HTTPStatus.NOT_FOUND;
    public ResourceNotFoundException() {
        super(status);
    }
}
