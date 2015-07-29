class Connection {
   def persist(a:String) = println("OK, persisted" + a)
   def open = println("open")
   def close = println("closed")
}

def withConnection(f: Connection => Unit) {
   val c:Connection = new Connection()
   c.open
   f(c)
   c.close
}

withConnection{c =>
   c.persist("Item in DB")
}

