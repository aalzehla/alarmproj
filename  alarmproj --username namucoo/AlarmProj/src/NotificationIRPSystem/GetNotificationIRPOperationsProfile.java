package NotificationIRPSystem;


/**
* NotificationIRPSystem/GetNotificationIRPOperationsProfile.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月26日 星期三 上午10时44分59秒 CST
*/

public final class GetNotificationIRPOperationsProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetNotificationIRPOperationsProfile ()
  {
    super(GetNotificationIRPOperationsProfileHelper.id());
  } // ctor

  public GetNotificationIRPOperationsProfile (String _reason)
  {
    super(GetNotificationIRPOperationsProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetNotificationIRPOperationsProfile (String $reason, String _reason)
  {
    super(GetNotificationIRPOperationsProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetNotificationIRPOperationsProfile
