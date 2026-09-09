data class AddressResponse(
    val id: String,
    val fullName: String,
    val phone: String,
    val city: String,
    val area: String? = null,
    val street: String,
    val building: String? = null,
    val floor: String? = null,
    val apartment: String? = null,
    val notes: String? = null,
    val isDefault: Boolean = false
)

data class AddressListResponse(
    val addresses: List<AddressResponse>
)

data class CreateAddressRequest(
    val fullName: String,
    val phone: String,
    val city: String,
    val area: String? = null,
    val street: String,
    val building: String? = null,
    val floor: String? = null,
    val apartment: String? = null,
    val notes: String? = null,
    val isDefault: Boolean = false
)

data class UpdateAddressRequest(
    val fullName: String? = null,
    val phone: String? = null,
    val city: String? = null,
    val area: String? = null,
    val street: String? = null,
    val building: String? = null,
    val floor: String? = null,
    val apartment: String? = null,
    val notes: String? = null,
    val isDefault: Boolean? = null
)