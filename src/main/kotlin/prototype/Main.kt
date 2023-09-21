package prototype

fun main() {
    val doc = Document(
        "Title",
        "Me",
        listOf(
            Page("Header", "Content", "Footer"),
            Page("Header", "Content", "Footer"),
            Page("Header", "Content", "Footer")
        ),
        DocumentExtension.docx,
        "Secret key"
    )

    // TODO: make a copy

}