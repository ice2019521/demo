package cn.asiainfo.result;

public interface LoginErrorCode extends ErrorCode {

	public static final String LOGIN_ACCOUNT_INFO_CODE = "2001";
	public static final String LOGIN_ACCOUNT_INFO_MESSAGE = "登录提交信息有误（账号、密码为null,或者账号、密码格式错误）";

	public static final String StaffNotExistErrorRetCode = "2002";
	public static final String StaffNotExistErrorRetInfo = "您没有权限";

	public static final String PhoneNumExistRetCode = "2003";
	public static final String PhoneNumExistRetInfo = "手机号已经存在";

	public static final String GET_VALIDATION_CODE = "2004";
	public static final String GET_VALIDATION_CODE_MESSAGE = "获取短信验证码";

	public static final String CHECK_VALIDATION_CODE = "20041";
	public static final String CHECK_VALIDATION_CODE_MESSAGE = "校验短信验证码";

	public static final String NOT_LOGIN_CODE = "2005";
	public static final String NOT_LOGIN_MESSAGE = "请登录";

}
