package EPIRPSystem;


/**
* EPIRPSystem/GetIRPOutline.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public final class GetIRPOutline extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetIRPOutline ()
  {
    super(GetIRPOutlineHelper.id());
  } // ctor

  public GetIRPOutline (String _reason)
  {
    super(GetIRPOutlineHelper.id());
    reason = _reason;
  } // ctor


  public GetIRPOutline (String $reason, String _reason)
  {
    super(GetIRPOutlineHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetIRPOutline
