package EPIRPSystem;


/**
* EPIRPSystem/IRPListTypeHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/


/*
   List of all IRPElement and their associated parameters.
  */
public final class IRPListTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.IRPElement value[] = null;

  public IRPListTypeHolder ()
  {
  }

  public IRPListTypeHolder (EPIRPSystem.IRPElement[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.IRPListTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.IRPListTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.IRPListTypeHelper.type ();
  }

}
