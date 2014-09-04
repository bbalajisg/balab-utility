package com.balab.util

import org.scalatest.FunSuite

/**
 * Created by balaji on 25/8/2014.
 */

class PregnancyWeekSuite extends FunSuite {


  test("""counting an '25/12/2013' empty collection""") {
     assert(PregnancyWeek.pregnancyWeek("25/12/2013") != 30)
  }

  test( "counting an '25/12/2013' 31") {
    assert(PregnancyWeek.pregnancyWeek("25/12/2013") != 31)
  }

  test("""counting an '25/12/2013' 33""") {
    assert(PregnancyWeek.pregnancyWeek("25/12/2013") != 33)
  }
  test("""counting an '25/12/2013' 34""") {
    assert(PregnancyWeek.pregnancyWeek("25/12/2013") != 34)
  }

  test("""counting an '25/12/2013'35""") {
    assert(PregnancyWeek.pregnancyWeek("25/12/2013") == 35)
  }
  test("""counting an '25/12/2013' 36""") {
    assert(PregnancyWeek.pregnancyWeek("25/12/2013") != 36)
  }



}
