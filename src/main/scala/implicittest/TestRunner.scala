package implicittest

object TestRunner {
  def main(args: Array[String]) {
    implicit val database = new TestDb
    new MyRepository().doStuff()
  }
}

class TestDb extends Database {}

