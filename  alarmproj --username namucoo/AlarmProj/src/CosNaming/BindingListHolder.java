package CosNaming;


/**
* CosNaming/BindingListHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/

public final class BindingListHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.Binding value[] = null;

  public BindingListHolder ()
  {
  }

  public BindingListHolder (CosNaming.Binding[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.BindingListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.BindingListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.BindingListHelper.type ();
  }

}
