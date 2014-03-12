package implicittest

object ProdDeps {
  implicit val database = new DatabaseImpl
}
