package com.zhujiejun.scala.algo

import java.util.concurrent.TimeUnit

import com.google.common.base.Stopwatch
import com.zhujiejun.scala.algo.Algo01.field2

import scala.collection.mutable

class Algo01(name: String) {
    private val field1: String = name

    private def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        printf(s"field2:${field2}\n")
        val hashtable: mutable.Map[Int, Int] = mutable.Map()
        for (i <- nums.indices) {
            if (hashtable.contains(target - nums(i))) {
                return Array(hashtable(target - nums(i)), i)
            }
            hashtable += (nums(i) -> i)
        }
        Array(0, 0)
    }
}

object Algo01 {
    private val field2: Int = 20

    def main(args: Array[String]): Unit = {
        val algo = new Algo01("Scala")
        printf(s"field1:${algo.field1}\n")
        val target = args(0).toInt
        val t: String = target match {
            case _: Int => String.format("num: %d", target)
            case _ => ""
        }
        printf(s"the match is [${t}].\n")
        //println(target.toBinaryString.length)
        val nums = Array(1, 3, 4, 5, 7, 8, 9)
        val watch: Stopwatch = Stopwatch.createStarted()
        val result = algo.twoSum(nums, target)
        printf(s"time used: ${watch.elapsed(TimeUnit.MILLISECONDS)} ms.\n")
        result foreach println
    }
}
