package NotificationIRPSystem;


/**
* NotificationIRPSystem/AtLeastOneNotificationCategoryNotSupported.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月26日 星期三 上午10时44分59秒 CST
*/

public final class AtLeastOneNotificationCategoryNotSupported extends org.omg.CORBA.UserException
{

  public AtLeastOneNotificationCategoryNotSupported ()
  {
    super(AtLeastOneNotificationCategoryNotSupportedHelper.id());
  } // ctor


  public AtLeastOneNotificationCategoryNotSupported (String $reason)
  {
    super(AtLeastOneNotificationCategoryNotSupportedHelper.id() + "  " + $reason);
  } // ctor

} // class AtLeastOneNotificationCategoryNotSupported
