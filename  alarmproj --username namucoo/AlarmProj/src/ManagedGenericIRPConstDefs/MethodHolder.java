package ManagedGenericIRPConstDefs;

/**
* ManagedGenericIRPConstDefs/MethodHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPConstDefs.idl
* 2009年8月25日 星期二 下午04时08分25秒 CST
*/

public final class MethodHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPConstDefs.Method value = null;

  public MethodHolder ()
  {
  }

  public MethodHolder (ManagedGenericIRPConstDefs.Method initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.MethodHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.MethodHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.MethodHelper.type ();
  }

}
