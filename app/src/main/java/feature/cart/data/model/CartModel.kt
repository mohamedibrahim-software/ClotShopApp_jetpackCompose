data class CartItemResponse(
    val id: String,                    // cart item id
    val productId: String,
    val productName: String,
    val productImage: String? = null,
    val price: Double,
    val quantity: Int,
    val totalPrice: Double
)

data class CartResponse(
    val id: String,
    val items: List<CartItemResponse> = emptyList(),
    val subTotal: Double = 0.0,
    val discount: Double = 0.0,
    val total: Double = 0.0,
    val appliedCoupon: String? = null
)

data class AddCartItemRequest(
    val productId: String,
    val quantity: Int = 1
)

data class UpdateCartItemRequest(
    val quantity: Int
)

data class DecrementCartItemRequest(
    val productId: String
)

data class ApplyCouponRequest(
    val couponCode: String
)