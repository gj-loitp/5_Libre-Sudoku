package com.roy93group.libresudoku.data.database.repository

import com.roy93group.libresudoku.data.database.dao.FolderDao
import com.roy93group.libresudoku.data.database.model.Folder
import com.roy93group.libresudoku.data.database.model.SavedGame
import com.roy93group.libresudoku.domain.repository.FolderRepository
import kotlinx.coroutines.flow.Flow

class FolderRepositoryImpl(
    private val folderDao: FolderDao,
) : FolderRepository {
    override fun getAll(): Flow<List<Folder>> = folderDao.get()

    override fun get(uid: Long): Flow<Folder> = folderDao.get(uid)

    override fun countPuzzlesFolder(uid: Long): Long = folderDao.countPuzzlesFolder(uid)

    override fun getLastSavedGamesAnyFolder(gamesCount: Int): Flow<List<SavedGame>> =
        folderDao.getLastSavedGamesAnyFolder(gamesCount)

    override suspend fun insert(folder: Folder): Long = folderDao.insert(folder)

    override suspend fun update(folder: Folder) = folderDao.update(folder)

    override suspend fun delete(folder: Folder) = folderDao.delete(folder)
}
