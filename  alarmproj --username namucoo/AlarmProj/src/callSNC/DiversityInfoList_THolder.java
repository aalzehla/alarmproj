package callSNC;


/**
* callSNC/DiversityInfoList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/


/**
   * A list of the diversity types and their associated shared resources
   **/
public final class DiversityInfoList_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.DiversityInfo_T value[] = null;

  public DiversityInfoList_THolder ()
  {
  }

  public DiversityInfoList_THolder (callSNC.DiversityInfo_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.DiversityInfoList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.DiversityInfoList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.DiversityInfoList_THelper.type ();
  }

}
