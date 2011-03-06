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
import java.io.*;


/** TcpConnection provides a TCP connection oriented transport service.
  */
public class TcpConnection extends Thread
{
   /** Costructs a new TcpConnection */
   public TcpConnection(TcpSocket socket, TcpConnectionListener listener)
   {  init(socket,0,listener);
      start();
   }


   /** Costructs a new TcpConnection */
   public TcpConnection(TcpSocket socket, long alive_time, TcpConnectionListener listener)
   {  
   }


   /** Inits the TcpConnection */
   private void init(TcpSocket socket, long alive_time, TcpConnectionListener listener)
   {  
   }


   /** Whether the service is running */
   public boolean isRunning()
   {  return false;
   }


   /** Gets the TcpSocket */ 
   public TcpSocket getSocket()
   {  return null;
   }


   /** Gets the remote IP address */
   public IpAddress getRemoteAddress()
   {  return null;
   }

   
   /** Gets the remote port */
   public int getRemotePort()
   {  return 0;
   }

  
   /** Stops running */
   public void halt()
   {
   }


   /** Sends data */
   public void send(byte[] buff, int offset, int len)  throws IOException
   {  
   }


   /** Sends data */
   public void send(byte[] buff)  throws IOException
   {
   }


   /** Runs the tcp receiver */
   public void run()
   {
   } 

 
   /** Gets a String representation of the Object */
   public String toString()
   {  return "tcp:not-supported";
   }

}