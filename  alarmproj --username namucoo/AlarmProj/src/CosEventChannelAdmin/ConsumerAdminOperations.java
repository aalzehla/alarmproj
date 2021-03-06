package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ConsumerAdminOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年9月2日 星期三 下午02时44分57秒 CST
*/


/**
    * Interface for the consumer administration object.
    */
public interface ConsumerAdminOperations 
{

  /**
         * Obtain a push supplier proxy for this administration object.
         * @returns A <code>ProxyPushSupplier</code> object reference.
         */
  CosEventChannelAdmin.ProxyPushSupplier obtain_push_supplier ();

  /**
         * Obtain a pull supplier proxy for this administration object.
         * @returns A <code>ProxyPullSupplier</code> object reference.
         */
  CosEventChannelAdmin.ProxyPullSupplier obtain_pull_supplier ();
} // interface ConsumerAdminOperations
