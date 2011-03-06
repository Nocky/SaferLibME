/*
 * Copyright (C) 2005 Luca Veltri - University of Parma - Italy
 * 
 * This file is part of MjSip (http://www.mjsip.org)
 * 
 * MjSip is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * MjSip is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with MjSip; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * 
 * Author(s):
 * Luca Veltri (luca.veltri@unipr.it)
 */

package java.net;


//import java.net.InetAddress;
import java.io.InputStream;
import java.io.OutputStream;


/** TcpSocket provides a uniform interface to TCP transport protocol,
  * regardless J2SE or J2ME is used.
  */
public class TcpSocket
{
   /** Creates a new TcpSocket */ 
   public TcpSocket(String host, int port) throws java.io.IOException
   {
   }

   /** Creates a new TcpSocket */ 
   public TcpSocket(String host, int port, IpAddress local_ipaddr, int local_port) throws java.io.IOException
   { 
   }

   /** Creates a new UdpSocket */ 
   public TcpSocket(IpAddress ipaddr, int port) throws java.io.IOException
   {
   }

   /** Creates a new UdpSocket */ 
   public TcpSocket(IpAddress ipaddr, int port, IpAddress local_ipaddr, int local_port) throws java.io.IOException
   {  
   }

   /** Closes this socket. */
   public void close() throws java.io.IOException
   {
   }
   
   /** Gets the address to which the socket is connected. */
   public IpAddress getAddress()
   {  return null;
   }
   
   /** Gets an input stream for this socket. */
   public InputStream getInputStream() throws java.io.IOException
   {  return null;
   }
   
   /** Gets the local address to which the socket is bound. */
   public IpAddress getLocalAddress()
   {  return null;
   }
   
   /** Gets the local port to which this socket is bound. */
   public int getLocalPort()
   {  return 0;
   }
   
   /** Gets an output stream for this socket. */
   public OutputStream getOutputStream() throws java.io.IOException
   {  return null;
   }
   
   /** Gets the remote port to which this socket is connected. */
   public int getPort()
   {  return 0;
   }
   
   /** Gets the socket timeout. */
   public int getSoTimeout()
   {  return 0;
   }
   
   /** Enables/disables the socket timeou, in milliseconds. */
   public void setSoTimeout(int timeout)
   {
   }
   
   /** Converts this object to a String. */
   public String toString()
   {  return "tcp:not-supported";
   }

}
