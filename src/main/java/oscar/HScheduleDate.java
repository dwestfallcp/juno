/**
 * Copyright (c) 2001-2002. Department of Family Medicine, McMaster University. All Rights Reserved.
 * This software is published under the GPL GNU General Public License.
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version. 
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 * This software was written for the
 * Department of Family Medicine
 * McMaster University
 * Hamilton
 * Ontario, Canada
 */


package oscar;


import java.io.Serializable;

public class HScheduleDate implements Serializable
{

  private boolean available;
  private String priority = "";
  private String reason = "";
  private String hour = "";
  private String creator = "";

  // default constructor
  public HScheduleDate()
  {
  }

  public HScheduleDate(boolean available1, String priority1, String reason1, String hour1, String creator1)
  {
    available = available1;
    priority = priority1;
    reason = reason1;
    hour = hour1;
    creator = creator1;
  }

  public void setHScheduleDate(boolean available1, String priority1, String reason1, String hour1, String creator1)
  {
    available = available1;
    priority = priority1;
    reason = reason1;
    hour = hour1;
    creator = creator1;
  }

  public boolean isAvailable()
  {
    return available;
  }

  public void setAvailable(boolean available)
  {
    this.available = available;
  }

  public String getPriority()
  {
    return priority;
  }

  public void setPriority(String priority)
  {
    this.priority = priority;
  }

  public String getReason()
  {
    return reason;
  }

  public void setReason(String reason)
  {
    this.reason = reason;
  }

  public String getHour()
  {
    return hour;
  }

  public void setHour(String hour)
  {
    this.hour = hour;
  }

  public String getCreator()
  {
    return creator;
  }

  public void setCreator(String creator)
  {
    this.creator = creator;
  }
}
