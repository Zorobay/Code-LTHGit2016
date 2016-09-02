object start{
	def main(args: Array[String]): Unit = {
		val encryptedMessage = reader.readMessage
		println(encryptedMessage)
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