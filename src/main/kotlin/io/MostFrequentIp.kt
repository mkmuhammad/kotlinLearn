package io

import functions.max
import java.io.File

fun main() {

    val ipToCount = mutableMapOf<String, Int>()
    File("src/ips.txt").forEachLine {
        /*if (ipToCount.contains(it)){
            val previous = ipToCount[it]!!
            ipToCount[it] = previous+1
        }else{
            ipToCount[it] = 1
        }*/

        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount[it] = previous + 1

    }

//    var maxIp = ipToCount.keys.first()
//    var maxCount = 0
//    for ((ip,count) in ipToCount.entries){
//        if (count> maxCount){
//            maxCount = count
//            maxIp = ip
//        }
//    }

    val (maxIp, maxCount) = ipToCount.entries.maxByOrNull { it.value }!!

    println("Most frequent Up IP address is $maxIp, which occurred $maxCount")

}