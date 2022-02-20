fun main() {
    var b=name("Zuenah")
    var m=modulus(76,7)
    println(m)
    var s=sum(20,30,54,63)
    println(s)
    interest()
}
fun name(name:String){
    println("hello $name")
}
fun modulus(x:Int, z:Int):Int{
    var rem = x%z
    return rem

}
fun sum( a:Int, t:Int, s:Int, y:Int):Int{
    var ret =a+t+s+y
    return ret
}
fun interest(){
    println("I enjoy socializing")
}