package com.android.jhotel_android_albert;

import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
import com.android.volley.Response;

/**
 * Created by User on 5/1/2018.
 */

public class LoginRequest extends StringRequest {
    private static final String Regis_URL = "http://192.168.43.113:8080/logincust";
    private Map<String, String> params;

    public LoginRequest(String email, String password,  Response.Listener<String> listener) {
        super(Method.POST, Regis_URL, listener, null);
        params = new HashMap<>();
        params.put("email",email);
        params.put("password", password);
    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
