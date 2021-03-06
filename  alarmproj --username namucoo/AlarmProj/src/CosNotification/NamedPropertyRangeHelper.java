package CosNotification;


/**
* CosNotification/NamedPropertyRangeHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

abstract public class NamedPropertyRangeHelper
{
  private static String  _id = "IDL:omg.org/CosNotification/NamedPropertyRange:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotification.NamedPropertyRange that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotification.NamedPropertyRange extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotification.IstringHelper.id (), "Istring", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotification.PropertyNameHelper.id (), "PropertyName", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          _tcOf_members0 = CosNotification.PropertyRangeHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "range",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (CosNotification.NamedPropertyRangeHelper.id (), "NamedPropertyRange", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotification.NamedPropertyRange read (org.omg.CORBA.portable.InputStream istream)
  {
    CosNotification.NamedPropertyRange value = new CosNotification.NamedPropertyRange ();
    value.name = istream.read_string ();
    value.range = CosNotification.PropertyRangeHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotification.NamedPropertyRange value)
  {
    ostream.write_string (value.name);
    CosNotification.PropertyRangeHelper.write (ostream, value.range);
  }

}
