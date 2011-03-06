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




/** TcpServer implements a TCP server wainting for incoming connection.
  */
public class TcpServer extends Thread
{  
   /** Costructs a new TcpServer */
   public TcpServer(int port, TcpServerListener listener)
   {  
   }
   
   
   /** Costructs a new TcpServer */
   public TcpServer(int port, IpAddress bind_ipaddr, TcpServerListener listener)
   {  
   }


   /** Costructs a new TcpServer */
   public TcpServer(int port, IpAddress bind_ipaddr, long alive_time, TcpServerListener listener)
   {  
   }


   /** Inits the TcpServer */
   private void init(int port, IpAddress bind_ipaddr, long alive_time, TcpServerListener listener)
   {  
   }


   /** Whether the service is running */
   public boolean isRunning()
   {  return false;
   }


   /** Stops running */
   public void halt()
   {
   }


   /** Runs the server */
   public void run()
   {  
   }  


   /** Gets a String representation of the Object */
   public String toString()
   {  return "tcp:not-supported";
   }   

}
