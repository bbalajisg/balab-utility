package com.balab.util

import org.joda.time.{DateTimeZone, DateTime}
import org.joda.time.format.{DateTimeFormat, DateTimeFormatter}


/**
 * Created by balaji on 22/8/2014.
 */
object PregnancyWeek {


  val dateFormat =   DateTimeFormat.forPattern("dd/MM/YYYY")

  def pregnancyWeek(lastPeriodDate:String):Int = {

    var givenDate = DateTime.parse(lastPeriodDate, dateFormat).minusHours(0).minus(0).withZone(DateTimeZone.forID("Asia/Singapore"));
    var week = 0;
    println("Week no\n");
    for(  i <- 1 to 42){
      val isBeforeNow = givenDate.isBeforeNow;
      givenDate = incrementWeek( givenDate, i  )
      val isAfterNow = givenDate.isAfterNow;

      if(isAfterNow && isBeforeNow){
        println( "You are no " + i +"th Week" )
        week = i;
      }

    }
    week;
  }

  def incrementWeek(sow:DateTime, count:Int  ) = {
    val eow = sow.plusWeeks(1);
    //println(  count +"      "+ dateFormat.print(sow) + "     " +  dateFormat.print(eow) )
    eow
  }
}
