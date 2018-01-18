package com.vikki.myproject.modules.sys.security;

import com.vikki.myproject.common.utils.StringUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.stereotype.Service;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>Title: FormAuthenticationFilter</p>
 * <p>Description: </p>
 *
 * @author Vikki
 * @date 2018/01/17 下午 3:36
 */
@Service
public class FormAuthenticationFilter extends org.apache.shiro.web.filter.authc.FormAuthenticationFilter{

    public static final String DEFAULT_MOBILE_PARAM = "mobileLogin";
    /**
     * 创建令牌
     * @param request
     * @param response
     * @return
     */
    @Override
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
        String username = WebUtils.getCleanParam(request,"username");
        String password = WebUtils.getCleanParam(request,"password");
        boolean rememberMe = "on".equals(WebUtils.getCleanParam(request,"remember"));
        String host = StringUtils.getRemoteAddr((HttpServletRequest)request);
        String validateCode = WebUtils.getCleanParam(request,"validateCode");
       // boolean mobile = WebUtils.isTrue(request,DEFAULT_MOBILE_PARAM);
        return new UsernamePasswordToken(username,password.toCharArray(),rememberMe,host,validateCode);
    }
}
