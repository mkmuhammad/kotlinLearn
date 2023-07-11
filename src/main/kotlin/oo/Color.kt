package oo

enum class Color(var rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF) , YELLOW(0xFFFF00);

    fun containsRed(): Boolean {
        //check whether the 2 first digit of hexDecimal(0xRR) are both 0 or not; if not the color contains sum amount of red color
        return this.rgb and 0xFF0000 != 0

    }
}

fun main() {
    // 0..9 -> 2134 (decimal [10-digits])

    //  0..9,A(10),B(11),C(12),D(13),E(14),F(15) (hexaDecimal[16-digits]) -> 0xaaa   => 0x123 = 1(16^2) + 2(16^1) + 3(16^0)
    println(0x123)
    println(0xFF) // -> F(16^1) + F(16^0) => 15(16^1) + 15(16^0) == 255

    // for colors we have a wide range of 255 for each 3main colors: red,green,blue
    // means for a whole color in rgb system we need 3pairs of hexadecimal numbers 0xRR,0xGG,0xBB which
    // will be shown as 0xRRGGBB so 0x000000 would be black and 0xFFFFFF would be white
    // examples : 0xFF0000 => red & 0x00FF00 => green & 0x0000FF => blue

    //binary numbers
    // 0..1 -> 0b11 => 1(2^1) + 1(2^0) == 3
    println(0b11)
    println(0b0000000011)
    println(0b11111111 == 0xFF) //= (2^7 =128)+(2^6 =64)+(2^5 =32)+(2^4 =16)+(2^3 =8)+(2^2 =4)+(2^1 =2)+(2^0 =1) == 255
    println(0b11111111_00000000_00000000 == 0xFF0000)

    // binary numbers operators     -bitwise operators-

    // and operator
    // 1 and 1 => 1
    // 1 and 0 => 0
    // 0 and 1 => 0
    // 0 and 0 => 0
    //ex:
    //       1101
    //  and  1011
    // ------------
    //    =  1001 => 1*(2^4)+ 0*(2^3)+ 0*(2^2)+ 1*(2^0) == 9
    println(0b1101 and 0b1011)


    // or operator
    // 1 and 1 => 1
    // 1 and 0 => 1
    // 0 and 1 => 1
    // 0 and 0 => 0
    //ex:
    //       1101
    //   or  1000
    // ------------
    //    =  1101 => 1*(2^3)+ 1*(2^2)+ 0*(2^1)+ 1*(2^0) == 13
    println(0b1101 or 0b1000)


    //xor operator
    // 1 and 1 => 0
    // 1 and 0 => 1
    // 0 and 1 => 1
    // 0 and 0 => 0
    //       1101
    //  xor  1000
    // ------------
    //    =  0101 => 0*(2^3)+ 1*(2^2)+ 0*(2^1)+ 1*(2^0) == 5
    println(0b1101 xor 0b1000)

    // inverse
    // 0b10011.inv() == 0b..01100
    // 0x0000001F == 0b00..0011111
    // and int value contains 8-bit and with 0b10011 we only provides last 5-bits so to make last 3-bits 0 and nothing else we added and 0x0000001F
    println(0b10011.inv() and 0x0000001F ) // => 0b1100

    // 0x01CAFE and 0xFF0000 == 0x010000
    println(Color.RED.containsRed())
    println(Color.GREEN.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())

}