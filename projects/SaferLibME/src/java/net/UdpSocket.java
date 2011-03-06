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


import javax.microedition.io.*;


/** UdpSocket provides a uniform interface to UDP transport protocol,
  * regardless J2SE or J2ME is used.
  */
public class UdpSocket
{

   /** DatagramSocket */
   UDPDatagramConnection socket;
   

   /** Creates a new UdpSocket */ 
   public UdpSocket(int port)
   {  try
      {  socket=(UDPDatagramConnection)Connector.open("datagram://:"+port);
      }
      catch (java.io.IOException e) {  e.printStackTrace();  }
   }

   /** Creates a new UdpSocket */ 
   public UdpSocket(int port, IpAddress ipaddr)
   {  try
      {  socket=(UDPDatagramConnection)Connector.open("datagram://:"+port);
      }
      catch (java.io.IOException e) {  e.printStackTrace();  }
   }
   
   /** Closes this datagram socket. */
   public void close()
   {  try
      {  socket.close();
      }
      catch (java.io.IOException e) {  e.printStackTrace();  }
   }

   /** Gets the local address to which the socket is bound. */
   public IpAddress getLocalAddress()
   {  try
      {  return new IpAddress(socket.getLocalAddress());
      }
      catch (java.io.IOException e) {  e.printStackTrace(); return null;  }
   }
   
   /** Gets the port number on the local host to which this socket is bound. */
   public int getLocalPort()
   {  try
      {  return socket.getLocalPort();
      }
      catch (java.io.IOException e) {  e.printStackTrace(); return 0;  }
   }
   
   /** Gets the socket timeout. */
   public int getSoTimeout()
   {  return 0;
   }
   
   /** Enables/disables socket timeout with the specified timeout, in milliseconds. */
   public void setSoTimeout(int timeout)
   {
   }

   /** Receives a datagram packet from this socket. */
   public void receive(UdpPacket pkt) throws java.io.IOException
   {  Datagram dgram=pkt.getDatagram();
      socket.receive(dgram);
      pkt.setDatagram(dgram);
      String url=dgram.getAddress(); // datagram://addr:port
      System.err.println("DEBUG: UdpSocket: received from: "+url);
      int begin=url.indexOf("://");
      begin+=3;
      int end=url.indexOf(":",begin);
      String addr=url.substring(begin,end);
      int port=Integer.parseInt(url.substring(end+1,url.length()));
      pkt.setIpAddress(new IpAddress(addr));
      pkt.setPort(port);
   }
   
   /** Sends an UDP packet from this socket. */ 
   public void send(UdpPacket pkt) throws java.io.IOException
   {  Datagram dgram=pkt.getDatagram();
      socket.send(dgram);
      String url=dgram.getAddress(); // datagram://addr:port
      System.err.println("DEBUG: UdpSocket: sent to: "+url);
   }
   
   /** Converts this object to a String. */
   public String toString()
   {  try
      {  return "udp:"+socket.getLocalPort();
      }
      catch (java.io.IOException e) {  e.printStackTrace(); return "udp:0";  }
   }

}
