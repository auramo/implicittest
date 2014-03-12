package implicittest

import ProdDeps._

object ProductionRunner {
  def main(args: Array[String]) {
    new MyRepository().doStuff()
  }
}
