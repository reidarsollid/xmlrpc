using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using CookComputing.XmlRpc;
using System.Security;

namespace SendMessage
{
    class Program
    {

        static void Main(string[] args)
        {
            IMessageSender messageSender = (IMessageSender)XmlRpcProxyGen.Create(typeof(IMessageSender));
            string result = messageSender.SendMessage("C#", "Hello Erlang from .Net");
            Console.WriteLine(result);
            Console.Read();
        }
    }
}
