package com.mckimquyen.libresudoku.domain.usecase.board

import com.mckimquyen.libresudoku.data.db.model.SudokuBoard
import com.mckimquyen.libresudoku.domain.repository.BoardRepository
import javax.inject.Inject

class DeleteBoardUseCase @Inject constructor(
    private val boardRepository: BoardRepository,
) {
    suspend operator fun invoke(board: SudokuBoard) = boardRepository.delete(board)
}