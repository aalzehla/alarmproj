package NotificationIRPConstDefs;


/**
* NotificationIRPConstDefs/AttributeNameValuePOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPConstDefs.idl
* 2009年8月25日 星期二 下午04时08分11秒 CST
*/


/*
   Define the parameters (in the notification header) specified in
   the Notification IRP: IS.
   */
public abstract class AttributeNameValuePOA extends org.omg.PortableServer.Servant
 implements NotificationIRPConstDefs.AttributeNameValueOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/NotificationIRPConstDefs/AttributeNameValue:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public AttributeNameValue _this() 
  {
    return AttributeNameValueHelper.narrow(
    super._this_object());
  }

  public AttributeNameValue _this(org.omg.CORBA.ORB orb) 
  {
    return AttributeNameValueHelper.narrow(
    super._this_object(orb));
  }


} // class AttributeNameValuePOA
