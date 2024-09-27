package com.bit.boardappbackend.repository;

import com.bit.boardappbackend.entity.Board;
import com.bit.boardappbackend.entity.Member;
import com.bit.boardappbackend.repository.custom.BoardRepositoryCustom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Range;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardRepositoryCustom {
    Page<Board> findAllByMember(Member member, Pageable pageable);
}
