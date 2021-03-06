package mLSNPP;


/**
* mLSNPP/LayeredSNPPList_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
*/


/** 
   * The List of LayeredSNPP_T. It is a list of the SNPPs at all layers. 
   * A given layerRate value can appear only once in this list.
   * 
   **/
abstract public class LayeredSNPPList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/mLSNPP/LayeredSNPPList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, mLSNPP.LayeredSNPP_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static mLSNPP.LayeredSNPP_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = mLSNPP.LayeredSNPP_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (mLSNPP.LayeredSNPPList_THelper.id (), "LayeredSNPPList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static mLSNPP.LayeredSNPP_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    mLSNPP.LayeredSNPP_T value[] = null;
    int _len0 = istream.read_long ();
    value = new mLSNPP.LayeredSNPP_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = mLSNPP.LayeredSNPP_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, mLSNPP.LayeredSNPP_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      mLSNPP.LayeredSNPP_THelper.write (ostream, value[_i0]);
  }

}
