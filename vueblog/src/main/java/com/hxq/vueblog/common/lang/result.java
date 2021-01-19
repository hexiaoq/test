package com.hxq.vueblog.common.lang;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class result implements Serializable {
    private String code;
    private String msg;
    private Object data;

    public static result succ(String code, String msg, Object data) {
        result result = new result();
        result.code = code;
        result.msg = msg;
        result.data = data;
        return result;

    }

    public static result succ(Object data) {
        return succ("200", "操作成功", data);
    }

    public static result fail(String code, String msg, Object data) {
        result result = new result();
        result.code = code;
        result.msg = msg;
        result.data = data;
        return result;

    }

    public static result fail(String msg)
    {
        return fail("400",msg,null);
    }

}
