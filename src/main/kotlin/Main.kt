fun main() {
    val cardRanksList = createCardRanksLIst()
    val cardSuitList = createCardSuitList()
    val fulCardList = createFullCard()

    listOf(cardRanksList, cardSuitList, fulCardList).map {
        println("${it.joinToString(" ")}\n")
    }
}

fun createCardRanksLIst() = "A 2 3 4 5 6 7 8 9 10 J Q K".split(" ")

fun createCardSuitList() = "\u2666 \u2665 \u2660 \u2663".split(" ")

fun createFullCard(): MutableList<String> {
    return createCardRanksLIst().flatMap { letter -> createCardSuitList().map { letter + it } }.toMutableList()
}