package org.example

import org.jsoup.Jsoup

fun main() {

    val url = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

    val doc = Jsoup.connect(url).get()

    val citations = doc.select("#__next > div > section > div.sc-1vlzmga-2.dzxAnh > div:nth-child(1)")

    for (citation in citations) {
        println(citation.text())

    }

}