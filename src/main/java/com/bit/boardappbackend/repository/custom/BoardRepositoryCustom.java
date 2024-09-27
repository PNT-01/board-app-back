package com.bit.boardappbackend.repository.custom;

import com.bit.boardappbackend.entity.Board;
import com.bit.boardappbackend.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Range;

import java.util.List;

public interface BoardRepositoryCustom {
    Page<Board> searchAll(String searchCondition, String searchKeyword, Pageable pageable);

    Page<Board> findAllByMember(Member member, Pageable pageable);
}
