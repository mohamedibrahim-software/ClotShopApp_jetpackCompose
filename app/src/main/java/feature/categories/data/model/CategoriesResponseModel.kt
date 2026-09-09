data class CategoryResponse(
    val id: String,
    val name: String,
    val description: String? = null,
    val imageUrl: String? = null
)

data class CategoryListResponse(
    val categories: List<CategoryResponse>
)