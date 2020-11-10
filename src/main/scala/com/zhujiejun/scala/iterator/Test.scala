package com.zhujiejun.scala.iterator

import scala.annotation.tailrec

object Test {
    def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
        val schema = if (ssl) "https://" else "http://"
        (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
    }

    def factorial(x: Long): Long = {
        @tailrec
        def fact(x: Long, accumulator: Long): Long = {
            if (x <= 1) accumulator else fact(x - 1, x * accumulator)
        }

        fact(x, 1)
    }

    def main(args: Array[String]): Unit = {
        val domain = "www.example.com"

        def getURL = urlBuilder(ssl = true, domain)

        val endpoint = "users"
        val query = "id=1"
        val url = getURL(endpoint, query) // "https://www.example.com/users?id=1": String
        println(url)

        println(factorial(15))
    }
}
