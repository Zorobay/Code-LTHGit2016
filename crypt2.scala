object crypt2{
  def doubleUnlock(magicNumber: Int): Boolean = {
    val key1 = 0
    val key2 = 0
    if(key1 + key2 == magicNumber){
      true
    } else {
      false
    }
  }
}
