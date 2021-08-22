package week2oop

object Genericss extends App {
  class Girls
  class Polina extends Girls
  class Humay extends Girls


  // инвариантность
  class ListOfGirls[A]
  val girlsList: ListOfGirls[Girls] = new ListOfGirls[Girls]

  // ковариантность
  class ListOfP[+A]
  val listOfPolina: ListOfP[Girls] = new ListOfP[Polina]

  // контравариантность
  class ListOfHG[-A]
  val list: ListOfHG[Humay] = new ListOfHG[Girls]


  listOfPolina

}
