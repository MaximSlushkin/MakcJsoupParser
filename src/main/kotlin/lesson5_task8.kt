package org.example

import org.jsoup.Jsoup

fun main() {

    val url = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

    val doc = Jsoup.connect(url).get()

    val citations = doc.select("article")

    for (citation in citations) {
        println(citation.text())

    }

}