package ManagedGenericIRPConstDefs;


/**
* ManagedGenericIRPConstDefs/UnsignedShortTypeOptHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分45秒 CST
*/

abstract public class UnsignedShortTypeOptHelper
{
  private static String  _id = "IDL:3gppsa5.org/ManagedGenericIRPConstDefs/UnsignedShortTypeOpt:1.0";

  public static void insert (org.omg.CORBA.Any a, ManagedGenericIRPConstDefs.UnsignedShortTypeOpt that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ManagedGenericIRPConstDefs.UnsignedShortTypeOpt extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      org.omg.CORBA.TypeCode _disTypeCode0;
      _disTypeCode0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
      org.omg.CORBA.UnionMember[] _members0 = new org.omg.CORBA.UnionMember [1];
      org.omg.CORBA.TypeCode _tcOf_members0;
      org.omg.CORBA.Any _anyOf_members0;

      // Branch for value (case label true)
      _anyOf_members0 = org.omg.CORBA.ORB.init ().create_any ();
      _anyOf_members0.insert_boolean ((boolean)true);
      _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ushort);
      _members0[0] = new org.omg.CORBA.UnionMember (
        "value",
        _anyOf_members0,
        _tcOf_members0,
        null);
      __typeCode = org.omg.CORBA.ORB.init ().create_union_tc (ManagedGenericIRPConstDefs.UnsignedShortTypeOptHelper.id (), "UnsignedShortTypeOpt", _disTypeCode0, _members0);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ManagedGenericIRPConstDefs.UnsignedShortTypeOpt read (org.omg.CORBA.portable.InputStream istream)
  {
    ManagedGenericIRPConstDefs.UnsignedShortTypeOpt value = new ManagedGenericIRPConstDefs.UnsignedShortTypeOpt ();
    boolean _dis0 = false;
    _dis0 = istream.read_boolean ();
    if (_dis0)
    {
      short _value = (short)0;
      _value = istream.read_ushort ();
      value.value (_dis0, _value);
    }
    else
      throw new org.omg.CORBA.BAD_OPERATION ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ManagedGenericIRPConstDefs.UnsignedShortTypeOpt value)
  {
    ostream.write_boolean (value.discriminator ());
    if (value.discriminator ())
    {
      ostream.write_ushort (value.value ());
    }
    else
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

}
