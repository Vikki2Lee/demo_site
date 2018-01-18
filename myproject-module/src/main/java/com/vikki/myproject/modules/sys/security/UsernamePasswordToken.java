package com.vikki.myproject.modules.sys.security;

/**
 * 用户和密码(包括验证码)令牌类
 * <p>Title: UsernamePasswordToken</p>
 * <p>Description: </p>
 *
 * @author Vikki
 * @date 2018/01/17 下午 3:29
 */
public class UsernamePasswordToken extends org.apache.shiro.authc.UsernamePasswordToken{
    private static final long serialVersionUID = 1L;

    private String validateCode;
    //private boolean mobileLogin;

    public UsernamePasswordToken() {
        super();
    }

    public UsernamePasswordToken(String username, char[] password, boolean rememberMe, String host,String validateCode) {
        super(username, password, rememberMe, host);
        this.validateCode = validateCode;
        //this.mobileLogin = mobileLogin;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

//    public boolean isMobileLogin() {
//        return mobileLogin;
//    }
//
//    public void setMobileLogin(boolean mobileLogin) {
//        this.mobileLogin = mobileLogin;
//    }
}
