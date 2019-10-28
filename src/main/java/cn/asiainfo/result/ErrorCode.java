package cn.asiainfo.result;

public interface ErrorCode {

	public static final String SuccessRetCode = "000000";
	public static final String SuccessRetInfo = "操作成功";

	public static final String ExceptionRetCode = "0001";
	public static final String ExceptionRetInfo = "系统异常:";

	public static final String ParaCheckErrorRetCode = "0002";
	public static final String ParaCheckErrorRetInfo = "参数校验错误:";

	public static final String ArithmeticExecptionRetCode = "0003";
	public static final String ArithmeticExecptionRetInfo = "算术异常类";

	public static final String NullPointerExceptionRetCode = "0004";
	public static final String NullPointerExceptionRetInfo = "空指针异常类";

	public static final String ClassCastExceptionRetCode = "0005";
	public static final String ClassCastExceptionRetInfo = "类型强制转换异常";

	public static final String NegativeArrayExceptionRetCode = "0006";
	public static final String NegativeArrayExceptionRetInfo = "数组负下标异常";

	public static final String ArrayIndexOutOfBoundsExceptionRetCode = "0007";
	public static final String ArrayIndexOutOfBoundsExceptionRetInfo = "数组下标越界异常";

	public static final String SecturityExceptionRetCode = "0008";
	public static final String SecturityExceptionRetInfo = "违背安全原则异常";

	public static final String EOFExceptionRetCode = "0009";
	public static final String EOFExceptionRetInfo = "文件已结束异常";

	public static final String FileNotFoundExceptionRetCode = "0010";
	public static final String FileNotFoundExceptionRetInfo = "文件未找到异常";

	public static final String NumberFormatExceptionRetCode = "0011";
	public static final String NumberFormatExceptionRetInfo = "字符串转换为数字异常";

	public static final String SQLExceptionRetCode = "0012";
	public static final String SQLExceptionRetInfo = "操作数据库异常";

	public static final String IOExceptionRetCode = "0013";
	public static final String IOExceptionRetInfo = "输入输出异常";

	public static final String NoSuchMethodExceptionRetCode = "0014";
	public static final String NoSuchMethodExceptionRetInfo = "方法未找到异常";

	public static final String AbstractMethodErrorRetCode = "0015";
	public static final String AbstractMethodErrorRetInfo = "抽象方法错误";

	public static final String AssertionErrorRetCode = "0016";
	public static final String AssertionErrorRetInfo = "断言错";

	public static final String ClassCircularityErrorRetCode = "0017";
	public static final String ClassCircularityErrorRetInfo = "类循环依赖错误";

	public static final String ClassFormatErrorRetCode = "0018";
	public static final String ClassFormatErrorRetInfo = "类格式错误";

	public static final String ErrorRetCode = "0019";
	public static final String ErrorRetInfo = "错误";

	public static final String ExceptionInInitializerErrorRetCode = "0020";
	public static final String ExceptionInInitializerErrorRetInfo = "初始化程序错误";

	public static final String IllegalAccessErrorRetCode = "0021";
	public static final String IllegalAccessErrorRetInfo = "违法访问错误";

	public static final String IncompatibleClassChangeErrorRetCode = "0022";
	public static final String IncompatibleClassChangeErrorRetInfo = "不兼容的类变化错误";

	public static final String InstantiationErrorRetCode = "0023";
	public static final String InstantiationErrorRetInfo = "实例化错误";

	public static final String InternalErrorRetCode = "0024";
	public static final String InternalErrorRetInfo = "内部错误";

	public static final String LinkageErrorRetCode = "0025";
	public static final String LinkageErrorRetInfo = "链接错误";

	public static final String NoClassDefFoundErrorRetCode = "0026";
	public static final String NoClassDefFoundErrorRetInfo = "未找到类定义错误";

	public static final String NoSuchFieldErrorRetCode = "0027";
	public static final String NoSuchFieldErrorRetInfo = "域不存在错误";

	public static final String NoSuchMethodErrorRetCode = "0028";
	public static final String NoSuchMethodErrorRetInfo = "方法不存在错误";

	public static final String OutOfMemoryErrorRetCode = "0029";
	public static final String OutOfMemoryErrorRetInfo = "内存不足错误";

	public static final String StackOverflowErrorRetCode = "0030";
	public static final String StackOverflowErrorRetInfo = "堆栈溢出错误";

	public static final String ThreadDeathRetCode = "0031";
	public static final String ThreadDeathRetInfo = "线程结束";

	public static final String UnknownErrorRetCode = "0032";
	public static final String UnknownErrorRetInfo = "未知错误";

	public static final String UnsatisfiedLinkErrorRetCode = "0033";
	public static final String UnsatisfiedLinkErrorRetInfo = "未满足的链接错误";

	public static final String UnsupportedClassVersionErrorRetCode = "0034";
	public static final String UnsupportedClassVersionErrorRetInfo = "不支持的类版本错误";

	public static final String VerifyErrorRetCode = "0035";
	public static final String VerifyErrorRetInfo = "验证错误";

	public static final String VirtualMachineErrorRetCode = "0036";
	public static final String VirtualMachineErrorRetInfo = "虚拟机错误";

	public static final String ArithmeticExceptionRetCode = "0037";
	public static final String ArithmeticExceptionRetInfo = "算术条件异常";

	public static final String ArrayStoreExceptionRetCode = "0038";
	public static final String ArrayStoreExceptionRetInfo = "类造型异常";

	public static final String ClassNotFoundExceptionRetCode = "0039";
	public static final String ClassNotFoundExceptionRetInfo = "不支持克隆异常";

	public static final String EnumConstantNotPresentExceptionRetCode = "0040";
	public static final String EnumConstantNotPresentExceptionRetInfo = "枚举常量不存在异常";

	public static final String IllegalAccessExceptionRetCode = "0041";
	public static final String IllegalAccessExceptionRetInfo = "违法的访问异常";

	public static final String IllegalMonitorStateExceptionRetCode = "0042";
	public static final String IllegalMonitorStateExceptionRetInfo = "违法的监控状态异常";

	public static final String IllegalStateExceptionRetCode = "0043";
	public static final String IllegalStateExceptionRetInfo = "违法的状态异常";

	public static final String IllegalThreadStateExceptionRetCode = "0044";
	public static final String IllegalThreadStateExceptionRetInfo = "违法的线程状态异常";

	public static final String IndexOutOfBoundsExceptionRetCode = "0045";
	public static final String IndexOutOfBoundsExceptionRetInfo = "索引越界异常";

	public static final String InstantiationExceptionRetCode = "0046";
	public static final String InstantiationExceptionRetInfo = "实例化异常";

	public static final String InterruptedExceptionRetCode = "0047";
	public static final String InterruptedExceptionRetInfo = "被中止异常";

	public static final String NegativeArraySizeExceptionRetCode = "0048";
	public static final String NegativeArraySizeExceptionRetInfo = "数组大小为负值异常";

	public static final String NoSuchFieldExceptionRetCode = "0049";
	public static final String NoSuchFieldExceptionRetInfo = "属性不存在异常";

	public static final String RuntimeExceptionRetCode = "0050";
	public static final String RuntimeExceptionRetInfo = "运行时异常";

	public static final String SecurityExceptionRetCode = "0051";
	public static final String SecurityExceptionRetInfo = "安全异常";

	public static final String StringIndexOutOfBoundsExceptionRetCode = "0052";
	public static final String StringIndexOutOfBoundsExceptionRetInfo = "字符串索引越界异常";

	public static final String TypeNotPresentExceptionRetCode = "0053";
	public static final String TypeNotPresentExceptionRetInfo = "类型不存在异常";

	public static final String UnsupportedOperationExceptionRetCode = "0054";
	public static final String UnsupportedOperationExceptionRetInfo = "不支持的方法异常";

	public static final String JspExceptionRetCode = "0055";
	public static final String JspExceptionRetInfo = "Jsp异常";

	public static final String JasperExceptionRetCode = "0056";
	public static final String JasperExceptionRetInfo = "Jsp解析异常";

	public static final String ServletExceptionRetCode = "0057";
	public static final String ServletExceptionRetInfo = "Servlet异常";

	public static final String BeanCreationExceptionRetCode = "0058";
	public static final String BeanCreationExceptionRetInfo = "Bean创建异常";

	public static final String GetErrorCode = "0059";
	public static final String GetErrorInfo = "获取失败";

	public static final String AddIsErrorCode = "0060";
	public static final String AddIsErrorInfo = "新增失败";

	public static final String DeleteIsErrorCode = "0061";
	public static final String DeleteIsErrorInfo = "删除失败";

	public static final String UpdateErrorCode = "0062";
	public static final String UpdateErrorInfo = "更新失败";

	public static final String LoginNameFailCode = "0063";
	public static final String LoginNameFailInfo = "登录名错误";

}
