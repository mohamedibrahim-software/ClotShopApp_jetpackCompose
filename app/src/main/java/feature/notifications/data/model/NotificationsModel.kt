data class NotificationResponse(
    val id: String,
    val title: String,
    val body: String,
    val isRead: Boolean = false,
    val createdAt: String? = null,
    val type: String? = null           // order, offer, general...
)

data class NotificationListResponse(
    val notifications: List<NotificationResponse>,
    val page: Int,
    val pageSize: Int,
    val totalCount: Int,
    val unreadCount: Int = 0
)

data class BulkReadRequest(
    val notificationIds: List<String>
)