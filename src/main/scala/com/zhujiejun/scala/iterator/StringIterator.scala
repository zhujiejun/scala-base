package com.zhujiejun.scala.iterator

class StringIterator(s: String) extends AbsIterator {
    private var i = 0
    override type T = Char

    override def hasNext: Boolean = i < s.length

    override def next(): Char = {
        val ch = s charAt i
        i += 1
        ch
    }

}
