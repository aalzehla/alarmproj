package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPullSupplierPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年8月26日 星期三 上午10时45分20秒 CST
*/

public abstract class ProxyPullSupplierPOA extends org.omg.PortableServer.Servant
 implements CosEventChannelAdmin.ProxyPullSupplierOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("connect_pull_consumer", new java.lang.Integer (0));
    _methods.put ("pull", new java.lang.Integer (1));
    _methods.put ("try_pull", new java.lang.Integer (2));
    _methods.put ("disconnect_pull_supplier", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // CosEventChannelAdmin/ProxyPullSupplier/connect_pull_consumer
       {
         try {
           CosEventComm.PullConsumer pull_consumer = CosEventComm.PullConsumerHelper.read (in);
           this.connect_pull_consumer (pull_consumer);
           out = $rh.createReply();
         } catch (CosEventChannelAdmin.AlreadyConnected $ex) {
           out = $rh.createExceptionReply ();
           CosEventChannelAdmin.AlreadyConnectedHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // CosEventComm/PullSupplier/pull
       {
         try {
           org.omg.CORBA.Any $result = null;
           $result = this.pull ();
           out = $rh.createReply();
           out.write_any ($result);
         } catch (CosEventComm.Disconnected $ex) {
           out = $rh.createExceptionReply ();
           CosEventComm.DisconnectedHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // CosEventComm/PullSupplier/try_pull
       {
         try {
           org.omg.CORBA.BooleanHolder has_event = new org.omg.CORBA.BooleanHolder ();
           org.omg.CORBA.Any $result = null;
           $result = this.try_pull (has_event);
           out = $rh.createReply();
           out.write_any ($result);
           out.write_boolean (has_event.value);
         } catch (CosEventComm.Disconnected $ex) {
           out = $rh.createExceptionReply ();
           CosEventComm.DisconnectedHelper.write (out, $ex);
         }
         break;
       }

       case 3:  // CosEventComm/PullSupplier/disconnect_pull_supplier
       {
         this.disconnect_pull_supplier ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosEventChannelAdmin/ProxyPullSupplier:1.0", 
    "IDL:omg.org/CosEventComm/PullSupplier:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ProxyPullSupplier _this() 
  {
    return ProxyPullSupplierHelper.narrow(
    super._this_object());
  }

  public ProxyPullSupplier _this(org.omg.CORBA.ORB orb) 
  {
    return ProxyPullSupplierHelper.narrow(
    super._this_object(orb));
  }


} // class ProxyPullSupplierPOA
