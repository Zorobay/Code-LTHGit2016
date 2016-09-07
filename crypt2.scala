object crypt2{
  def doubleUnlock(magicNumber: Int): Boolean = {
    val key1 = 7
    val key2 = 35
    if(key1 + key2 == magicNumber){
      true
    } else {
      false
    }
  }
}
