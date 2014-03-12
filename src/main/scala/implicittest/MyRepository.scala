package implicittest

class MyRepository(implicit database: Database) {
  def doStuff() {
    val classOfDb = database.getClass
    println(s"db class $classOfDb")
  }
}
