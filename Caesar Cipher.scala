object Cipher extends App{

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  val encrypt = (c:Char, key:Int, a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)

  val decrypt = (c:Char, key:Int, a:String)=> a((a.indexOf(c.toUpper)-key)%a.size)

  val cipher = (algo:(Char, Int, String)=> Char, s:String, key:Int, a:String)=>s.map(algo(_,key,a))

  val message = "Cipher"

  val ct = cipher(encrypt,message,2,alphabet)
  println(ct)

  val pt = cipher(decrypt,ct,2,alphabet)
  println(pt)

}