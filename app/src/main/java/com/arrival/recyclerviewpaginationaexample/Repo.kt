package com.arrival.recyclerviewpaginationaexample

class Repo {
    private val page1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    private val page2 = listOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    private val page3 = listOf(21, 22, 23, 24, 25, 26, 27, 28, 29, 30)
    private val page4 = listOf(31, 32, 33, 34, 35, 36, 37, 38, 39, 40)

    private val pageMap = mapOf(
        1 to page1,
        2 to page2,
        3 to page3,
        4 to page4
    )

    fun getPage(page: Int): List<Int> = pageMap[page] ?: emptyList()
}