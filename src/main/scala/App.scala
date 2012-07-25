package maka.comma

object App {

  def commaFormat(rawNumber: String): String = { 

    rawNumber.reverse.grouped(3).foldLeft("")( _ + "," +  _).reverse.dropRight(1)
  }
}
