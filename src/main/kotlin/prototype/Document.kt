package prototype

enum class DocumentExtension {
    docx, pdf, txt, rtf
}

data class Document(
    var title: String,
    var author: String,
    var pages: List<Page>,
    val extension: DocumentExtension,
    private val accessKey: String
)
