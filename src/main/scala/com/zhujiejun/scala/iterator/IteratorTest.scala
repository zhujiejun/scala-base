package com.zhujiejun.scala.iterator

object IteratorTest {
    def main(args: Array[String]): Unit = {
        class RichStringIter extends StringIterator("Hello, Scala") with RichIterator
        val richStringIter = new RichStringIter
        richStringIter foreach0 println
    }
}
