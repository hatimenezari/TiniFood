import datasource.local.entities.PromotionEntity

data class Promotion(
    val id: Int,
    val uri: String = "https://raw.githubusercontent.com/hatimenezari/TiniFood/247a754d322694b3a49885af944354fba3e2d2b1/promoImg.png"
)

fun PromotionEntity.toDomainModel() = Promotion(id, uri)
fun Promotion.toEntity() = PromotionEntity(id, uri)