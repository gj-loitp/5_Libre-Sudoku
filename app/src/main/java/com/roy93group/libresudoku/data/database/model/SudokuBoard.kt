package com.roy93group.libresudoku.data.database.model

import androidx.annotation.Keep
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.roy93group.libresudoku.core.qqwing.GameDifficulty
import com.roy93group.libresudoku.core.qqwing.GameType

@Keep
@Entity(
    tableName = "board",
    foreignKeys = [
        ForeignKey(
            onDelete = ForeignKey.CASCADE,
            entity = Folder::class,
            parentColumns = arrayOf("uid"),
            childColumns = arrayOf("folder_id")
        )
    ]
)
data class SudokuBoard(
    @PrimaryKey(autoGenerate = true) val uid: Long,
    @ColumnInfo(name = "initial_board") val initialBoard: String,
    @ColumnInfo(name = "solved_board") val solvedBoard: String,
    @ColumnInfo(name = "difficulty") val difficulty: GameDifficulty,
    @ColumnInfo(name = "type") val type: GameType,
    @ColumnInfo(name = "folder_id", defaultValue = "null") val folderId: Long? = null,
)
