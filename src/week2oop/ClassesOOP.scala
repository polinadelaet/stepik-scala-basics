package week2oop



  class Pizza private {
    override def toString = "This is pizza"
    def kek = "privet"
  }

  object Pizza {
    val pizza = new Pizza

    def getInstance: Pizza = {
      pizza
    }
  }

  object ClassesOOP extends App {

    val pizza = Pizza.getInstance

      println(pizza)
  }


