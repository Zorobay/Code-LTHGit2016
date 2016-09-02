object start{
	def main(args: Array[String]): Unit = {
		val encryptedMessage = reader.readMessage

    printGreeting(encryptedMessage)
	}

  def printGreeting(encMsg: String): Unit ={
    val msg = "We have recieved a top secret message..."
    println(msg)
    println("-" * msg.length + "\n" * 2)
    print("reading.")

    for(i <- 1 to 5){
      print(".")
      Thread.sleep(1000)
    }

    print("\nIncoming message: " + encMsg)
  }
}

object reader{
	def readMessage(): String = {
		import scala.io.Source
		var msg = "???"
		try{
			msg = Source.fromFile("secretmessage.txt").getLines.mkString
		}catch{
			case ex: Exception => println("Cant find file secretmessage.txt, did you move it?")
		}
		
		msg
	}
}