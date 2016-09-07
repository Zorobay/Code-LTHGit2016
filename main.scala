object start{
	def main(args: Array[String]): Unit = {
		val encryptedMessage = reader.readMessage

    printGreeting(encryptedMessage)
    println("\nDo you want to attemp to decode the message? (Y/N)")
    var decodedMsg = ""
    if(reader.readInput.toLowerCase == "y"){
      if(!plunger.unclogPipes){
        println("Decryption systems are clogged up! Please do maintenance.")
        println("Shutting down...")
        System.exit(0)
      }
      decodedMsg = decodeMessage(encryptedMessage)
    }else{
      System.exit(0)
    }
    if(!crypt2.doubleUnlock(42)){
      println("doubleUnlock security test not passed, access to decrypted message denied!")
    } else {
      println("Access to decrypted message granted! The message is:")
      println(decodedMsg)
    }
	}

  def decodeMessage(encMsg: String): String = {
    print("Decrypting")
    for(a <- 1 to 10){
      Thread.sleep(30)
      print(".")
    }
    println()
    println("Decryption complete!")
    crypt1.encrypt(encMsg)
  }

  def printGreeting(encMsg: String): Unit ={
    val msg = "We have recieved a top secret message..."
    println(msg)
    println("-" * msg.length + "\n" * 2)
    print("reading.")

    for(i <- 1 to 5){
      print(".")
      Thread.sleep(500)
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

  def readInput: String = {
    import java.util.Scanner
    val scan = new Scanner(System.in)
    scan.nextLine
  }
}
