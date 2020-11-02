package com.zhujiejun.scala.iterator

trait RichIterator extends AbsIterator {
    def foreach0(fn: T => Unit): Unit = while (hasNext) fn(next)
}
