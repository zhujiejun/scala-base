package com.zhujiejun.scala

import java.util.concurrent.TimeUnit

import com.google.common.base.Stopwatch

//case class Person(name: String, age: Short)

class Hello extends Point with MyTrait01 with MyTrait02 {
    override def show1(msg: String): String = {
        show(1, msg)
    }

    override def show2(msg: String): String = {
        show(2, msg)
    }

    private def show(index: Int, msg: String): String = {
        val line = s"$index. Hello, $msg"
        println(line)
        line
    }
}

object Hello {
    def main(args: Array[String]): Unit = {
        val hello = new Hello
        val watch = Stopwatch.createStarted()
        for (i <- 1 to 12345678) {
            //hello.show(i, "Scala!")
            if (i % 2 == 0) {
                hello.show1("Scala!")
            } else {
                hello.show2("Scala!")
            }
        }
        val ss = watch.elapsed(TimeUnit.SECONDS)
        val ms = watch.elapsed(TimeUnit.MILLISECONDS)
        println(s"total time consumption is $ms ms about $ss s.")
    }
}
