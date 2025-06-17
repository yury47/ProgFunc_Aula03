val x = 10
val y = 20
val z = -30

def max(x: Int, y: Int) = if(x > y) x else y
def modulo(x: Int) = if (x < 0) -x else x

@main def main() = {
    println(s"Maximo de $x e $y: ${max(x, y)}")
    println(s"Modulo de $z: ${modulo(x)}")
}
