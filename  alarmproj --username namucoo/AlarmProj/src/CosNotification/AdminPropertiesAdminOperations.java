package CosNotification;


/**
* CosNotification/AdminPropertiesAdminOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/


// MaxSuppliers takes on a value of type long
public interface AdminPropertiesAdminOperations 
{
  CosNotification.Property[] get_admin ();
  void set_admin (CosNotification.Property[] admin) throws CosNotification.UnsupportedAdmin;
} // interface AdminPropertiesAdminOperations
