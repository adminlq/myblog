package com.single.myblog.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.single.myblog.consts.ErrorCode;
import com.single.myblog.dto.ResultCode;

public class JsonUtil {

    public static String toErrorCodeStr(ErrorCode errorCode) {
        ResultCode rc = new ResultCode();
        rc.setCode(errorCode.getCode());
        rc.setMessage(errorCode.getReason());
        return JSON.toJSONString(rc);

    }

    public static String resultStr(JSONObject json) {
        ResultCode rc = new ResultCode();
        rc.setCode(ErrorCode.success.getCode());
        rc.setMessage(ErrorCode.success.getReason());
        json.putAll((JSONObject) JSONObject.toJSON(rc));
        return JSONObject.toJSONString(json);

    }

    public static String resultStr(JSONArray json) {
        ResultCode rc = new ResultCode();
        rc.setCode(ErrorCode.success.getCode());
        rc.setMessage(ErrorCode.success.getReason());
        JSONObject resultCode = (JSONObject) JSONObject.toJSON(rc);

        json.add(resultCode);
        return JSONObject.toJSONString(json);
    }
}
