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

package javax.util;



import java.util.Calendar;





/** Fake RotatingLog. An istance of class RotatingLog is actually a Log object.
  */
public class RotatingLog extends Log
{

   /** Month */
   //public static final int MONTH=GregorianCalendar.MONTH;
   public static final int MONTH=Calendar.MONTH;
   /** Day */
   //public static final int DAY=GregorianCalendar.DAY_OF_MONTH;
   public static final int DAY=Calendar.DAY_OF_MONTH;
   /** Hour */
   //public static final int HOUR=GregorianCalendar.HOUR;
   public static final int HOUR=Calendar.HOUR;
   /** Minute */
   //public static final int MINUTE=GregorianCalendar.MINUTE;
   public static final int MINUTE=Calendar.MINUTE;


   /** Creates a new RotatingLog file <i>filename</i>
     * . RotatingLog size is limited to <i>logsize</i> [bytes] */
   public RotatingLog(String filename, String logname, int loglevel, long logsize, int n_rotations, int t_scale, int t_value)
   {  super(filename,logname,loglevel,logsize);
   }
   /** Rotates logs */
   public RotatingLog rotate()
   {  return this; 
   }
   
   
   /** Prints the <i>log</i> if <i>level</i> isn't greater than the Log <i>log_level</i> */
   public Log print(String message, int level)
   {  return super.print(message,level);
   }

}