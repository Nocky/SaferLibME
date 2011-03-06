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
import javax.microedition.io.Connector;


/** UdpPacket provides a uniform interface to UDP packets,
  * regardless J2SE or J2ME is used.
  */
public class UdpPacket
{
   /** The Datagram maker */
   static final int maker_port=5059;

   /** The Datagram maker */
   static DatagramConnection datagram_maker=null;
   
   /** The Datagram */
   Datagram packet;
   
   /** Address */
   IpAddress ipaddr=null;
   
   /** Port */
   int port=0;
   //int port=1; // it gets error when trying to set the ip address with port 0 
   
   /** whether packet address is synchronized with the current ipaddr and port */
   //boolean address_sync=false;


   /** Creates a new UdpPacket */ 
   UdpPacket(Datagram packet)
   {  this.packet=packet;
      //address_sync=true;
   }
   
   /** Gets the Datagram. */
   Datagram getDatagram()
   {  /*if (!address_sync && ipaddr!=null && port>0)
      {  try
         {  //System.err.println("DEBUG: set soaddress: "+"datagram://"+ipaddr.toString()+":"+port);
            packet.setAddress("datagram://"+ipaddr.toString()+":"+port);
            address_sync=true;
         }
         catch (java.io.IOException e) {  e.printStackTrace();  }
      }*/
      return packet;
   }
   
   /** Sets the Datagram. */
   void setDatagram(Datagram packet)
   {  this.packet=packet;
   }


   /** Creates a new UdpPacket */    
   private void init()
   {  if (datagram_maker==null) 
      {  try
         {  datagram_maker=(UDPDatagramConnection)Connector.open("datagram://:"+maker_port);
         }
         catch (java.io.IOException e) {  e.printStackTrace();  }
      }
   }
   
   /** Creates a new UdpPacket */ 
   public UdpPacket(byte[] buf, int length)
   {  init();
      try
      {  packet=datagram_maker.newDatagram(buf,length);
      }
      catch (java.io.IOException e) {  e.printStackTrace();  }
   }

   /** Creates a new UdpPacket */ 
   public UdpPacket(byte[] buf, int length, IpAddress ipaddr, int port)
   {  init();
      try
      {  packet=datagram_maker.newDatagram(buf,length);
         packet.setAddress("datagram://"+ipaddr.toString()+":"+port);
         this.ipaddr=ipaddr;
         this.port=port;
         //address_sync=true;
      }
      catch (java.io.IOException e) {  e.printStackTrace();  }
   }

   /** Creates a new UdpPacket */ 
   public UdpPacket(byte[] buf, int offset, int length)
   {  init();
      try
      {  packet=datagram_maker.newDatagram(buf,length);
         packet.setData(buf,offset,length);
      }
      catch (java.io.IOException e) {  e.printStackTrace();  }
   }

   /** Creates a new UdpPacket */ 
   public UdpPacket(byte[] buf, int offset, int length, IpAddress ipaddr, int port)
   {  init();
      try
      {  packet=datagram_maker.newDatagram(buf,length);
         packet.setData(buf,offset,length);
         packet.setAddress("datagram://"+ipaddr.toString()+":"+port);
         this.ipaddr=ipaddr;
         this.port=port;
         //address_sync=true;
      }
      catch (java.io.IOException e) {  e.printStackTrace();  }
   }

   /** Gets the IP address of the machine to which this datagram is being sent or from which the datagram was received. */
   public IpAddress getIpAddress()
   {  return ipaddr;
   }

   /** Gets the data received or the data to be sent. */
   public byte[] getData()
   {  return packet.getData();
   }

   /** Gets the length of the data to be sent or the length of the data received. */
   public int getLength()
   {  return packet.getLength();
   }

   /** Gets the offset of the data to be sent or the offset of the data received. */
   public int getOffset()
   {  return packet.getOffset();
   }

   /** Gets the port number on the remote host to which this datagram is being sent or from which the datagram was received. */
   public int getPort()
   {  return port;
   }

   /** Sets the data buffer for this packet. */
   public void setData(byte[] buf)
   {  packet.setData(buf,0,buf.length);
   }

   /** Sets the data buffer for this packet. */
   public void setData(byte[] buf, int offset, int length)
   {  packet.setData(buf,offset,length);
   }

   /** Sets the length for this packet. */
   public void setLength(int length)
   {  packet.setLength(length);
   }

   /** Sets the IP address of the machine to which this datagram is being sent. */
   public void setIpAddress(IpAddress ipaddr)
   {  this.ipaddr=ipaddr;
      if (port>0)
      try
      {  //System.err.println("DEBUG: set addr: "+"datagram://"+ipaddr.toString()+":"+port);
         packet.setAddress("datagram://"+ipaddr.toString()+":"+port);
      }
      catch (java.io.IOException e) {  e.printStackTrace();  }
      //address_sync=false;
   }

   /** Sets the port number on the remote host to which this datagram is being sent. */
   public void setPort(int port)
   {  this.port=port;
      if (ipaddr!=null)
      try
      {  //System.err.println("DEBUG: set port: "+"datagram://"+ipaddr.toString()+":"+port);
         packet.setAddress("datagram://"+ipaddr.toString()+":"+port);
      }
      catch (java.io.IOException e) {  e.printStackTrace();  }
      //address_sync=false;
   }

}
