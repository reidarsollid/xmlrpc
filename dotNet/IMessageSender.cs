using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using CookComputing.XmlRpc;
using System.Security;

namespace SendMessage
{
    
    [XmlRpcUrl("http://127.0.0.1:4567/")]
    public interface IMessageSender : IXmlRpcProxy
    {
        [XmlRpcMethod("message")]
        string SendMessage(string sender, string message);
    }
}
