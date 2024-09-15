package datasource.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "promotions")
data class PromotionEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val uri: String
)