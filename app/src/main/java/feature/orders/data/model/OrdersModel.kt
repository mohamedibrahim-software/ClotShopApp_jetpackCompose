data class OrderItemResponse(
    val productId: String,
    val productName: String,
    val productImage: String? = null,
    val quantity: Int,
    val price: Double,
    val totalPrice: Double
)

data class OrderResponse(
    val id: String,
    val orderNumber: String? = null,
    val status: String,                // Pending, Confirmed, Shipped, Delivered, Cancelled...
    val items: List<OrderItemResponse> = emptyList(),
    val subTotal: Double,
    val discount: Double = 0.0,
    val shippingFee: Double = 0.0,
    val total: Double,
    val shippingAddress: AddressResponse? = null,
    val createdAt: String? = null,
    val paymentMethod: String? = null
)

data class OrderListResponse(
    val orders: List<OrderResponse>,
    val page: Int? = null,
    val pageSize: Int? = null,
    val totalCount: Int? = null
)

data class CheckoutRequest(
    val addressId: String,
    val paymentMethod: String? = null,     // مثلاً: "cash" أو "card"
    val couponCode: String? = null
)