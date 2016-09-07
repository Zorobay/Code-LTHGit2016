object crypt1{
    def encrypt(msg: String): String = {
        val key = 11
        val chars = msg.toArray
        val newchars: Array[Char] = for(c <- chars) yield (c ^ key).asInstanceOf[Char]
        return newchars.mkString
    }
}
