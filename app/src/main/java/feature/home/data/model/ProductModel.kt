data class ProductResponse(
    val id: String,
    val name: String,
    val description: String? = null,
    val price: Double,
    val discountPrice: Double? = null,
    val images: List<String> = emptyList(),
    val categoryId: String? = null,
    val categoryName: String? = null,
    val stock: Int = 0,
    val isInStock: Boolean = true,
    val rating: Double? = null,
    val reviewsCount: Int = 0
)

data class ProductListResponse(
    val products: List<ProductResponse>,
    val page: Int,
    val pageSize: Int,
    val totalCount: Int,
    val totalPages: Int
)