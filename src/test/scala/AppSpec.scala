package maka.comma

import org.specs2.mutable._

class AppSpec extends Specification {

  "Number string results" should { 

    "start with same num" in { 
      val og = "1234"
      val commaed = App.commaFormat(og)
      commaed must startWith(String.valueOf(og(0)))
    }

    "end with same num" in { 
      val og = "1234"
      val commaed = App.commaFormat(og)
      commaed must endWith(String.valueOf(og(og.length - 1)))
    }

    "work for 1234567" in { 

      val og = "1234567"
      val expected = "1,234,567"
      val res = App.commaFormat(og)
      res must_== expected
    }

    "no commas in short nums" in { 

      val og = "123"
      val res = App.commaFormat(og)
      res must_== og
    }
  } 
}
