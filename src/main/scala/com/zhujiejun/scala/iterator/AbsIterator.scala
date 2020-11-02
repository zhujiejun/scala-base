package com.zhujiejun.scala.iterator

abstract class AbsIterator {
    type T

    def hasNext: Boolean

    def next: T
}
